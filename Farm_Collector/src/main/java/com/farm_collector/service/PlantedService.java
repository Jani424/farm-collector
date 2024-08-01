package com.farm_collector.service;

import org.springframework.stereotype.Service;

import com.farm_collector.dto.PlantedRequest;

@Service
public interface PlantedService {

	void save(PlantedRequest request);

}
