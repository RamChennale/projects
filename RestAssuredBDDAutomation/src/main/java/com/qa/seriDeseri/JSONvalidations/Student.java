package com.qa.seriDeseri.JSONvalidations;

import java.util.List;

public class Student {

	public int id;
	public String name;
	public List<String> subjects;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name; 
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubject(List<String> subjects) {
		this.subjects=subjects;
	}
	
	public String toString() {
		return("Id: "+this.id+" Name: "+this.name+" Subjects:"+subjects);
	}
}
