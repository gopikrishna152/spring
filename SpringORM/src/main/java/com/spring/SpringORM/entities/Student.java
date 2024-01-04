package com.spring.SpringORM.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student implements Serializable { 
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@Column(name="studentId")
	private int id;  
	
	@Column(name="studentname")
	private String name;
	
	@Column(name="studentcity")
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	} 
	
	
	
	
	
	

}
