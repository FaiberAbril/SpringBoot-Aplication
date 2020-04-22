package com.hargez.springbootapp.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class RolModel {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String description;
	
	@Column
	private String name;
	
	public RolModel() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
