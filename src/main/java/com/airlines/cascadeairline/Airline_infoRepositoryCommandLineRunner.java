//package com.airlines.cascadeairline;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.airlines.cascadeairline.entity.Airline_info;
//import com.airlines.cascadeairline.repository.Airline_infoRepository;
//
//@Component
//public class Airline_infoRepositoryCommandLineRunner implements CommandLineRunner {
//
//	
//public static final Logger log=LoggerFactory.getLogger(Airline_infoRepositoryCommandLineRunner.class);
//	
//	@Autowired
//	private Airline_infoRepository airline_infoRepository;
//	
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		Airline_info airline_info=new Airline_info("Indigo.png", "Indigo");
//		airline_infoRepository.save(airline_info);
//		log.info("airline_info is created"+airline_info);
//	}
//}
