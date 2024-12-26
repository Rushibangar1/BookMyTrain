package com.app.bookmytrain.service;

import com.app.bookmytrain.dao.TicketRepository;
import com.app.bookmytrain.entities.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class TicketServiceImpl implements ITicketService
{
	@Autowired
	private TicketRepository ticketRepo;
	
	@Override
	public List<Ticket> findAll()
	{
		return ticketRepo.findAll();
	}
	
	@Override
	public Ticket save(Ticket t)
	{
		return ticketRepo.save(t);
	}

	@Override
	public Ticket findById(int id)
	{
		return ticketRepo.findById(id);
	}
	
	@Override
	public int deleteTicket(int id)
	{
		ticketRepo.deleteById(id);
		return 1;
	}
	
}
