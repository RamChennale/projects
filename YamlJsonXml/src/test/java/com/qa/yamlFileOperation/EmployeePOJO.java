package com.qa.yamlFileOperation;

import java.util.List;

public class EmployeePOJO {

	private String name;
	private int wage;
	private String position;
	private List<EmployeePOJO> colleagues;

	// Without a default constructor, Jackson will throw an exception
	public EmployeePOJO() {
	}
	public EmployeePOJO(String name, int wage, String position, List<EmployeePOJO> colleagues) {
		this.name = name;
		this.wage = wage;
		this.position = position;
		this.colleagues = colleagues;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWage() {
		return wage;
	}
	public void setWage(int wage) {
		this.wage = wage;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public List<EmployeePOJO> getColleagues() {
		return colleagues;
	}
	public void setColleagues(List<EmployeePOJO> colleagues) {
		this.colleagues = colleagues;
	}

	@Override
	public String toString() {
		return "\nName: " + name + "\nWage: " + wage + "\nPosition: " + position + "\nColleagues: " + colleagues + "\n";
	}
}