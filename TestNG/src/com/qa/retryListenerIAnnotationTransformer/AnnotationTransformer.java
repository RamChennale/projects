package com.qa.retryListenerIAnnotationTransformer;

/*Retry failed Test cases at class level all Test cases executed in a class not no need to provide 
retryAnalyzer = RetryAnalyzer.class at test level*/
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import com.qa.retryIRetryAnalyzer.RetryAnalyzer;

public class AnnotationTransformer implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
	}

}
