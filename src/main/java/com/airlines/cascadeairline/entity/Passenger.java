package com.airlines.cascadeairline.entity;

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
public class Passenger {

	@Id
	@GeneratedValue
	private long passenger_id;  
	private String email_address;
	private String first_name;  
	private String gender;      
	private String last_name;   
	private long mobile_number; 
	private long booking_id;    
}
