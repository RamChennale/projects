package com.qa.JSONParsing;

//Java program to read JSON from a file 

import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
//import org.json.simple.parser.*;
import org.json.simple.parser.JSONParser;

public class JSONReadExample {
	public static void main(String[] args) throws Exception {
		
		// parsing file "JSONExample.json"
		Object obj = new JSONParser().parse(new FileReader("JSONExample.json"));

		// typecasting obj to JSONObject
		JSONObject jsonObject = (JSONObject) obj;

		// getting firstName and lastName
		String firstName = (String) jsonObject.get("fname");
		String lastName = (String) jsonObject.get("lname");

		System.out.println(firstName);
		System.out.println(lastName);

		// getting age
		Long age =  (Long) jsonObject.get("age");
		System.out.println(age);

		// getting address
		Map address = ((Map) jsonObject.get("address"));

		// iterating address Map
		Iterator<Map.Entry> itr1 = address.entrySet().iterator();
		while (itr1.hasNext()) {
			Map.Entry pair = itr1.next();
			System.out.println(pair.getKey() + " : " + pair.getValue());
		}

		// getting phoneNumbers
		JSONArray ja = (JSONArray) jsonObject.get("phoneNumbers");

		// iterating phoneNumbers
		Iterator itr2 = ja.iterator();

		while (itr2.hasNext()) {
			itr1 = ((Map) itr2.next()).entrySet().iterator();
			while (itr1.hasNext()) {
				Map.Entry pair = itr1.next();
				System.out.println(pair.getKey() + " : " + pair.getValue());
			}
		}
	}
}
