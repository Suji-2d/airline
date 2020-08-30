package com.airlines.cascadeairline.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.airlines.cascadeairline.entity.Flight;
import com.airlines.cascadeairline.repository.FlightRepository;

public class FlightService {

	@Autowired
	FlightRepository flightRepository;
	
	@Transactional
	public Flight createFlight(Flight flight) {
		
		Flight newFlight = new Flight();
		newFlight.setDestination(flight.getDestination());
		newFlight.setDuration(flight.getDuration());
		newFlight.setFare(flight.getFare()); 
		newFlight.setFlight_date(flight.getFlight_date());
		
		
		return flightRepository.save(newFlight);
	}
}
