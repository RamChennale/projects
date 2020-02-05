package com.qa.seriDeseri.JSONvalidations;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class VideoGameSeriDeseriJSON {

	@Test(priority=1,enabled=true)
	public void VideoGameSerializationJSON() {
		
		VideoGame videoGame= new VideoGame();
			videoGame.setId(11);
			videoGame.setName("Ram AutoDrive");
			videoGame.setReleaseDate("2020-01-31");
			videoGame.setCategory("Driving");
			videoGame.setRating("Five");
			videoGame.setReviewScore(90);
			
			given()
				.contentType(ContentType.JSON)
				.body(videoGame)
			.when()
				.post("http://localhost:8080/app/videogames")
			.then()
				.log().all()
 				.body(equalTo("{\"status\": \"Record Added Successfully\"}"));
	}
	
	@Test(priority=2,enabled=true)
	public void VideoGameDeSerializationJSON() {
		VideoGame videoGame=get("http://localhost:8080/app/videogames/11").as(VideoGame.class);
		System.out.println(videoGame.toString());
	}
}
