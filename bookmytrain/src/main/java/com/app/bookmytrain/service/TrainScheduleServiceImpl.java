package com.app.bookmytrain.service;

import com.app.bookmytrain.dao.TrainRepository;
import com.app.bookmytrain.dao.TrainScheduleRepository;
import com.app.bookmytrain.dto.AddScheduleDto;
import com.app.bookmytrain.dto.DtoEntityConvertor;
import com.app.bookmytrain.dto.TrainScheduleDto;
import com.app.bookmytrain.entities.Train;
import com.app.bookmytrain.entities.TrainSchedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class TrainScheduleServiceImpl implements ITrainScheduleService {
	@Autowired
	private TrainScheduleRepository trainScheduleRepo;

	@Autowired
	private TrainRepository trainRepo;

	@Override
	public List<TrainSchedule> findAll() {
		List<TrainSchedule> list = trainScheduleRepo.findAll();
		return list;
	}

	@Override
	public TrainSchedule save(TrainScheduleDto dto) {
		TrainSchedule cmt = DtoEntityConvertor.toTrainScheduleDto(dto);
		 return trainScheduleRepo.save(cmt);
		
	}

	@Override
	public TrainSchedule addScheduleForAc(AddScheduleDto dto) {
		Train train = trainRepo.findById(dto.getTrainId()).get();

		TrainSchedule trainSchedule = DtoEntityConvertor.addScheduleForAc(dto, train);
		
		return trainScheduleRepo.save(trainSchedule);

		
	}

	@Override
	public TrainSchedule addScheduleForNonAc(AddScheduleDto dto) {
		Train train = trainRepo.findById(dto.getTrainId()).get();

		TrainSchedule trainSchedule = DtoEntityConvertor.addScheduleForNonAc(dto, train);
		return trainScheduleRepo.save(trainSchedule);
		
	}

	@Override
	public boolean isTrainScheduleAvailable(AddScheduleDto dto) {
		List<TrainSchedule> travelling = trainScheduleRepo.findByTrainIdAndDateOfTravelling(dto.getTrainId(),
				dto.getDateOfTravelling());
		if (!travelling.isEmpty())
			return false;
		return true;
	}

}
