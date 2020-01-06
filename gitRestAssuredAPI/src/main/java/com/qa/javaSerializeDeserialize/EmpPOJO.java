package com.qa.javaSerializeDeserialize;

import java.io.Serializable;

public class EmpPOJO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1614456537852729864L;
	String name;
	int no;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	@Override
	public String toString() {
		return name+" "+no;
	}
}
