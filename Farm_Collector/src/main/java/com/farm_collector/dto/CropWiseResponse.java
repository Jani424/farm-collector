package com.farm_collector.dto;

public class CropWiseResponse {

	private Integer crop_id;
	private Integer season_id;
	private Float total_expected;
	private Float total_actual;
	
	public CropWiseResponse(int crop_id, int season_id) {
		// TODO Auto-generated constructor stub
	}
	public Integer getCrop_id() {
		return crop_id;
	}
	public void setCrop_id(Integer crop_id) {
		this.crop_id = crop_id;
	}
	public Integer getSeason_id() {
		return season_id;
	}
	public void setSeason_id(Integer season_id) {
		this.season_id = season_id;
	}
	public Float getTotal_expected() {
		return total_expected;
	}
	public void setTotal_expected(Float total_expected) {
		this.total_expected = total_expected;
	}
	public Float getTotal_actual() {
		return total_actual;
	}
	public void setTotal_actual(Float total_actual) {
		this.total_actual = total_actual;
	}
	
}
