package com.tut.ManyToMany;

import java.util.List;

import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Emp {

	@Id
	private int eid;
	private String name;
	
	@ManyToMany
	@JoinTable(name="emp_learn",joinColumns = { @JoinColumn(name="eid")},
	inverseJoinColumns= {@JoinColumn(name="pid")})
	private List<Project> projects;
	
	

	public Emp(int eid, String name, List<Project> projects) {
		super();
		this.eid = eid;
		this.name = name;
		this.projects = projects;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getProject() {
		return projects;
	}

	public void setProject(List<Project> projects) {
		this.projects = projects;
	}
	
	
	
	
}
