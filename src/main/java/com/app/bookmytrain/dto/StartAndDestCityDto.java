package com.app.bookmytrain.dto;

import org.springframework.stereotype.Component;

@Component

public class StartAndDestCityDto
{
	private String startCity;
	private String destCity;

	public StartAndDestCityDto() {
	super();
	}

	public StartAndDestCityDto(String startCity, String destCity) {
		this.startCity = startCity;
		this.destCity = destCity;
	}

	public String getStartCity() {
		return startCity;
	}

	public void setStartCity(String startCity) {
		this.startCity = startCity;
	}

	public String getDestCity() {
		return destCity;
	}

	public void setDestCity(String destCity) {
		this.destCity = destCity;
	}
}
