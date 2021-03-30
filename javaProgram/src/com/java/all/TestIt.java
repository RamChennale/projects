package com.java.all;

import java.util.Scanner;

public class TestIt {

	public static void main(String[] args) {
		
		int a=10, b=05;
		System.out.println(a>b?a+"a is greater than b":b+" b is greater a");
	}
}


 class Armstrongnum  {

public void Armstrongnum() {
	
		int num = 153;
		int temp = num;
		int rem = 0;
		int sum = 0;

		while (num > 0) {
			rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;
		}
		if (sum == temp) {
			System.out.println(temp + ": is armstrong num");
		}
		else {
			System.out.println(temp+ "is not armstrong num" + "");
		}
}
 }

class ArithmeticExceptionDemo extends RuntimeException{
	public void arithmeticExceptionDemo() {

		int a = 10, b = 0, c;
		try {
			System.out.println(c = a / b);
		} catch (ArithmeticException ae) {
			System.out.println("00 ae.printStackTrace()==============================");
			ae.printStackTrace();
			System.out.println("01 ae==============================");
			System.out.println("ae " + ae);
			System.out.println("02 ae.getMessage()==============================");
			System.out.println(ae.getMessage());
		} finally {
			System.out.println("03==============================");
			System.out.println("Executed finally block of code");
		}
	}
	
	/*OUTPUT
	 * 00 ae.printStackTrace()==============================
	 * java.lang.ArithmeticException: / by zero at
	 * com.java.all.TestIt.main(TestIt.java:10) 
	 * 01 ae==============================
	 * ae java.lang.ArithmeticException: / by zero 
	 * 02 ae.getMessage()============================== / by zero
	 * 03============================== Executed finally block of code
	 * 
	 */			
}

class customeExpction extends RuntimeException {

	public static final long serialVersionUID = 1L;

	public customeExpction(String msg) {
		super(msg);
	}
}

class Demo {
	public void name() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number");
		int a = sc.nextInt();
		System.out.println("Enter Second Number");
		int b = sc.nextInt();

		if ((a > b) && (a - b) >= 2) {
			System.out.println(a);
		} else if ((b > a) && (b - a) >= 2) {
			System.out.println(b);
		} else {
			System.out.println(a + "inclusive" + b);
		}
	}
}

abstract class absclass1 {
	public void absclassname() {
		System.out.println("abs class");
	}
}

interface interDemo {
	int MAX = 100;
	public static final float PI = 3.14f;

	public void name();

	public abstract void namestatic();
}

/*
 * FIBONACCI SERIES //0,1 0+1=1 1+1=2 2+1=3 2+3=5 3+5=8 .......
 * //0,1,1,2,3,5,8,13....
 * 
 * public static void main(String[] args) {
 * 
 * int a=0, b=1; int temp; Scanner scanner= new Scanner(System.in);
 * System.out.println("Enter a num needed to be fibonacci series : "); int n=
 * scanner.nextInt(); System.out.print("The fibonacci seriese is : "+a+","+b);
 * 
 * for(int i=0; i<=n; i++ ) { temp=a+b; a=b; b=temp; System.out.print(","+temp);
 * } }
 */

/*
 * REVERSE THE GIVEN NUMBER
 * 
 * public static int revNum(int num) { int rev=0; int reminder;
 * 
 * while(num>0) { reminder=num%10; num=num/10; rev=rev*10+reminder; } return
 * rev; }
 * 
 * public static void main(String[] args) {
 * System.out.println("Enter a number to reverse : "); int num = new
 * Scanner(System.in).nextInt(); System.out.println();
 * System.out.println("A given number is : " + num); System.out.println();
 * System.out.println("The reversed number is :  "+revNum(num)); }
 */

/*
 * program which should print ‘a’ if ‘a’ is bigger than ‘b’ by 2 or more or
 * should print ‘b’ if ‘b’ is bigger than ‘a’ by 2 or more. Otherwise, it should
 * print “INCONCLUSIVE” public static void main(String[] args ) {
 * 
 * Scanner scanner= new Scanner(System.in);
 * System.out.println("Enter num one :"); int num1= scanner.nextInt();
 * System.out.println("Enter num two :"); int num2=scanner.nextInt();
 * 
 * if((num1>num2)&&(num1-num2)>=2) {
 * System.out.println(" Bigger num is : "+num1); }else
 * if((num2>num1)&&(num2-num1)>=2) { System.out.println("Bigger num is :"+num2);
 * }else { System.out.println("The INCLUSIVE num are "+num1+" "+num2); } }
 */