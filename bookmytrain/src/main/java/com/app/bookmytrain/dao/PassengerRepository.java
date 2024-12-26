package com.app.bookmytrain.dao;

import com.app.bookmytrain.entities.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PassengerRepository extends JpaRepository<Passenger, Integer>
{
	Passenger findById(int id);

	List<Passenger> findByDateOfTravelling(LocalDate date);
}
