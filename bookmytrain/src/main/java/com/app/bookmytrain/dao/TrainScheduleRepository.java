package com.app.bookmytrain.dao;

import com.app.bookmytrain.entities.TrainSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TrainScheduleRepository extends JpaRepository<TrainSchedule, Integer>
{
	List<TrainSchedule> findByTrainIdAndDateOfTravelling(int id, LocalDate date);;
}
