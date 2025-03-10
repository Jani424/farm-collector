package com.farm_collector.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farm_collector.model.Harvested;

@Repository
public interface HarvestedRepository extends JpaRepository<Harvested, Integer>{

}
