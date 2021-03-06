package com.qa.jsonUtility;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeSerializeJSONArrayToList {

	@Test()
	public void deSerializeJSON_ArrayToList() {
		RestAssured.baseURI="https://reqres.in/api/users?page=2";
		RequestSpecification requestSpecification=	RestAssured.given();
		Response response= requestSpecification.get();
		System.out.println("========RESPONSE response.asString()===========");
		System.out.println(response.asString());
		System.out.println("========RESPONSE JSON variables: String page	=jsonPathEvaluater.getString(\"page\");===========");
		
		JsonPath jsonPathEvaluater= response.jsonPath();
		String pageStr	=jsonPathEvaluater.getString("page");
		int page=Integer.parseInt(pageStr);
		String per_pageStr=jsonPathEvaluater.getString("per_page");
		int per_page=Integer.parseInt(per_pageStr);
		String total=jsonPathEvaluater.getString("total");
		String total_pages=jsonPathEvaluater.getString("total_pages");
		System.out.println("page :"+page);
		System.out.println("per_page :"+per_page);
		System.out.println("total :"+total);
		System.out.println("total_pages :"+total_pages);
		
		System.out.println("========RESPONSE JSON Arrays: List<Integer> list=	jsonPathEvaluater.getList(\"data.id\");===========");
		List<Integer> list=	jsonPathEvaluater.getList("data.id");
		for(Integer id:list) {
			System.out.println("ID : "+id);
		}
		
		List<String> emailList=jsonPathEvaluater.getList("data.email");
		for(String emails:emailList) {
			System.out.println("Extracted email List :"+emails);
		}
		//DeSerialize JSON Array to List
		List<ArrayDataExtractbyPOJO> allUserData = jsonPathEvaluater.getList("data", ArrayDataExtractbyPOJO.class);
		for(ArrayDataExtractbyPOJO user:allUserData) {
			System.out.println("User first Name"+user.avatar);
		}
	}
}
