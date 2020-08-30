package com.airlines.cascadeairline.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fare {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long fare_id;
	
	private String currency;
	private double fare;
	
//	@OneToOne(mappedBy = "fare")
//	private Flight flight;
}
