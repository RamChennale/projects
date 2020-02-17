package com.qa.restFetures;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.concurrent.TimeUnit;


import org.testng.annotations.Test;
public class TimeMeasurement {

	@Test(enabled = false)
	public void timeMeasurement() {
	long time= get("http://jsonplaceholder.typicode.com/photos/?albumId=1").time();
	System.out.println("Resp Time - req, res and API process time: "+time);
	}
	
	@Test(enabled = false)
	public void timeMeasurementDiff() {
	long time= get("http://jsonplaceholder.typicode.com/photos/?albumId=1").timeIn(TimeUnit.SECONDS);
	System.out.println("Resp Time - req, res and API process time: "+time);
	}
	
	@Test(enabled = true)
	public void timeMeasurementAssertion() {
	//wrong given().get("http://jsonplaceholder.typicode.com/photos/?albumId=1").timeIn((TimeUnit) lessThan(500));
	}
}
