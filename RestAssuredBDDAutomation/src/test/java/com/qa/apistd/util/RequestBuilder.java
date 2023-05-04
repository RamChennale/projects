package com.qa.apistd.util;

import java.util.Map;

public interface RequestBuilder {

	public RequestBuilder buildUri();
	public RequestBuilder setContentType(String type);
	public RequestBuilder setAcceptType(String type);
	public RequestBuilder setHeader(String headerName, String headerValue);
	public RequestBuilder setHeader(Map<String, String> headerMap);
	public RequestBuilder setPathParameter(String parameterName, String parameterValue);
	public RequestBuilder setPathParameter(Map<String, String> pathParameterMap);
	public RequestBuilder setQueryParameter(String queryParameterName, String queryParameterValue);
	public RequestBuilder setQueryParameter(Map<String, String> queryParameterMap);
	public RequestBuilder setFormParamter(String parameterName, String parameterValue);
	public RequestBuilder setFormParamter(Map<String, String> formParameterMap);
	public RequestBuilder setBody(String body);
	public RequestBuilder setJWTcertificates(String path, String password);
	public RequestBuilder setProxy(String host, int port);
	public RetriveResponse executeRequest(HttpMethodTypes types);
	
}
