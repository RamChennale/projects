package com.qa.apistd.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.security.KeyStore;
import java.security.KeyStore.TrustedCertificateEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.net.ssl.SSLContext;

import org.apache.http.Consts;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;

import com.google.common.net.HttpHeaders;

import io.restassured.internal.TrustAndKeystoreSpecImpl;
import io.restassured.internal.http.URIBuilder;
import io.restassured.path.json.JsonPath;

public class HttpClientUtils implements RequestBuilder, RetriveResponse, ResponseBody{

	public static String basePath;
	public static String baseUri;
	
	private URIBuilder uriBuilder;
	private HttpResponse response;
	private StringEntity requestEntity;
	
	private static List<NameValuePair> formParamters; 
	private static List<Header> headers ; 
	private static HttpClientBuilder httpClientBuilder; 
	
	private static HttpClientUtils httpClientUtils; 
	
	private RequestBuilder request; 
	private static RetriveResponse retriveResponse;
	private String bodyAsString;
	
	public static RequestBuilder given() {
		formParamters = new ArrayList<NameValuePair>();
		headers = new ArrayList<Header>();
		httpClientBuilder = HttpClients.custom();
		
		httpClientUtils = new HttpClientUtils();
		return httpClientUtils;
	}
	
	private void setScheme() {
		try {
		if(baseUri.contains("https://")) {
			
				uriBuilder.setScheme("https");
			
		}else if (baseUri.contains("http://")) {
			uriBuilder.setScheme("http");
		}
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
	
	
	private void setHost() {
		try {
			uriBuilder.setHost(baseUri.split("/")[2]);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
	
	private void setPath() {
		String remaining = baseUri.split(uriBuilder.toURI().getHost()) [1];
		if(!basePath.contains(remaining)) {
			basePath = remaining + basePath;
		}
		try {
			uriBuilder.setPath(basePath);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
	
	public HttpClientUtils buildUri() {
		try {
			uriBuilder = new URIBuilder(null, false, null);
			setScheme();
			setHost();
			setPath();
			return httpClientUtils;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public RequestBuilder setContentType(String type) {
		// TODO Auto-generated method stub
		headers.add(new BasicHeader (HttpHeaders.CONTENT_TYPE, type));
		return httpClientUtils;
	}

	@Override
	public RequestBuilder setAcceptType(String type) {
		// TODO Auto-generated method stub
		headers.add(new BasicHeader("Accept", type));
		return httpClientUtils;
	}

	@Override
	public RequestBuilder setHeader(String headerName, String headerValue) {
		// TODO Auto-generated method stub
		headers.add(new BasicHeader(headerName, headerValue));
		return httpClientUtils;
	}

	@Override
	public RequestBuilder setHeader(Map<String, String> headerMap) {
		// TODO Auto-generated method stub
		headerMap.forEach((headerName, headerValue) -> {
			headers.add(new BasicHeader(headerName, headerValue));
		});
		return httpClientUtils;
	}

	@Override
	public RequestBuilder setPathParameter(String parameterName, String parameterValue) {
		// TODO Auto-generated method stub
		basePath = basePath.replace("{" + parameterName + "}", parameterValue);
		return httpClientUtils;
	}

	@Override
	public RequestBuilder setPathParameter(Map<String, String> pathParameterMap) {
		// TODO Auto-generated method stub
		pathParameterMap.forEach((parameter, value) ->{
			basePath = basePath.replace("{" + parameter +"}",value);
		});
		return httpClientUtils;
	}

	@Override
	public RequestBuilder setQueryParameter(String queryParameterName, String queryParameterValue) {
		// TODO Auto-generated method stub
		//uriBuilder.setParameter(queryParameterName, queryParameterValue);
		return httpClientUtils;
	}

	@Override
	public RequestBuilder setQueryParameter(Map<String, String> queryParameterMap) {
		// TODO Auto-generated method stub
		queryParameterMap.forEach((parameter, value) ->{
			//uriBuilder.setParameter(parameter, value)
		});
		return httpClientUtils;
	}

	@Override
	public RequestBuilder setFormParamter(String parameterName, String parameterValue) {
		// TODO Auto-generated method stub
		//formParamters.add(BasicNameValuePair(parameterName, parameterValue));
		return httpClientUtils;
	}

	@Override
	public RequestBuilder setFormParamter(Map<String, String> formParameterMap) {
		// TODO Auto-generated method stub
		formParameterMap.forEach((parameterName, parameterValue) ->{
			//formParamters.add(BasicNameValuePair(parameterName, parameterValue));
		});
		return httpClientUtils;
	}

	@Override
	public RequestBuilder setBody(String body) {
		// TODO Auto-generated method stub
		try {
			requestEntity = new StringEntity(body, "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return httpClientUtils;
	}
/*// commented becuase of import issue
	@Override
	public RequestBuilder setJWTcertificates(String path, String password) {
		// TODO Auto-generated method stub
		try {
			final KeyStore keyStore = KeyStore.getInstance("PKCS12");
			try (FileInputStream stream = new FileInputStream(new File(path))){
				keyStore.load(stream, password.toCharArray());
			} 
			SSLContext sslContext = new SSLContexts().custom().loadKeyMaterial(keyStore,password.toCharArray()).loadTrustMaterial(keyStore, TrustAllStrategy.INSTANCE).build();
		final SSLConnectionSocketFactory sslcf = new SSLConnectionSocketFactory(sslContext, NoopHostnameVerifier.INSTANCE);
		
		final Registry<ConnectionSocketFactory> registry = RegistryBuilder.<ConnectionSocketFactory>create().register("http", new PlainConnectionSocketFactory()).register("https").build();
		
		final PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager(registry);
		
		cm.setMaxTotal(100);
		cm.setValidateAfterInactivity(100);
		httpClientBuilder.setSSLSocketFactory(sslcf).setConnectionManager(cm);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return httpClientUtils;
	}
*/
	@Override
	public RequestBuilder setProxy(String host, int port) {
		// TODO Auto-generated method stub
		HttpHost proxy = new HttpHost(host, port);
		httpClientBuilder.setProxy(proxy);
		return httpClientUtils;
	}
	
	@Override
	public RetriveResponse executeRequest(HttpMethodTypes types) {
		// TODO Auto-generated method stub
		try {
			//URI uri = uriBuilder.build();
			URI uri = uriBuilder.convertToURI(types);
			if(!headers.isEmpty()) {
				httpClientBuilder.setDefaultHeaders(headers);
			}
			
			//HttpClient client = httpClientBuilder.build();
			CloseableHttpClient client = httpClientBuilder.build();
			
			switch(types) {
			
			case POST :{
				
				//HttpPost postRequest = httpClientBuilder.build();
				CloseableHttpClient postRequest = httpClientBuilder.build();
				
				if(!formParamters.isEmpty()) {
					UrlEncodedFormEntity entity = new UrlEncodedFormEntity(formParamters, Consts.UTF_8);
					postRequest.execute((HttpUriRequest) entity);
				}
				
				response = postRequest.execute((HttpUriRequest) requestEntity);
				
				break;
			}

			case PUT :{
				
				HttpPut putRequest = new HttpPut(uri);
				
				if(requestEntity.getContentLength() > 0) {
					putRequest.setEntity(requestEntity);
				}
				
				response = client.execute(putRequest);
				break;
			}
			
			case DELETE :{
				
				HttpDelete deleteRequest = new HttpDelete(uri);
				
				response = client.execute(deleteRequest);
				
				break;
			}
			
			case GET :{
				
				HttpGet getRequest = new HttpGet(uri);
				
				response = client.execute(getRequest);
				break;
			}

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return httpClientUtils;
	}
	
	@Override
	public HttpResponse getResponse() {
		// TODO Auto-generated method stub
		return response;
	}
	
	@Override
	public int getStatusCode() {
		// TODO Auto-generated method stub
		return response.getStatusLine().getStatusCode();
	}

	@Override
	public String getStatusLine() {
		// TODO Auto-generated method stub
		return response.getStatusLine().toString();
	}

	@Override
	public ResponseBody getBody() {
		// TODO Auto-generated method stub
		String line;
		StringBuilder body = new StringBuilder();
		
		InputStreamReader streamReader = null;
		BufferedReader bufferedReader = null;
		
		try {
			streamReader = new InputStreamReader(response.getEntity().getContent());
			bufferedReader = new BufferedReader(streamReader);
			
			while ((line = bufferedReader.readLine()) != null) {
				body.append(line);
			}
			bodyAsString = body.toString();
			
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bufferedReader.close();
				streamReader.close();
			} catch (IOException ioe2) {
				ioe2.printStackTrace();
			}
		}
		return httpClientUtils;
	}

	@Override
	public Object jsonPath(String path) {
		// TODO Auto-generated method stub
		JsonPath jsonPath = new JsonPath(bodyAsString);
		return jsonPath.get(path);
	}

	@Override
	public String asString() {
		// TODO Auto-generated method stub
		return bodyAsString;
	}

	@Override
	public RequestBuilder setJWTcertificates(String path, String password) {
		// TODO Auto-generated method stub
		return null;
	}



	
}
