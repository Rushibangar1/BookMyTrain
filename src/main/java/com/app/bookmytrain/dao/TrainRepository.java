package com.app.bookmytrain.dao;

import com.app.bookmytrain.entities.Train;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainRepository extends JpaRepository<Train, Integer>
{
//	Train findById(int id);
	
}
