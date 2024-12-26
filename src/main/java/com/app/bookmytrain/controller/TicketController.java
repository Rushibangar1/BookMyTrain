package com.app.bookmytrain.controller;

import com.app.bookmytrain.entities.Ticket;
import com.app.bookmytrain.service.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/tickets")
public class TicketController
{


	@Autowired
	private ITicketService ticketServise;

	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody Ticket t)
	{
		Ticket ticket = ticketServise.save(t);
		if (ticket != null)
			return Response.success(t);
		return Response.error("Nod added..!!");
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteTicket(@PathVariable int id)
	{
		int noOfRowsDeleted = ticketServise.deleteTicket(id);
		return Response.success("No of rows deleted " + noOfRowsDeleted);
	}

	

}
