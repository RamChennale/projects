package com.qa.apistd.util;

import org.apache.http.HttpResponse;

public interface RetriveResponse {
	
	public int getStatusCode();
	public String getStatusLine();
	public ResponseBody getBody();
	
	public HttpResponse getResponse();

}
