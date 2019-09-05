package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleAssertion {

	@Test
	public void test1() {
		System.out.println("test1 started ");
		System.out.println("actual" + "expected");
		Assert.assertEquals(10, 20); // Hard Assertion
		System.out.println("test2 completed");
	}

	@Test
	public void test2() {
		System.out.println("test2 started ");
		Assert.assertEquals(10, 20, "The given dropdown value dose not match."); // Hard Assertion
		System.out.println("test2 completed  ");
	}

	@Test
	public void test4() {
		System.out.println("test4() verifying assertTrue command");
		Assert.assertTrue(true);
	}

	@Test
	public void test5() {
		System.out.println("test5() verifying assertTrue command");
		Assert.assertTrue(false);
		System.out.println("test5 Assert false failed ");
	}

	@Test
	public void test6() {
		System.out.println("test6 assert verifying string");
		String name = "Ram chennale";
		Assert.assertTrue(name.contains("Ram"));
		System.out.println("test6 Assert successful");
	}

}
