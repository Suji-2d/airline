package com.airlines.cascadeairline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airlines.cascadeairline.entity.Airline_info;

@Repository
public interface Airline_infoRepository extends JpaRepository<Airline_info,Long>{

}
