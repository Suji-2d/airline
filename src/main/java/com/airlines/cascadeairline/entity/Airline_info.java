package com.airlines.cascadeairline.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Airline_info {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long airline_id;
	public String airline_logo;
    public String name_of_airline;
	
    @OneToMany(mappedBy = "airline_info")
	 public List<Flights_info> flights_info;
 
	 
	 public void addFlight_info(Flights_info flights_info) {
		 this.flights_info.add(flights_info);
	 }
	 public void removeFlight_info(Flights_info flights_info) {
		 this.flights_info.remove(flights_info);
	 }

}
