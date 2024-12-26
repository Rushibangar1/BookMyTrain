package com.app.bookmytrain.service;

import com.app.bookmytrain.entities.Ticket;

import java.util.List;

public interface ITicketService {
	
	List<Ticket> findAll();
	Ticket save(Ticket t);
	Ticket findById(int id);
	int deleteTicket(int id);

}
