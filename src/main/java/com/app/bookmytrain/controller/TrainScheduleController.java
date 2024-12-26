package com.app.bookmytrain.controller;

import com.app.bookmytrain.dto.AddScheduleDto;
import com.app.bookmytrain.dto.TrainScheduleDto;
import com.app.bookmytrain.entities.TrainSchedule;
import com.app.bookmytrain.service.ITrainScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/train-schedule")
public class TrainScheduleController
{
	@Autowired
	private ITrainScheduleService trainScheduleService;

	
	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody TrainScheduleDto dto)
	{
		TrainSchedule trainSchedule = trainScheduleService.save(dto);
		return Response.success(trainSchedule);
	}

	@PostMapping("/add-schedule")
	public ResponseEntity<?> addSchedule(@RequestBody AddScheduleDto dto)
	{
		boolean isAvailable = trainScheduleService.isTrainScheduleAvailable(dto);
		if (isAvailable)
		{
			TrainSchedule ac = trainScheduleService.addScheduleForAc(dto);
			TrainSchedule nonAc = trainScheduleService.addScheduleForNonAc(dto);
			if (ac != null && nonAc != null)
				return Response.success(ac);
		}
		return Response.error("Schedule already present..!!");
	}

	

}
