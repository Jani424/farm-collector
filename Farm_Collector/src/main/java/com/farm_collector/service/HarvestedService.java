package com.farm_collector.service;

import org.springframework.stereotype.Service;

import com.farm_collector.dto.HarvestedRequest;

@Service
public interface HarvestedService {

	void save(HarvestedRequest request);

}
