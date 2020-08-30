package com.airlines.cascadeairline.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.airlines.cascadeairline.entity.Airline_info;
import com.airlines.cascadeairline.entity.Flights_info;
@Repository
public interface Flights_infoRepository extends JpaRepository<Flights_info,Long>{

	
	@Query("SELECT fi.flight_infoid FROM Flights_info fi INNER JOIN Airline_info ai ON fi.airline_info.airline_id=ai.airline_id WHERE ai.name_of_airline=(:airlineName)")
	public List<Long> getflightsInfo(@Param("airlineName") String airlineName);
	
	
}
