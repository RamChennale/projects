package com.qa.rest.inteface;

public interface HttpMethods {
	
	public static final int STATUS_CODE_100=100;	
	public static final int STATUS_CODE_200=200;
	public static final int STATUS_CODE_201=201;
	public static final int STATUS_CODE_300=300;
	public static final int STATUS_CODE_400=400;
	public static final int STATUS_CODE_500=500;	
	public void postRequest();
	public void getRequest();
	public void puttRequest();
	public void deleteRequest();
}
