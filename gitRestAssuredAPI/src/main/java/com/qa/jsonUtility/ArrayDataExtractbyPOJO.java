package com.qa.jsonUtility;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ArrayDataExtractbyPOJO {

	int page;
	int per_page;
	int total;
	int total_pages;
	int id;
	String email;
	String first_name;
	String last_name;
	String avatar;
}
