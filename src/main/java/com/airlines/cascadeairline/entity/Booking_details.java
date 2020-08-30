package com.airlines.cascadeairline.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking_details {

	private long booking_id;
	@Id
	private long passenger_id;
	
}
