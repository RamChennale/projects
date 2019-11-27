package com.qa.rest.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.rest.inteface.HttpMethods;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostGetPutDeleteRequest implements HttpMethods{

	static RestAssured restAssured;
	RequestSpecification requestSpecification;
	Response response;
	SoftAssert softAssert;  
	Properties properties;
	FileInputStream fileInputStream;
	JSONObject jsonObject;
	String url;
	String content_type;
	String application_json;
	String id;
	String title;
	String authour;
	int status_code;
	
	@SuppressWarnings({ "static-access", "unchecked" })
	@Test
	public void postRequest()  {
		try {
			jsonObject=new  JSONObject();
			properties= new Properties();
			fileInputStream= new FileInputStream(System.getProperty("user.dir")+"/src/test/java/com/qa/rest/data/config.properties");
			properties.load(fileInputStream);
			url=properties.getProperty("posturl");
			content_type= properties.getProperty("content_type");
			application_json =properties.getProperty("application_json");
			id=properties.getProperty("id");
			title=properties.getProperty("title");
			authour=properties.getProperty("authour");
			
			requestSpecification= restAssured.given();
			requestSpecification.header(content_type, application_json);
			
			jsonObject.put("id", id);
			jsonObject.put("title", title);
			jsonObject.put("authour", authour);
			requestSpecification.body(jsonObject.toJSONString());

			 response= requestSpecification.post(url);
			 status_code=response.getStatusCode();
			 Assert.assertEquals(status_code, STATUS_CODE_201);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//	@Test(enabled=true, priority=1)
	public void getRequest() {
		
	}

	//@Test(dependsOnMethods="postRequest", enabled=true, priority=2)
	public void puttRequest() {
		
	}
	
	//@AfterMethod
	public void deleteRequest() {
		
	}

}
