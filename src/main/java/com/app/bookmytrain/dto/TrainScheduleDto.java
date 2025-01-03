package com.app.bookmytrain.dto;


import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component

public class TrainScheduleDto
{
	private int id;
	private int trainId;
	private LocalDate dateOfTravelling;
	private String seatClassName;
	private int seatingSeatCount;
	private int sleeperSeatCount;
	private int seatingSeatPrice;
	private int sleeperSeatPrice;
	private int totalSeatCount;

	public TrainScheduleDto() {
		super();
	}

	public TrainScheduleDto(int id, int trainId, LocalDate dateOfTravelling, String seatClassName, int seatingSeatCount, int sleeperSeatCount, int seatingSeatPrice, int sleeperSeatPrice, int totalSeatCount) {
		this.id = id;
		this.trainId = trainId;
		this.dateOfTravelling = dateOfTravelling;
		this.seatClassName = seatClassName;
		this.seatingSeatCount = seatingSeatCount;
		this.sleeperSeatCount = sleeperSeatCount;
		this.seatingSeatPrice = seatingSeatPrice;
		this.sleeperSeatPrice = sleeperSeatPrice;
		this.totalSeatCount = totalSeatCount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTrainId() {
		return trainId;
	}

	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}

	public LocalDate getDateOfTravelling() {
		return dateOfTravelling;
	}

	public void setDateOfTravelling(LocalDate dateOfTravelling) {
		this.dateOfTravelling = dateOfTravelling;
	}

	public String getSeatClassName() {
		return seatClassName;
	}

	public void setSeatClassName(String seatClassName) {
		this.seatClassName = seatClassName;
	}

	public int getSeatingSeatCount() {
		return seatingSeatCount;
	}

	public void setSeatingSeatCount(int seatingSeatCount) {
		this.seatingSeatCount = seatingSeatCount;
	}

	public int getSleeperSeatCount() {
		return sleeperSeatCount;
	}

	public void setSleeperSeatCount(int sleeperSeatCount) {
		this.sleeperSeatCount = sleeperSeatCount;
	}

	public int getSeatingSeatPrice() {
		return seatingSeatPrice;
	}

	public void setSeatingSeatPrice(int seatingSeatPrice) {
		this.seatingSeatPrice = seatingSeatPrice;
	}

	public int getSleeperSeatPrice() {
		return sleeperSeatPrice;
	}

	public void setSleeperSeatPrice(int sleeperSeatPrice) {
		this.sleeperSeatPrice = sleeperSeatPrice;
	}

	public int getTotalSeatCount() {
		return totalSeatCount;
	}

	public void setTotalSeatCount(int totalSeatCount) {
		this.totalSeatCount = totalSeatCount;
	}
}

