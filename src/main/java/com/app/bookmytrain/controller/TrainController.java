package com.app.bookmytrain.controller;

import com.app.bookmytrain.dto.StartAndDestCityDto;
import com.app.bookmytrain.entities.Train;
import com.app.bookmytrain.entities.TrainSchedule;
import com.app.bookmytrain.service.ITrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.TreeSet;

@CrossOrigin
@RestController
@RequestMapping("/trains")
public class TrainController
{
	@Autowired
	private ITrainService trainService;

	// get details of all trains
	@GetMapping("/find-all")
	public ResponseEntity<?> findAll()
	{
		List<Train> list = trainService.findAll();
		if (list.isEmpty())
			return Response.status(HttpStatus.NOT_FOUND);
		return Response.success(list);

	}

	@GetMapping("/find-by-id/{id}")
	public ResponseEntity<?> findById(@PathVariable("id") int id)
	{
		Train train = trainService.findById(id);
		if (train == null)
			return Response.status(HttpStatus.NOT_FOUND);
		return Response.success(train);
	}

	@DeleteMapping("/delete-by-id/{id}")
	public ResponseEntity<?> deleteById(@PathVariable("id") int id)
	{
		int noOfRowsDeleted = trainService.deleteById(id);
		if (noOfRowsDeleted == 0)
			return Response.status(HttpStatus.NOT_FOUND);
		return Response.success("no. of rows deleted is " + noOfRowsDeleted);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<?> save(@PathVariable("id") int id, @RequestBody Train train)
	{
		train.setId(id);
		Train train2 = trainService.save(train);
		if (train2 == null)
			return Response.status(HttpStatus.NOT_FOUND);
		return Response.success(train2);
	}

	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody Train t)
	{
		Train train = trainService.saveWithTotalCount(t);

		if (train == null)
			return Response.status(HttpStatus.NOT_FOUND);
		return Response.success(train);
	}
	
	// method for showing schedule(dates) of train ;
	@GetMapping("/list-of-train-schedule/{id}")
	public ResponseEntity<?> listOfCompartments(@PathVariable("id") int id)
	{
		List<TrainSchedule> listOfTrainSchedule = trainService.getListOfTrainSchedule(id);
		if (listOfTrainSchedule == null)
			return Response.status(HttpStatus.NOT_FOUND);
		return Response.success(listOfTrainSchedule);
	}

	@GetMapping("/from")
	public ResponseEntity<?> listOfstartCity()
	{
		System.out.println("from called");
		List<String> list = trainService.listOfstartCity();
		if (!list.isEmpty())
			return Response.success(list);
		return Response.error("Not found");
	}

	@GetMapping("/to/{from}")
	public ResponseEntity<?> listOfdestCity(@PathVariable("from") String sourceCity)
	{
		System.out.println("to called");
		List<String> list = trainService.listOfdestCity(sourceCity);
		if (!list.isEmpty())
			return Response.success(list);
		return Response.error("Not found..!!");
	}

	@PostMapping("/list-of-trains")
	public ResponseEntity<?> listOfTrains(@RequestBody StartAndDestCityDto dto)
	{
		System.out.println("list of trains called");
		Train train = trainService.specificTrain(dto);
		if (train != null)
			return Response.success(train);
		return Response.error("Train not found");
	}

	@GetMapping("/select-date/{id}")
	public ResponseEntity<?> selectDate(@PathVariable("id") int id)
	{
		System.out.println("Dates called");
		TreeSet<LocalDate> dates = trainService.selectDate(id);
		if (!dates.isEmpty())
			return Response.success(dates);
		return Response.error("Dates are not available..!!");
	}


}
