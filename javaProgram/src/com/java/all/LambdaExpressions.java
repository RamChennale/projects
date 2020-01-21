package com.java.all;
import java.util.ArrayList;

/*Enable to treat functionality as a method argument, or code as data.
A function that can be created without belonging to any class.
A lambda expression can be passed around as if it was an object and executed on demand.*/
import org.testng.annotations.Test;

public class LambdaExpressions {

	@Test
	public void lambdaExpression() {
		ArrayList<Integer> arrayList = new ArrayList<Integer>(); 
		arrayList.add(1); 
		arrayList.add(2); 
		arrayList.add(3); 
		arrayList.add(4); 
		//Using lambda expression to print all elements 
		arrayList.forEach(n->{
			System.out.println(n);
		});
		// Using lambda expression to print even elements 
		System.out.println("Using lambda expression to print even elements ");
		arrayList.forEach(n->{
			if(n%2==0) {
				System.out.println(n);
			}
		});
	}
}


