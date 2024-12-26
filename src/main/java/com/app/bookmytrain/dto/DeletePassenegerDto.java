package com.app.bookmytrain.dto;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DeletePassenegerDto
{
	private int id;
	private LocalDate dateOfTravelling;


	public DeletePassenegerDto() {
		super();
	}


	public DeletePassenegerDto(int id, LocalDate dateOfTravelling) {
		this.id = id;
		this.dateOfTravelling = dateOfTravelling;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDateOfTravelling() {
		return dateOfTravelling;
	}

	public void setDateOfTravelling(LocalDate dateOfTravelling) {
		this.dateOfTravelling = dateOfTravelling;
	}
}
