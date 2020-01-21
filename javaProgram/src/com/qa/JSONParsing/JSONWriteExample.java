package com.qa.JSONParsing;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONWriteExample {

	public static void main(String[] args) {
		//create JSON object
		JSONObject jsonObject= new JSONObject();
		
		// putting data to JSONObject
		jsonObject.put("fname", "Ram");
		jsonObject.put("lname", "chennale");
		jsonObject.put("age", 26);
		
		// for address data, first create LinkedHashMap 
		Map map= new LinkedHashMap(4);
		map.put("Street", "26th cross");
		map.put("city", "BLR");
		map.put("state", "KA");
		
		// putting address to JSONObject 
		jsonObject.put("address", map);
		
		 // for phone numbers, first create JSONArray 
		JSONArray jsonArray= new JSONArray();
		
		map= new LinkedHashMap(2);
		map.put("type", "home");
		map.put("number", "636216");
		
		// adding map to list 
		jsonArray.add(map);
		
		map= new LinkedHashMap(2);
		map.put("type", "office-fax");
		map.put("number", "383283");
		// adding map to list 
		jsonArray.add(map);
		
		// putting phoneNumbers to JSONObject 
		jsonObject.put("phoneNumbers",jsonArray);
		
		// writing JSON to file:"JSONExample.json" in cwd 
		PrintWriter pw;
		try {
			pw = new PrintWriter("JSONExample.json");
			pw.write(jsonObject.toJSONString());
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
