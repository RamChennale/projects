package com.qa.testNG.groups;

import org.testng.annotations.Test;

public class TestGroupExample {

	@Test(groups="test-group-one")
    public void testMethodOne() {
        System.out.println("Test method one belonging to group one.");
    }
 
	@Test
    public void testMethodTwo() {
        System.out.println("Test method two not belonging to group.");
    }
 
    @Test(groups="test-group-one")
    public void testMethodThree() {
        System.out.println("Test method three belonging to group one.");
    }
    
    @Test(groups="test-group-two")
    public void testMethodFour() {
        System.out.println("Test method four belonging to group two.");
    }
}
