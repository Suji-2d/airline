package com.airlines.cascadeairline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airlines.cascadeairline.entity.Airline_info;
import com.airlines.cascadeairline.entity.Flight_info;
@Repository
public interface Flight_infoRepository extends JpaRepository<Flight_info,Long>{

}
