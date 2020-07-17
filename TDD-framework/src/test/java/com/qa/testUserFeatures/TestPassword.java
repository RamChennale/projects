package com.qa.testUserFeatures;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.userFeatures.PasswordValidator;

public class TestPassword {

	@Test
	public void testPassword() {
		System.out.println("Enter password to validate ?");
		Scanner scanner= new Scanner(System.in);
		String password=scanner.next();
		Assert.assertTrue(PasswordValidator.isVadlid(password), "Incorrect password try again");
	}
}
