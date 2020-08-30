package com.airlines.cascadeairline.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.transaction.Transactional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flights_info {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long flight_infoid;
	@ManyToOne(targetEntity = Airline_info.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "airline_id")
	private Airline_info airline_info;
	

}
