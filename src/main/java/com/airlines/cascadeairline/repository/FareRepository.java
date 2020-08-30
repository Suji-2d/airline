package com.airlines.cascadeairline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airlines.cascadeairline.entity.Airline_info;
import com.airlines.cascadeairline.entity.Fare;
@Repository
public interface FareRepository extends JpaRepository<Fare,Long>{

}
