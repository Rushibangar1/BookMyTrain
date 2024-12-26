package com.app.bookmytrain.controller;

import com.app.bookmytrain.dto.DeletePassenegerDto;
import com.app.bookmytrain.dto.DtoEntityConvertor;
import com.app.bookmytrain.dto.PassengerDto;
import com.app.bookmytrain.entities.Passenger;
import com.app.bookmytrain.service.IPassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/passengers")
public class PassengerController
{
	@Autowired
	private IPassengerService passengerService;

	@GetMapping("/find-all")
	public ResponseEntity<?> findAll()
	{
		List<Passenger> list = passengerService.findAll();
		if (list.isEmpty())
			return Response.status(HttpStatus.NOT_FOUND);
		return Response.success(list);
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable("id") int id)
	{
		Passenger findById = passengerService.findById(id);
		if (findById == null)
			return Response.status(HttpStatus.NOT_FOUND);
		return Response.success(findById);
	}

	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody PassengerDto dto)
	{
		Passenger passenger = DtoEntityConvertor.fromPassengerDto(dto);
		Passenger passengerToSave = passengerService.save(passenger);
		if (passengerToSave == null)
			return Response.status(HttpStatus.NOT_FOUND);
		return Response.success(passengerToSave);
	}

	
	@DeleteMapping("/delete-by-user-id")
	public ResponseEntity<?> deleteByUserIdAndDate(@RequestBody DeletePassenegerDto dto)
	{
		boolean flag = passengerService.deleteByUserIdAndDate(dto);
		if (flag)
			return Response.success("DeletedeSuccessfully..!!");
		return Response.status(HttpStatus.NOT_FOUND);
	}



}
