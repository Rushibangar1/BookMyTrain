package com.app.bookmytrain.dto;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class PassengerDto
{
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private String seatClassName;
	private String innerType;
	private LocalDate dateOfTravelling;
	private int userId;
	private int trainId;
	private int ticketId;

	public PassengerDto() {
		super();
	}

	public PassengerDto(int id, String firstName, String lastName, int age, String gender, String seatClassName, String innerType, LocalDate dateOfTravelling, int userId, int trainId, int ticketId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.seatClassName = seatClassName;
		this.innerType = innerType;
		this.dateOfTravelling = dateOfTravelling;
		this.userId = userId;
		this.trainId = trainId;
		this.ticketId = ticketId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSeatClassName() {
		return seatClassName;
	}

	public void setSeatClassName(String seatClassName) {
		this.seatClassName = seatClassName;
	}

	public String getInnerType() {
		return innerType;
	}

	public void setInnerType(String innerType) {
		this.innerType = innerType;
	}

	public LocalDate getDateOfTravelling() {
		return dateOfTravelling;
	}

	public void setDateOfTravelling(LocalDate dateOfTravelling) {
		this.dateOfTravelling = dateOfTravelling;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getTrainId() {
		return trainId;
	}

	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
}
