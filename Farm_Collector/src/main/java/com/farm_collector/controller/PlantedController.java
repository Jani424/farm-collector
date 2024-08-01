package com.farm_collector.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farm_collector.dto.PlantedRequest;
import com.farm_collector.service.PlantedService;

@RestController
@RequestMapping("/api/v1")
public class PlantedController {
	
	@Autowired
	PlantedService service;
	
	@PostMapping("/savePlantedCrop")
	public void savePlanted(@RequestBody PlantedRequest request) {
		
		service.save(request);
		
		
	}

}
