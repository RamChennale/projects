package com.qa.test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.base.APIConstans;
import com.qa.base.TestBase;
import com.qa.client.PostRequestClient3WithHeader;
import com.qa.data.Users;

public class PostRequest3WithHeader extends TestBase implements APIConstans {

	TestBase testBase;
	String serviceUrl;
	String apiUrl;
	String url;
	CloseableHttpResponse closeableHttpResponse;
	PostRequestClient3WithHeader postRequest;

	@BeforeMethod
	public void setUp() throws ClientProtocolException, IOException {
		testBase = new TestBase();
		serviceUrl = properties.getProperty("serviceurl");
		apiUrl = properties.getProperty("apiurl");
		url = serviceUrl + apiUrl;
	}

	@Test
	public void postRequestWithHeader() throws JsonGenerationException, JsonMappingException,ClientProtocolException, IOException {
		postRequest = new PostRequestClient3WithHeader();
		HashMap<String, String> headerMap = new HashMap<String, String>();
		headerMap.put("Content-Type", "application/json");
		ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		Users userReq = new Users("Ram", "Tester");

		//Marshalling converting object to JSON file
		mapper.writeValue(new File(System.getProperty("user.dir") +"/src/main/java/com/qa/data/users.json"), userReq);

		//converting object to JSON in string
		String userJSONstring = mapper.writeValueAsString(userReq);
		closeableHttpResponse = postRequest.postRequest(url, userJSONstring, headerMap);
		int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");
		JSONObject jsonObject = new JSONObject(responseString);
		System.out.println("Response in JSON string : " + jsonObject);
		
		//Unmarshalling converting back JSON to java object
		Users userRes = mapper.readValue(responseString, Users.class);
		System.out.println(userReq.getName().equalsIgnoreCase(userRes.getName()));
	}
}

/*
 * https://www.baeldung.com/jackson-deserialize-json-unknown-properties
 * 
 * common exception if not using
 * ".configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);" while
 * creating object of mapper class.
 * com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException:
 * Unrecognized field "id" (class com.qa.data.Users), not marked as ignorable (2
 * known properties: "name", "job"])
 */
