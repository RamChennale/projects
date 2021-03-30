package com.java.string;

public class ImmutableString {
	public static void main(String args[]) {
		String s = "Sachin";
		System.out.println(s+": address is :"+s.hashCode());
		s=s.concat("Tendulkar");
		System.out.println(s+": address is :"+s.hashCode());
	}
}

/*
 * Sachin: address is :-1826113608 SachinTendulkar: address is :736108422
 */