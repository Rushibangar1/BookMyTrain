package com.app.bookmytrain.dao;

import com.app.bookmytrain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>
{
	User findById(int id);
	User findByEmail(String email);
	
	
	
}
