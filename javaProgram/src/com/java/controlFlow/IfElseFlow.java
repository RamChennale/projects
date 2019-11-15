package com.java.controlFlow;

public class IfElseFlow {
	public static void main(String[] args) {

		int x = 10;
		/*
		 * if (x) { System.out.
		 * println("Condition output expected too be only boolean TRUE or FALSE"); }else
		 * { System.out.
		 * println("Condition output expected too be only boolean TRUE or FALSE"); }
		 */

		/*
		 * if (x=100) {
		 * System.out.println("Assignment operator '=' cannot be used with integer");
		 * System.out.println("Only equal to  == and comparison operator used");
		 * }else { System.out.
		 * println("Condition output expected too be only boolean TRUE or FALSE"); }
		 */

		@SuppressWarnings("unused")
		boolean b = false;
		if (b = true) {
			System.out.println("if conditon TRUE then IF block executed ");
		} else {
			System.out.println("else conditon TRUE then ELSE block executed ");
		}

		if (x == 20) {
			System.out.println("x==20 10==20 is IF");
		} else {
			System.out.println("x==20 10==20 is else");
		}
	}
}
