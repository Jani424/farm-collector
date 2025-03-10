package com.farm_collector.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farm_collector.dto.CropWiseResponse;
import com.farm_collector.dto.FarmWiseResponse;
import com.farm_collector.repo.PlantedRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ReportsServiceImpl implements ReportsService{

	@Autowired
	PlantedRepository repo;
	
	@Override
	public List<FarmWiseResponse> getFarmWiseDetails(Integer seasonId) {
		List<FarmWiseResponse> responseList = repo.getFarmWiseDetails(seasonId);
		return responseList;
	}

	@Override
	public List<CropWiseResponse> getCropWiseDetails(Integer seasonId) {
		List<CropWiseResponse> responseList = repo.getCropWiseDetails(seasonId);
		return responseList;
	}

}
