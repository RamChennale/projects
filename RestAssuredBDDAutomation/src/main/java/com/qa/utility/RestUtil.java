package com.qa.utility;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtil {

	/*URL: http://localhost:3000/posts
	{
	    "id": 1001,
	    "title": "Narech",
	    "author": "Lotus"
	}*/
	public static String getId() {
		String id="123"+RandomStringUtils.randomAlphanumeric(4);
		return id;
	}
	public static String getTitle() {
		String title= "Tester"+RandomStringUtils.randomAlphabetic(3);
		return title;
	} 

	public static String getAuthor() {
		String author="Ram"+RandomStringUtils.randomAlphabetic(3);
		return author;
	}

}
