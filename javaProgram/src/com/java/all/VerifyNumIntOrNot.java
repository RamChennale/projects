package com.java.all;

import java.util.Scanner;
import gneral.CustomException;

public class VerifyNumIntOrNot {

	public boolean verify_Int_Num(String var) {
		try {
			Integer.parseInt(var);
		} catch (CustomException e) {
			throw new CustomException("Number is not an integer");
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a num : ");
		String var = scn.nextLine();
		VerifyNumIntOrNot o = new VerifyNumIntOrNot();
		o.verify_Int_Num(var);
		
	}
}
