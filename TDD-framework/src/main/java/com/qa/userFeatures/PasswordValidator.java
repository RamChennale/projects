package com.qa.userFeatures;

public class PasswordValidator {

	public static boolean isVadlid(String password) {
		if((password.length()>=6)&&(password.length()<=15))
			return true;
	    else
	    	return false;
	}
}
