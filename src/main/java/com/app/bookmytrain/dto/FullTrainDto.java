package com.app.bookmytrain.dto;

import org.springframework.stereotype.Component;

import java.sql.Time;

@Component
public class FullTrainDto
{
	private int id;
	private String trainName;
	private String startCity;
	private String destCity;
	private Time departureTime;
//	private int seatingSeatCount;
//	private int sleeperSeatCount;
	private int AcSeatingSeatPrice;
	private int AcSleeperSeatPrice;
	private int NonAcSeatingSeatPrice;
	private int NonAcSleeperSeatPrice;

	public FullTrainDto() {
	super();
	}

	public FullTrainDto(int id, String trainName, String startCity, String destCity, Time departureTime, int acSeatingSeatPrice, int acSleeperSeatPrice, int nonAcSeatingSeatPrice, int nonAcSleeperSeatPrice) {
		this.id = id;
		this.trainName = trainName;
		this.startCity = startCity;
		this.destCity = destCity;
		this.departureTime = departureTime;
		AcSeatingSeatPrice = acSeatingSeatPrice;
		AcSleeperSeatPrice = acSleeperSeatPrice;
		NonAcSeatingSeatPrice = nonAcSeatingSeatPrice;
		NonAcSleeperSeatPrice = nonAcSleeperSeatPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
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

	public Time getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}

	public int getAcSeatingSeatPrice() {
		return AcSeatingSeatPrice;
	}

	public void setAcSeatingSeatPrice(int acSeatingSeatPrice) {
		AcSeatingSeatPrice = acSeatingSeatPrice;
	}

	public int getAcSleeperSeatPrice() {
		return AcSleeperSeatPrice;
	}

	public void setAcSleeperSeatPrice(int acSleeperSeatPrice) {
		AcSleeperSeatPrice = acSleeperSeatPrice;
	}

	public int getNonAcSeatingSeatPrice() {
		return NonAcSeatingSeatPrice;
	}

	public void setNonAcSeatingSeatPrice(int nonAcSeatingSeatPrice) {
		NonAcSeatingSeatPrice = nonAcSeatingSeatPrice;
	}

	public int getNonAcSleeperSeatPrice() {
		return NonAcSleeperSeatPrice;
	}

	public void setNonAcSleeperSeatPrice(int nonAcSleeperSeatPrice) {
		NonAcSleeperSeatPrice = nonAcSleeperSeatPrice;
	}
}
