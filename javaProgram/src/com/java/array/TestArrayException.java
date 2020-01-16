package com.java.array;

/*printStackTrace():It's a method on Exception instances that prints the stack trace of the instance to System.err.

It's a very simple, but very useful tool for diagnosing an exceptions. It tells you what happened and where in the code this happened.

Here's an example of how it might be 
*/public class TestArrayException {

	public static void main(String[] args) {
		int array[] = { 2, 2 };
		try {
			for (int i = 0; i <= array.length; i++) {
				System.out.println(array[i]);
			}
		} catch (ArrayIndexOutOfBoundsException arrayException) {
			System.out.println(arrayException);
		}

		for (int i : array) {
			System.out.println(i);
		}
	}
}

/*arrayException.printStackTrace();// output
2
2
java.lang.ArrayIndexOutOfBoundsException: 2
2
2			at com.java.array.TestArrayException.main(TestArrayException.java:9)
*/

/*System.out.println(arrayException); //output
2
2
java.lang.ArrayIndexOutOfBoundsException:2
2
2
*/