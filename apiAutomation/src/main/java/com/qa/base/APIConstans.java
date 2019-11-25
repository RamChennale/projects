package com.qa.base;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

public interface APIConstans {

	public static final int STATUS_CODE_100_Info = 100;
	public static final int STATUS_CODE_200_Success = 200;
	public static final int STATUS_CODE_201_Success = 201;
	public static final int STATUS_CODE_300_Redirection = 300;
	public static final int STATUS_CODE_400_ClientError = 400;
	public static final int STATUS_CODE_500_ServerError = 500;

	public abstract void setUp() throws ClientProtocolException, IOException;
}
