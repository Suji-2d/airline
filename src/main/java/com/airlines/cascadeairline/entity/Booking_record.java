package com.airlines.cascadeairline.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking_record {

	@Id
	@GeneratedValue
	private long booking_id;
	private Date booking_date;  
	private String destination;   
	private double fare;          
	private Date flight_date;   
	private String flight_number; 
	private Date flight_time;   
	private String origin;        
	private String status;        
      
}
