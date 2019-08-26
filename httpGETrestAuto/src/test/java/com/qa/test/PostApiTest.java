package com.qa.test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.http.ParseException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.base.TestBase;
import com.qa.client.RestClient;
import com.qa.data.Users;
import com.sun.org.apache.regexp.internal.recompile;

public class PostApiTest extends TestBase {

	TestBase testBase;
	String serviceUrl;
	String apiUrl;
	String url;
	RestClient restclient;
	CloseableHttpResponse closeableHttpResponse;

	@BeforeMethod
	public void setUp() {
		testBase = new TestBase();
		serviceUrl = prop.getProperty("URL");
		apiUrl = prop.getProperty("serviceURL");
		url = serviceUrl + apiUrl;
	}

	@Test
	public void postApi() throws JsonGenerationException, JsonMappingException, IOException {
			restclient = new RestClient();
			HashMap<String, String> headerMap = new HashMap<String, String>();
			headerMap.put("Content-Type", "application/json");
			// jackson API
			ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			Users users = new Users("morpheus", "leader"); // expected users object
			// obj to json file marshalling 
			mapper.writeValue(new File(
					"/Users/ramchennale/git/RestAutomationDemo/httpGETrestAuto/src/main/java/com/qa/data/users.json"),
					users);

			// objet to json in string
			String userJsonStr = mapper.writeValueAsString(users);
			System.out.println(userJsonStr);
			/*System.setProperty("https.protocols", "TLSv1,TLSv1.1,TLSv1.2");*/
			closeableHttpResponse = restclient.post(url, userJsonStr, headerMap);
			int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
			System.out.println("statusCode :  "+statusCode);
			//Assert.assertEquals(RESPONSE_STATUS_CODE_200, statusCode);
			String responseStr = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");
			JSONObject reponseJson = new JSONObject(responseStr);
			System.out.println("The response from API : "+reponseJson);
			//Json to java object unmarshalling 
			Users userResponse= mapper.readValue(responseStr, Users.class); // actual  users object
			System.out.println(userResponse);
			System.out.println("Marshalling and Un-marshalling done successfully : "+userResponse.getName().equals(users.getName()));
			System.out.println(userResponse.getName());
			System.out.println(userResponse.getId());
			System.out.println(userResponse.getJob());
			System.out.println(userResponse.getCreatedAt());
/*			System.out.println(users2.getName());
			System.out.println(users2.getJob());*/
		}
}

/*https://www.baeldung.com/jackson-deserialize-json-unknown-properties  

common exception if not using ".configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);" while creating object of mapper class.
com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException: Unrecognized field "id" (class com.qa.data.Users), not marked as ignorable (2 known properties: "name", "job"])
*/