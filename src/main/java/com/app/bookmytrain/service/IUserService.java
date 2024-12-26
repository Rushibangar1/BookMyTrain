package com.app.bookmytrain.service;

import com.app.bookmytrain.dto.LoginUserDto;
import com.app.bookmytrain.dto.PassengerDto;
import com.app.bookmytrain.entities.Passenger;
import com.app.bookmytrain.entities.Ticket;
import com.app.bookmytrain.entities.User;

import java.util.List;

public interface IUserService {

	List<User> findAll();
	
	User findById(int id);
	
	User findByIdUser(int id);
	
	User findByEmail(String email);
	
	User forgetPassword(LoginUserDto dto);
	
	User authenticateUser(LoginUserDto loginUser);
	
	int deleteById(int id);
	
	User save(User user);
	
	List<Passenger> addPassengerList(PassengerDto[] list);
	int setFareForTicket(PassengerDto[] list, int ticketId);
	List<Ticket> getListOfTicket(int id);
	
	
}
