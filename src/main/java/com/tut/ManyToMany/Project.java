package com.tut.ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	private int id;
	private String projectName;
	
	@ManyToMany(mappedBy="projects")
	private List<Emp> emp;
	
	

	public Project(int id, String projectName, List<Emp> emp) {
		super();
		this.id = id;
		this.projectName = projectName;
		this.emp = emp;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Emp> getEmp() {
		return emp;
	}

	public void setEmp(List<Emp> emp) {
		this.emp = emp;
	}
	
	

}
