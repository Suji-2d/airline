package com.airlines.cascadeairline.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.airlines.cascadeairline.entity.Airline_info;
import com.airlines.cascadeairline.entity.Flight;
import com.airlines.cascadeairline.entity.Flights_info;
import com.airlines.cascadeairline.repository.Airline_infoRepository;
import com.airlines.cascadeairline.repository.FlightRepository;
import com.airlines.cascadeairline.repository.Flights_infoRepository;
import com.airlines.cascadeairline.service.FlightService;

@RestController
@Transactional
public class AirlineController {
	
	@Autowired
	private FlightRepository flightRepository;
	
	@Autowired
	private Flights_infoRepository fsiRepository;
	
	@Autowired
	Airline_infoRepository airline_inforRepository;
	
	@Autowired
	Flights_infoRepository flights_inforRepository;
	
	//2.1 search by airline name
	@GetMapping("/flight/2-1/an={airlineName}")
	public List<Flight> getFlightByAirlain(@PathVariable String airlineName){
	return flightRepository.getFlightByAirline(airlineName);
	}
	
	//2.2 search by origin and date
	@GetMapping("/flight/2-2/o={origin}/date={date}")
	public List<Flight> getFlightByOriginAndDate(@PathVariable String origin,@PathVariable String date) throws ParseException{
	return flightRepository.getFlightByOriginAndDate(new SimpleDateFormat("yyyy-MM-dd").parse(date),origin.toUpperCase());
	}
	
	//2.3 search by destination, origin and date. Sort by fare.
	@GetMapping("/flight/2-3/d={destination}/o={origin}/date={date}")
	public List<Flight> getFlightByDestinationOridingDateSortByFare(@PathVariable String origin,@PathVariable String date,@PathVariable String destination) throws ParseException{
	return flightRepository.getFlightByDestinationOridingDateSortByFare(new SimpleDateFormat("yyyy-MM-dd").parse(date),origin.toUpperCase(),destination.toUpperCase());
	}
	
	//2.4 search by flight No, origin and destination 
	@GetMapping("/flight/2-4/fn={flightNo}/o={origin}/d={destination}")
	public List<Flight> getFlightByFLightNoOridingDate(@PathVariable String origin,@PathVariable String destination,@PathVariable String flightNo) throws ParseException{
	return flightRepository.getFlightByFLightNoOridingDate(destination.toUpperCase(),origin.toUpperCase(),flightNo);
	}
	
	//2.5 search by flight No, date and time 
	@GetMapping("/flight/2-5/fn={flightNo}/fd={flightDate}/ft={flightTime}")
	public List<Flight> getFlightByFLightNoDateTime(@PathVariable String flightDate,@PathVariable String flightTime,@PathVariable String flightNo) throws ParseException{
	return flightRepository.getFlightByFLightNoDateTime(new SimpleDateFormat("yyyy-MM-dd").parse(flightDate),new SimpleDateFormat("HH:mm:ss").parse(flightTime),flightNo);
	}
	
	//2.6 schedule flight 
	@PostMapping("/flight/2-6/add")
	public Flight addFlight(@RequestBody Flight flight) {
		//return flightService.createFlight(flight);
		return flightRepository.save(flight);
	}
	
	@GetMapping("/airline")
	public List<Airline_info> getAirline_info(){
	return airline_inforRepository.findAll();
	}
	@PostMapping("/airline/add")
	public Airline_info addAirline_info(@RequestBody Airline_info airline_info) {
		//return flightService.createFlight(flight);
		return airline_inforRepository.save(airline_info);
	}
	
	@GetMapping("/flights")
	public List<Flights_info> getflights_info(){
	return flights_inforRepository.findAll();
	}
	@PostMapping("/flights/add")
	public Flights_info flights_info(@RequestBody Flights_info flights_info) {
		
//		Airline_info airline_info=new Airline_info();
//		airline_info=flights_info.getAirline_info();
//		
//		airline_info.addFlight_info(flights_info);

		
		return flights_inforRepository.save(flights_info);
	}
	
}
