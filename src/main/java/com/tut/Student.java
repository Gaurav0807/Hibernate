package com.tut;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String firstname;
	private String lastname;
	
	
	
	
	public Student(int id, String firstname, String lastname) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public Student()
	{
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}

	
	

	
	
	
	
	
	

}
