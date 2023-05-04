package com.qa.stdReports;

import org.apache.log4j.Logger;

public class Report {
	
	private static Logger log = LoggerHelper.getLogger(Report.class);
	
	public synchronized static void printOperation(String operation) {
		log.debug("\tThread-ID" +Thread.currentThread().getId()+"Operation\t:\t" + operation);
	}
	
	public synchronized static void printKey(String key) {  
		log.debug("\tThread-ID" +Thread.currentThread().getId()+"Key\t:\t" + key);
	}
	
	public synchronized static void printValue(String value) {
		log.debug("\tThread-ID" +Thread.currentThread().getId()+"value\t:\t" + value);
	}
	
	public synchronized static void printValueType(String ValueType) {
		log.debug("\tThread-ID" +Thread.currentThread().getId()+"Value Type\t:\t" + ValueType);
	}
	
	public synchronized static void printData(String data) {
		log.debug("\tThread-ID" +Thread.currentThread().getId()+"data \t:\t" + data);
	}
	
	public synchronized static void printStatus(String status) {
		log.debug("\tThread-ID" +Thread.currentThread().getId()+"status\t:\t" + status);
	}

}
