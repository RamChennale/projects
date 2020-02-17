package com.qa.yamlFileOperation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class UserDetailsReadYML {

	public static void main(String[] args) {
		// FileNotFoundException,JsonParseException, JsonMappingException,IOException
		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		try {
			File file = new File(System.getProperty("user.dir") + "./src/test/java/com/qa/readYMLfile/userDetails.yml");
			UserDetailsPOJO userDetails = mapper.readValue(file, UserDetailsPOJO.class);
			System.out.println("=================");
			System.out.println(ReflectionToStringBuilder.toString(userDetails, ToStringStyle.MULTI_LINE_STYLE));
			System.out.println("========By POJO/Bean class=========");
			System.out.println(userDetails.getName());
			System.out.println(userDetails.getAge());
			System.out.println(userDetails.getAdsress());
			System.out.println(userDetails.getRoles());
			System.out.println("=================");
		} catch (FileNotFoundException fileExc) {
			fileExc.printStackTrace();
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
