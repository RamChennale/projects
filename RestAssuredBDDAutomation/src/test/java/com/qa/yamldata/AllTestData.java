package com.qa.yamldata;
/**
 * This class will load the yaml file data
 * 
 * Key : it will be the name of test case e.g. testSinglePhotoCase1
 * Value: value are all list of data given for particular test case e.g. for above test case we have 3 test data row in yaml file 
 * 
 */
import java.util.List;
import java.util.Map;

public class AllTestData {

	private Map<String, List<TestType>> allTestCaseDataMap;

	public Map<String, List<TestType>> getAllTestCaseDataMap() {
		return allTestCaseDataMap;
	}

	public void setAllTestCaseDataMap(Map<String, List<TestType>> allTestCaseDataMap) {
		this.allTestCaseDataMap = allTestCaseDataMap;
	}
}
