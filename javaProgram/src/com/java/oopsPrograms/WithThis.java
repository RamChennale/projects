package com.java.oopsPrograms;


class Student5 {
	int rollno;
	String name;
	float fee;
	
	Student5() {
		System.out.println("Default consturctor");
	}

	Student5(int i){
		this();
		System.out.println("calling Default consturctor");
	}
	
	Student5(int rollno, String name, float fee) {
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}

public class WithThis {

	public static void main(String args[]) {
		Student5 o1= new Student5();
		Student5 o2= new Student5(100);
		Student5 s1 = new Student5(111, "ankit", 5000f);
		Student5 s2 = new Student5(112, "sumit", 6000f);
		s1.display();
		s2.display();
	}
}
