package com.app.bookmytrain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookmytrainApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookmytrainApplication.class, args);
	}
//	@Bean
//	public ModelMapper mapper() {
//		ModelMapper modelMapper = new ModelMapper();
//		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
//		return modelMapper;
//	}
}
