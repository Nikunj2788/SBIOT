package com.Qpaix.Authentication.Service;

import java.lang.reflect.Field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.Qpaix.Authentication.Repo.LevelRepository;

import ch.qos.logback.classic.Level;


@Service
public class LevelService {

	@Autowired
	private LevelRepository levelRepository;

	 public void saveLevelData(Level levelData) {
	        // Use reflection to check for null values
	        Field[] fields = Level.class.getDeclaredFields();
	        for (Field field : fields) {
	            field.setAccessible(true);
	            try {
	                if (field.get(levelData) == null) {
	                    throw new RuntimeException("parameters missing");
	                }
	            } catch (IllegalAccessException e) {
	                // Handle reflection exception if needed
	                throw new RuntimeException("An error occurred while checking parameters");
	            }
	        }

	        try {
	            levelRepository.save(levelData);
	        } catch (DataIntegrityViolationException e) {
	            throw new RuntimeException("Parameter mismatch: " + e.getMessage());
	        } catch (Exception e) {
	            throw new RuntimeException("An error occurred while saving level data");
	        }
	    }
}
