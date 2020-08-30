package com.airlines.cascadeairline.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flight {

	@Id
	@GeneratedValue
	private long id;      
	private String destination;   
	private String duration; 
	private Date flight_date;   
	private String flight_number; 
	@JsonFormat(pattern="HH:mm:ss")
	private Date flight_time;   
	private String origin;  
	
	@OneToOne(targetEntity = Fare.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "fare_id")
	private Fare fare;    
	
	@OneToOne(targetEntity = Flight_info.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "flight_infoid")
	private Flight_info flight_info; 
	
	@OneToOne(targetEntity = Inventory.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "inv_id")
	private Inventory inventory ;        
	

}
