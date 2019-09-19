package com.java.exceptions;

import java.util.Scanner;

public class TestCustomException {

	public static void validateAge(int age) {//throws CustomException 
		if (age < 18) {
			throw new CustomException("Not Allowed to VOTE, because you are only :"+age + " years of old.");
		} else {
			System.out.println("You can VOTE you are : " +age+ " Years of old.");
		}
	}

	public static void main(String[] args) throws Exception {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your age to verify You can VOTE or not : ");
			int age = scanner.nextInt();
			validateAge(age);
			System.out.println("Do you want to continue: Yes or No");
			String cont= scanner.next();
			if(cont.equalsIgnoreCase("Yes")) {
				System.out.println("Please enter your age again.");
				age = scanner.nextInt();
				validateAge(age);
			}else if (cont.equalsIgnoreCase("no")) {
				System.out.println("Thank you .");
				System.exit(0);
			}
			
		} catch (Exception e) {
			System.out.println(e);
			/*try {
				throw new Exception("msg",e);
			} catch (Exception e1) {
				throw new Exception("msg",e1);
			}*/
		}
	}
}
