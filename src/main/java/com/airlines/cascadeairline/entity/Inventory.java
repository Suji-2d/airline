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
public class Inventory {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long inv_id;
	private int count;
	
//	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "inventory")
//	private Flight flight;
}
