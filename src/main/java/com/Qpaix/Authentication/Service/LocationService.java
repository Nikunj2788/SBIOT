package com.Qpaix.Authentication.Service;

import java.lang.reflect.Field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.Qpaix.Authentication.Entity.LocationMaster;
import com.Qpaix.Authentication.Repo.LocationRepository;


@Service
public class LocationService {

    private final LocationRepository locationRepository;

    @Autowired
    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public void saveLocationData(LocationMaster locationData) {
        // Use reflection to check for null values
        Field[] fields = LocationMaster.class.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                if (field.get(locationData) == null) {
                    throw new RuntimeException(field.getName() + " is missing");
                }
            } catch (IllegalAccessException e) {
                // Handle reflection exception if needed
                throw new RuntimeException("An error occurred while checking parameters");
            }
        }

        try {
            locationRepository.save(locationData);
        } catch (DataIntegrityViolationException e) {
            throw new RuntimeException("Parameter mismatch: " + e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("An error occurred while saving location data");
        }
    }
}

