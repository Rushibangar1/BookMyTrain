package com.app.bookmytrain.dao;

import com.app.bookmytrain.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Integer>
{
	Ticket findById(int id);
}
