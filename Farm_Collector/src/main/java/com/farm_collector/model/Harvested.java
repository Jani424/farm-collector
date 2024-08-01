package com.farm_collector.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "harvested")
public class Harvested {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer harvested_id;
	
	@Column(name = "planted_id")
	private Integer plantedId;
	@Column(name = "farm_id")
	private Integer farmId;
	@Column(name = "season_id")
	private Integer season;
	@Column(name = "crop_id")
	private Integer crop;
	@Column(name = "actual_product_tons")
	private Float actualProdInTons;
	
	
	public Integer getPlantedId() {
		return plantedId;
	}
	public void setPlantedId(Integer plantedId) {
		this.plantedId = plantedId;
	}
	public Integer getHarvested_id() {
		return harvested_id;
	}
	public void setHarvested_id(Integer harvested_id) {
		this.harvested_id = harvested_id;
	}
	public Integer getFarmId() {
		return farmId;
	}
	public void setFarmId(Integer farmId) {
		this.farmId = farmId;
	}
	public Integer getSeason() {
		return season;
	}
	public void setSeason(Integer season) {
		this.season = season;
	}
	public Integer getCrop() {
		return crop;
	}
	public void setCrop(Integer crop) {
		this.crop = crop;
	}
	public Float getActualProdInTons() {
		return actualProdInTons;
	}
	public void setActualProdInTons(Float actualProdInTons) {
		this.actualProdInTons = actualProdInTons;
	}

}
