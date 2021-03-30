package com.qa.assertion;

import java.util.Scanner;

import org.testng.annotations.Test;

public class FindPrime {
	
	
	public void findPrimeNum() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Pls enter M");
		int m=scanner.nextInt();
		System.out.println("Pls enter N");
		int n=scanner.nextInt();
		
		for(int i=m;i<n/2;m++) {
			if(i%2==0) {
				System.out.println();
			}else {
				System.out.println(i);
			}
		}
		
	}
	
	public static void main(String args[]) {
		FindPrime obj= new FindPrime();
		obj.findPrimeNum();
	}

}
