package com.Qpaix.Authentication.Service;

import java.lang.reflect.Field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.Qpaix.Authentication.Entity.TDSAndPHCount;
import com.Qpaix.Authentication.Repo.TDSAndPHCountRepository;

@Service
public class TDSAndPHCountService {

	@Autowired
	private TDSAndPHCountRepository tdsAndPHCountRepository;

	public void TDAPHCoutn(TDSAndPHCount tdsAndPHCount) {
		Field[] fields = TDSAndPHCount.class.getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			try {
				if (field.get(tdsAndPHCount) == null) {
					throw new RuntimeException("parameters is missing");
				}
			} catch (IllegalAccessException e) {
				throw new RuntimeException("An error occurred while checking parameters");
			}
		}

		try {
			tdsAndPHCountRepository.save(tdsAndPHCount);
		} catch (DataIntegrityViolationException e) {
			throw new RuntimeException("Parameter mismatch: " + e.getMessage());
		} catch (Exception e) {
			throw new RuntimeException("An error occurred while saving TDS and PH Count data");
		}
	}
}
