package com.java.selenium;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface IBaseInterface {

	int pi=2;
	static final double piV=3.14;
	
	public void base() throws IOException, InterruptedException, FileNotFoundException;
	public abstract void tearDown();
	
}
