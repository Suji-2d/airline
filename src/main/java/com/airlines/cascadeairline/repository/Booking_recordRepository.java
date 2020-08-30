package com.airlines.cascadeairline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airlines.cascadeairline.entity.Airline_info;
import com.airlines.cascadeairline.entity.Booking_record;
@Repository
public interface Booking_recordRepository extends JpaRepository<Booking_record,Long>{

}
