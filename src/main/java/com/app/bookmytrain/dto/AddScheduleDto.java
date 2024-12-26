package com.app.bookmytrain.dto;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class AddScheduleDto
{
	private int trainId;
	private LocalDate dateOfTravelling;

	public AddScheduleDto() {
	super();
	}

	public AddScheduleDto(int trainId, LocalDate dateOfTravelling) {
		this.trainId = trainId;
		this.dateOfTravelling = dateOfTravelling;
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
}
