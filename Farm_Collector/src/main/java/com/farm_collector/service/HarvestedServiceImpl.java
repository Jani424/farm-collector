package com.farm_collector.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farm_collector.dto.HarvestedRequest;
import com.farm_collector.model.Harvested;
import com.farm_collector.repo.HarvestedRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class HarvestedServiceImpl implements HarvestedService {

	@Autowired
	HarvestedRepository repo;
	
	@Override
	public void save(HarvestedRequest request) {
		Harvested harvestedObj = new Harvested();
		harvestedObj.setActualProdInTons(request.getActualProdInTons());
		harvestedObj.setCrop(request.getCrop());
		harvestedObj.setFarmId(request.getFarmId());
		harvestedObj.setSeason(request.getSeason());
		harvestedObj.setPlantedId(request.getPlantedId());
		
		repo.save(harvestedObj);
	}

}
