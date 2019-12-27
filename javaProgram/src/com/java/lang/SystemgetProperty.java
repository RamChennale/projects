package com.java.lang;

public class SystemgetProperty {

	public static void main(String[] args) {
		System.out.println("System class");
		System.out.println("System.getProperty(\"user.home\") : " + System.getProperty("user.home"));
		System.out.println("System.getProperty(\"user.name\") : " + System.getProperty("user.name"));
		System.out.println("System.getProperty(\"user.dir\") : " + System.getProperty("user.dir"));
		System.out.println("System.getProperty(\"file.separator\") : " + System.getProperty("file.separator"));
		System.out.println("System.getProperty(\"os.name\") :" + System.getProperty("os.name"));
		System.out.println("System.getProperty(\"os.arch\") : " + System.getProperty("os.arch"));
		System.out.println("System.getProperty(\"os.version\") : " + System.getProperty("os.version"));
		System.out.println("System.getProperty(\"java.home\") : " + System.getProperty("java.home"));
		System.out.println("System.getProperty(\"java.vendor\") : " + System.getProperty("java.vendor"));
		System.out.println("System.getProperty(\"java.version\") :" + System.getProperty("java.version"));
	}
}
