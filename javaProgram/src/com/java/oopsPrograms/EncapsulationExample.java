package com.java.oopsPrograms;

public class EncapsulationExample {

	public static void main(String args[]) {
		EmployeeCount obj = new EmployeeCount();
		obj.setNoOfEmployees(5613);
		System.out.println("No Of Employees: " + (int) obj.getNoOfEmployees());
	}
}

class EmployeeCount {
	private int numOfEmployees = 0;

	public void setNoOfEmployees(int count) {
		numOfEmployees = count;
	}

	public double getNoOfEmployees() {
		return numOfEmployees;
	}
}