package com.qa.stdUtility;

import io.cucumber.core.backend.ScenarioScoped;

import io.cucumber.core.api.Scenario;

public class Reporter {
	
	public static ThreadLocal<Scenario>  TScenario = new ThreadLocal<Scenario>();
	
	public synchronized static void addStepLog(String message) {
		TScenario.get().write(message);
	}

	//get web app screenshot
	
	public synchronized static void addScreenCapture() {
		String screenShotName = CaptureScreenshot.shutterEntireScreenCaspture();
		
		String html = "<div style=\"margin-bottom:5px;\">"
				+"<label style=\"color:#1E90FF\">click on image to se screenshot</label>"
				+"<a href=\"" + screenShotName
				+"\" target=\"_blank\" style=\"float:right;\"><img src=\"core-image-screenshot.png\" style=\"background-color:blue;\"> </a>"
				+ "</div>";
		addStepLog(html);
	}
}
