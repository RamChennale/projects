package com.qa.data;

import java.io.File;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * This class will read the properties.yaml/config.properties file
 * 
 */
public class PropertyFileReader {
	public static PropertyFilePojo getPropertyData() {
		ObjectMapper objectMapper = new ObjectMapper(new JsonFactory());
		PropertyFilePojo property = null;
		try {
			File file = new File(".\\resource\\properties.yaml");
			property = objectMapper.readValue(file, PropertyFilePojo.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return property;
	}
}
