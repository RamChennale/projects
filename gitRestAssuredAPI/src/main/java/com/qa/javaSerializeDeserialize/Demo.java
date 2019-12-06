package com.qa.javaSerializeDeserialize;

public class Demo {

	int no;
	String name;
	String school;
	String address;

	public Demo(int no, String name, String school, String address) {
		this.no = no;
		this.name = name;
		this.school = school;
		this.address = address;
	}

	public String stduentAddress() {

		return name;
	}

	public String schoolAddress() {

		return school;
	}
}
