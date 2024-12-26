package com.app.bookmytrain.service;

import com.app.bookmytrain.dto.DeletePassenegerDto;
import com.app.bookmytrain.entities.Passenger;

import java.time.LocalDate;
import java.util.List;

public interface IPassengerService {
	
	List<Passenger> findAll();
	Passenger findById(int id);
	List<Passenger> findByDateOfTravelling(LocalDate date);
	Passenger save(Passenger p);
	void deleteById(int id);
	boolean deleteByUserIdAndDate(DeletePassenegerDto dto);
	List<Passenger> listByUserIdAndDate(DeletePassenegerDto dto);

}
