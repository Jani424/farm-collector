package com.farm_collector.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.farm_collector.dto.CropWiseResponse;
import com.farm_collector.dto.FarmWiseResponse;
import com.farm_collector.model.Planted;

@Repository
public interface PlantedRepository extends JpaRepository<Planted, Integer>{

	@Query(value="select p.farm_id,\r\n"
			+ "    p.crop_id,\r\n"
			+ "    p.season_id,\r\n"
			+ "    SUM(p.expected_product_tons) AS total_expected,\r\n"
			+ "    SUM(h.actual_product_tons) AS total_actual from Planted p, Harvested h where p.planted_id=h.planted_id and p.season_id= ?1 GROUP BY \r\n"
			+ "    p.farm_id, p.crop_id, p.season_id", nativeQuery = true)
	List<FarmWiseResponse> getFarmWiseDetails(Integer seasonId);

	@Query(value="select p.crop_id,p.season_id,SUM(p.expected_product_tons) AS total_expected,SUM(h.actual_product_tons) AS total_actual from Planted p, Harvested h where p.planted_id=h.planted_id and p.season_id=?1 group by p.crop_id,p.season_id", nativeQuery = true)
	List<CropWiseResponse> getCropWiseDetails(Integer seasonId);

}
