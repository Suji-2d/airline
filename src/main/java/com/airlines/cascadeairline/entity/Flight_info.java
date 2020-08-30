package com.airlines.cascadeairline.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flight_info {
	@Id
	@GeneratedValue
	private long flight_infoid;  
	private String flight_number;
	private String flight_type;  
	private int numberof_seats;
	
//	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "fight_info")
//	private Flight flight;
}
