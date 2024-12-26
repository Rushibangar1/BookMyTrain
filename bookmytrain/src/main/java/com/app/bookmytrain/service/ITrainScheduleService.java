package com.app.bookmytrain.service;

import com.app.bookmytrain.dto.AddScheduleDto;
import com.app.bookmytrain.dto.TrainScheduleDto;
import com.app.bookmytrain.entities.TrainSchedule;

import java.util.List;

public interface ITrainScheduleService {
	
	List<TrainSchedule> findAll();
	TrainSchedule save(TrainScheduleDto dto);
	TrainSchedule addScheduleForAc(AddScheduleDto dto);
	TrainSchedule addScheduleForNonAc(AddScheduleDto dto);
	boolean isTrainScheduleAvailable(AddScheduleDto dto);

}
