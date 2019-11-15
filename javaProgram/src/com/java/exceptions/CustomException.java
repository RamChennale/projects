package com.java.exceptions;

public class CustomException extends RuntimeException {

	public CustomException(String s) {
		super(s);
	}
}
/*
 * public CustomException(String s, String s1) { 
 * super(s,s1); super(s1); 
 * }
 */