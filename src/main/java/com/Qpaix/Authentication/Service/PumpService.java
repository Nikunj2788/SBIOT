package com.Qpaix.Authentication.Service;

import java.lang.reflect.Field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.Qpaix.Authentication.Entity.Pump;
import com.Qpaix.Authentication.Repo.PumpRepository;

@Service
public class PumpService {
	@Autowired
	private PumpRepository pumpRepository;

	public void savePumpData(Pump pumpData) {
		// Use reflection to check for null values
		Field[] fields = Pump.class.getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			try {
				if (field.get(pumpData) == null) {
					throw new RuntimeException(" parameters is missing");
				}
			} catch (IllegalAccessException e) {
				// Handle reflection exception if needed
				throw new RuntimeException("An error occurred while checking parameters");
			}
		}

		try {
			pumpRepository.save(pumpData);
		} catch (DataIntegrityViolationException e) {
			throw new RuntimeException("Parameter mismatch: " + e.getMessage());
		} catch (Exception e) {
			throw new RuntimeException("An error occurred while saving pump data");
		}
	}
}
