package com.farm_collector.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.farm_collector.dto.CropWiseResponse;
import com.farm_collector.dto.FarmWiseResponse;

@Service
public interface ReportsService {

	List<FarmWiseResponse> getFarmWiseDetails(Integer seasonId);

	List<CropWiseResponse> getCropWiseDetails(Integer seasonId);

}
