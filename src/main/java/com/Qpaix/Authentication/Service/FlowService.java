package com.Qpaix.Authentication.Service;

import java.lang.reflect.Field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.Qpaix.Authentication.Entity.Flow;
import com.Qpaix.Authentication.Repo.FlowRepository;


@Service
public class FlowService {

	@Autowired
	private FlowRepository flowRepository;

	  public void saveFlowData(Flow flowdata) {
	        // Use reflection to check for null values
	        Field[] fields = Flow.class.getDeclaredFields();
	        for (Field field : fields) {
	            field.setAccessible(true);
	            try {
	                if (field.get(flowdata) == null) {
	                    throw new RuntimeException("One or more parameters are null");
	                }
	            } catch (IllegalAccessException e) {
	                // Handle reflection exception if needed
	                throw new RuntimeException("An error occurred while checking parameters");
	            }
	        }

	        try {
	            flowRepository.save(flowdata);
	        } catch (DataIntegrityViolationException e) {
	            throw new RuntimeException("Parameter mismatch: " + e.getMessage());
	        } catch (Exception e) {
	            throw new RuntimeException("An error occurred while saving device data");
	        }
	    }

}
