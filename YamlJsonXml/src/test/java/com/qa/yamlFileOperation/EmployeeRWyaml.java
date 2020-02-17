package com.qa.yamlFileOperation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class EmployeeRWyaml {
	
	@Test(priority=1, enabled=true)
	public void readYAML() throws JsonParseException, JsonMappingException, IOException {
		File file = new File(System.getProperty("user.dir") + "./src/test/java/com/qa/readYMLfile/Employee.yml");
		ObjectMapper mapper= new ObjectMapper(new YAMLFactory());
		EmployeePOJO emp= mapper.readValue(file,  EmployeePOJO.class);
		System.out.println(emp.toString());
	}

	@Test(priority=2, enabled=false)
	public void writeYML() throws JsonParseException, JsonMappingException, IOException {
		//ClassLoader classLoader= Thread.currentThread().getContextClassLoader();
		//File file= new File(classLoader.getResource("C:/Users/ramchennale/git/projects/YamlJsonXml/src/test/java/com/qa/readYMLfile/Employee.yml").getFile());
		ObjectMapper mapper= new ObjectMapper(new YAMLFactory());
		List<EmployeePOJO> colleagues = new ArrayList<EmployeePOJO>();

		colleagues.add(new EmployeePOJO("Mary", 1800, "Developer", null));
		colleagues.add(new EmployeePOJO("Jane", 1200, "Developer", null));
		colleagues.add(new EmployeePOJO("Tim", 1600, "Developer", null));
		colleagues.add(new EmployeePOJO("Vladimir", 1000, "Developer", null));

		// We want to save this Employee in a YAML file
		EmployeePOJO employee = new EmployeePOJO("David", 1500, "Developer", colleagues);
		mapper.writeValue(new File(System.getProperty("user.dir") + "./src/test/java/com/qa/readYMLfile/Employee.yml"), employee);
		
	}
}
