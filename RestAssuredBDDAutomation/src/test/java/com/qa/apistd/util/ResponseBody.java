package com.qa.apistd.util;

public interface ResponseBody {

	public Object jsonPath(String path);
	public String asString();
}
