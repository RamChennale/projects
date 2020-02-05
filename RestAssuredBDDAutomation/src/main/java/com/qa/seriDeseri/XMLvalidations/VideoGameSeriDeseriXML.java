package com.qa.seriDeseri.XMLvalidations;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class VideoGameSeriDeseriXML {

	@Test(priority=1,enabled=true)
	public void VideoGameSerializationXML() {
		VideoGame videoGameXML=  new VideoGame();
		videoGameXML.setId(11);
		videoGameXML.setName("Ram Test");
		videoGameXML.setRating("Five");
		videoGameXML.setCategory("Automation");
		videoGameXML.setReleaseDate("2020-01-31");
		videoGameXML.setReviewScore(90);
		
		given()
			.contentType("application/xml")
			.body(videoGameXML)
		.when()
			.post("http://localhost:8080/app/videogames")
		.then()
			.statusCode(200)
			.log().all()
			.body(equalTo("{\"status\": \"Record Added Successfully\"}"));
	}
	
	
	
	@Test(priority=2,enabled=true)
	public void VideoGameDeSerializationXML() {
		VideoGame videoGameXML=get("http://localhost:8080/app/videogames/11").as(VideoGame.class);
		System.out.println(videoGameXML.toString());
	}
}
