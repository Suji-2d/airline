package com.airlines.cascadeairline.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.airlines.cascadeairline.entity.Airline_info;
import com.airlines.cascadeairline.entity.Flight;
@Repository
public interface FlightRepository extends JpaRepository<Flight,Long>{
	
	//2.1 search by airline name
	@Query("SELECT f FROM Flight f WHERE f.flight_info.flight_infoid IN (SELECT fi.flight_infoid FROM Flights_info fi INNER JOIN Airline_info ai ON fi.airline_info.airline_id=ai.airline_id WHERE ai.name_of_airline=(:airlineName))")
	List<Flight> getFlightByAirline(@Param("airlineName") String airlineName);
	
	//2.2 search by origin and date
	@Query("SELECT f FROM Flight f WHERE f.flight_date=(:date) AND f.origin=(:origin)")
	List<Flight> getFlightByOriginAndDate(@Param("date") Date date,@Param("origin") String origin);

	//2.3 search by destination, origin and date. Sort by fare.
	@Query("SELECT f FROM Flight f WHERE f.flight_date=(:date) AND f.origin=(:origin) AND f.destination=(:destination) ORDER BY f.fare.fare")
	List<Flight> getFlightByDestinationOridingDateSortByFare(@Param("date") Date date,@Param("origin") String origin,@Param("destination") String destination);
	
	//2.4
	@Query("SELECT f FROM Flight f WHERE f.destination=(:destination) AND f.origin=(:origin) AND f.flight_info.flight_number=(:flightNo)")
	List<Flight> getFlightByFLightNoOridingDate(@Param("destination") String destination,@Param("origin") String origin,@Param("flightNo") String flightNo);

	//2.5
	@Query("SELECT f FROM Flight f WHERE f.flight_date=(:flightDate) AND f.flight_time=(:flightTime) AND f.flight_info.flight_number=(:flightNo)")
	List<Flight> getFlightByFLightNoDateTime(@Param("flightDate") Date flightDate,@Param("flightTime") Date flightTime,@Param("flightNo") String flightNo);

	
}
