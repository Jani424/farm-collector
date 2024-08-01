package com.farm_collector.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farm_collector.dto.CropWiseResponse;
import com.farm_collector.dto.FarmWiseResponse;
import com.farm_collector.service.ReportsService;

@RestController
@RequestMapping("/api/v1")
public class ReportsController {
	
	@Autowired
	ReportsService service;
	
	@GetMapping("/getFarmWiseDetails/{seasonId}")
	public List<FarmWiseResponse> getFarmWiseDetails(@PathVariable("seasonId") Integer seasonId){
		List<FarmWiseResponse> response = service.getFarmWiseDetails(seasonId);
		return response;
		
	}

	@GetMapping("/getCropWiseDetails/{seasonId}")
	public List<CropWiseResponse> getCropWiseDetails(@PathVariable("seasonId") Integer seasonId){
		List<CropWiseResponse> response = service.getCropWiseDetails(seasonId);
		return response;
		
	}
}
