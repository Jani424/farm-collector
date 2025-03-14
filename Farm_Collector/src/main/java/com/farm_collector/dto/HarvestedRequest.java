package com.farm_collector.dto;

public class HarvestedRequest {

	private Integer plantedId;
	private Integer farmId;
	private Integer season;
	private Integer crop;
	private Float actualProdInTons;
	
	public Integer getPlantedId() {
		return plantedId;
	}
	public void setPlantedId(Integer plantedId) {
		this.plantedId = plantedId;
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
