package com.java.enumeration;

public class EnumUsage {

	public enum season{SRPING,WINTER,SUMMER,RAINY}
	public static void main(String[] args) {
		for(season a: season.values()) {
			System.out.println(a);
		}
	}
}
