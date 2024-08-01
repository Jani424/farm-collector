package com.farm_collector.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farm_collector.dto.HarvestedRequest;
import com.farm_collector.service.HarvestedService;

@RestController
@RequestMapping("/api/v1")
public class HarvestedController {
	
	@Autowired
	HarvestedService service;
	
	@PostMapping("/saveHarvestedCrop")
	public void saveHarvested(@RequestBody HarvestedRequest request) {
		
		service.save(request);
		
	}
}
