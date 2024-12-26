package com.app.bookmytrain.service;

import com.app.bookmytrain.dto.StartAndDestCityDto;
import com.app.bookmytrain.entities.Train;
import com.app.bookmytrain.entities.TrainSchedule;

import java.time.LocalDate;
import java.util.List;
import java.util.TreeSet;

public interface ITrainService {
	
	List<Train> findAll();
	Train findById(int id);
	int deleteById(int id);
	Train save(Train t);
	Train saveWithTotalCount(Train t);
	List<TrainSchedule> getListOfTrainSchedule(int id);
	Train specificTrain(StartAndDestCityDto dto);
	List<String> listOfdestCity(String from);
	List<String> listOfstartCity();
	TreeSet<LocalDate> selectDate(int id);
	

}
