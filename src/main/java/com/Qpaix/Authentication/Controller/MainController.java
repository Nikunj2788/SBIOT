package com.Qpaix.Authentication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Qpaix.Authentication.Entity.Flow;
import com.Qpaix.Authentication.Entity.LocationMaster;
import com.Qpaix.Authentication.Entity.Pump;
import com.Qpaix.Authentication.Entity.TDSAndPHCount;
import com.Qpaix.Authentication.Entity.User;
import com.Qpaix.Authentication.Service.FlowService;
import com.Qpaix.Authentication.Service.LevelService;
import com.Qpaix.Authentication.Service.LocationService;
import com.Qpaix.Authentication.Service.PumpService;
import com.Qpaix.Authentication.Service.TDSAndPHCountService;
import com.Qpaix.Authentication.Service.UserService;

import ch.qos.logback.classic.Level;

@RestController
@RequestMapping("/api")
public class MainController {

	@Autowired
	private FlowService flowService;

	@Autowired
	private LevelService levelService;

	@Autowired
	private PumpService pumpService;

	@Autowired
	private TDSAndPHCountService tdsAndPHCountService;

	@Autowired
	private LocationService locationService;

	@Autowired
	private UserService userService;

	@PostMapping("/Flow/Save")
	public ResponseEntity<String> saveDeviceData(@Validated @RequestBody Flow deviceData, BindingResult bindingResult) {
		try {
			flowService.saveFlowData(deviceData);
			return ResponseEntity.ok("Flow data saved successfully");
		} catch (RuntimeException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@PostMapping("/Level/Save")
	public ResponseEntity<String> saveLevelData(@RequestBody Level LevelData) {
		try {
			levelService.saveLevelData(LevelData);
			return ResponseEntity.ok("Level data saved successfully");
		} catch (RuntimeException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@PostMapping("/Pump/Save")
	public ResponseEntity<String> savepumpData(@RequestBody Pump PumpData) {
		try {
			pumpService.savePumpData(PumpData);
			return ResponseEntity.ok("Pump data saved successfully");
		} catch (RuntimeException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@PostMapping("/PHCount/Save")
	public ResponseEntity<String> savePHCountData(@RequestBody TDSAndPHCount tdsAndPHCount) {
		try {
			tdsAndPHCountService.TDAPHCoutn(tdsAndPHCount);
			return ResponseEntity.ok("TDSAndPHCount data saved successfully");
		} catch (RuntimeException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@PostMapping("/LocationMaster/Save")
	public ResponseEntity<String> saveLocationData(@RequestBody LocationMaster locationData) {
		try {
			locationService.saveLocationData(locationData);
			return ResponseEntity.ok("Location data saved successfully");
		} catch (RuntimeException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@PostMapping("/User/Register")
	public ResponseEntity<User> registerUser(@RequestBody User user) {
		try {
			User registeredUser = userService.registerUser(user);
			return ResponseEntity.ok(registeredUser);
		} catch (Exception e) {
			return ResponseEntity.badRequest().build();
		}
	}
	

}
