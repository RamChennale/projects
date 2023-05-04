package com.qa.stdUtility;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.text.ParseException;

import org.apache.log4j.Logger;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.ScriptTimeoutException;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.json.JsonException;
import org.openqa.selenium.remote.ScreenshotException;
import org.testng.Assert;

import com.qa.stdReports.CalendarUtility;
import com.qa.stdReports.LoggerHelper;

//do not use cucumber-extent report Reporter class as using the same for TestNG legacy  apps
public class ExceptionHandler {

	private static ThreadLocal<Exception> TException = new ThreadLocal<Exception>();
	private static Logger log = LoggerHelper.getLogger(ExceptionHandler.class);

	public synchronized static void handleException(Object exceptionObject) {
		TException.set((Exception) exceptionObject);

		// logging exception trace in debug log file
		log.debug("Exception  stack trace belwo ", TException.get());

		// Selenium exception handling

		if (exceptionObject instanceof ElementNotVisibleException) {

			Assert.fail(CalendarUtility.getCalendarUtilityObject().getTimeStamp("MM/dd/yyyy HH:mm:ss")
					+ "Although Element present in the DOM, it not visible i.e can not be interacted with. for more details check debug log."
					+ exceptionObject.getClass().getSimpleName());

		} else if (exceptionObject instanceof ElementNotSelectableException) {

			Assert.fail(CalendarUtility.getCalendarUtilityObject().getTimeStamp("MM/dd/yyyy HH:mm:ss")
					+ "Although Element present in the DOM, it may be disabaled  i.e can not be clicked/selected. for more details check debug log."
					+ exceptionObject.getClass().getSimpleName());

		} else if (exceptionObject instanceof InvalidSelectorException) {

			Assert.fail(CalendarUtility.getCalendarUtilityObject().getTimeStamp("MM/dd/yyyy HH:mm:ss")
					+ " Selecteor used to find element dose not return a WebElement. for more details check debug log."
					+ exceptionObject.getClass().getSimpleName());

		} else if (exceptionObject instanceof NoSuchElementException) {

			Assert.fail(CalendarUtility.getCalendarUtilityObject().getTimeStamp("MM/dd/yyyy HH:mm:ss")
					+ "WebDriver unable to identify  the element during runtime. for more details check debug log."
					+ exceptionObject.getClass().getSimpleName());

		} else if (exceptionObject instanceof NoSuchFrameException) {

			Assert.fail(CalendarUtility.getCalendarUtilityObject().getTimeStamp("MM/dd/yyyy HH:mm:ss")
					+ "WebDriver is switching to an invalid fram, which is not available. for more details check debug log."
					+ exceptionObject.getClass().getSimpleName());

		} else if (exceptionObject instanceof NoAlertPresentException) {

			Assert.fail(CalendarUtility.getCalendarUtilityObject().getTimeStamp("MM/dd/yyyy HH:mm:ss")
					+ "WebDriver is switching to an invalid alert, which is not available. for more details check debug log."
					+ exceptionObject.getClass().getSimpleName());

		} else if (exceptionObject instanceof NoSuchWindowException) {

			Assert.fail(CalendarUtility.getCalendarUtilityObject().getTimeStamp("MM/dd/yyyy HH:mm:ss")
					+ "WebDriver is switching to an invalid window, which is not available. for more details check debug log."
					+ exceptionObject.getClass().getSimpleName());

		} else if (exceptionObject instanceof StaleElementReferenceException) {

			Assert.fail(CalendarUtility.getCalendarUtilityObject().getTimeStamp("MM/dd/yyyy HH:mm:ss")
					+ "The refernce element no logener present or got chnaged on DOM page. for more details check debug log."
					+ exceptionObject.getClass().getSimpleName());

		} else if (exceptionObject instanceof SessionNotCreatedException) {

			Assert.fail(CalendarUtility.getCalendarUtilityObject().getTimeStamp("MM/dd/yyyy HH:mm:ss")
					+ "The Wendriver performing action immediately after quitting browser. for more details check debug log."
					+ exceptionObject.getClass().getSimpleName());

		} else if (exceptionObject instanceof TimeoutException) {

			Assert.fail(CalendarUtility.getCalendarUtilityObject().getTimeStamp("MM/dd/yyyy HH:mm:ss")
					+ "Wait timeout Exception. for more details check debug log."
					+ exceptionObject.getClass().getSimpleName());

		} else if (exceptionObject instanceof JavascriptException) {

			Assert.fail(CalendarUtility.getCalendarUtilityObject().getTimeStamp("MM/dd/yyyy HH:mm:ss")
					+ "Exception occured when executing JavaScript supplied by user. for more details check debug log."
					+ exceptionObject.getClass().getSimpleName());

		} else if (exceptionObject instanceof ScriptTimeoutException) {

			Assert.fail(CalendarUtility.getCalendarUtilityObject().getTimeStamp("MM/dd/yyyy HH:mm:ss")
					+ "JavaScript on the browser didn't loaded in given time. for more details check debug log."
					+ exceptionObject.getClass().getSimpleName());

		} else if (exceptionObject instanceof WebDriverException) {

			Assert.fail(CalendarUtility.getCalendarUtilityObject().getTimeStamp("MM/dd/yyyy HH:mm:ss")
					+ "WebDriver performing action immediately after 'closing' the browser. for more details check debug log."
					+ exceptionObject.getClass().getSimpleName());

		} else if (exceptionObject instanceof ScreenshotException) {

			Assert.fail(CalendarUtility.getCalendarUtilityObject().getTimeStamp("MM/dd/yyyy HH:mm:ss")
					+ "Exception occured as it not possible to take screenshot. for more details check debug log."
					+ exceptionObject.getClass().getSimpleName());

		}

		// JAVA exception handling
		else if (exceptionObject instanceof NullPointerException) {

			Assert.fail(CalendarUtility.getCalendarUtilityObject().getTimeStamp("MM/dd/yyyy HH:mm:ss")
					+ "Exception is occured when reffering to the members of null object. for more details check debug log."
					+ exceptionObject.getClass().getSimpleName());

		} else if (exceptionObject instanceof ArrayIndexOutOfBoundsException) {

			Assert.fail(CalendarUtility.getCalendarUtilityObject().getTimeStamp("MM/dd/yyyy HH:mm:ss")
					+ "Exception thrown to indicate that an array has been accessed with illegle idex. for more details check debug log."
					+ exceptionObject.getClass().getSimpleName());

		} else if (exceptionObject instanceof StringIndexOutOfBoundsException) {

			Assert.fail(CalendarUtility.getCalendarUtilityObject().getTimeStamp("MM/dd/yyyy HH:mm:ss")
					+ "Exception thrown by String class methods to indicate that an index is either negative  or size of the string . for more details check debug log."
					+ exceptionObject.getClass().getSimpleName());

		} else if (exceptionObject instanceof ClassNotFoundException) {

			Assert.fail(CalendarUtility.getCalendarUtilityObject().getTimeStamp("MM/dd/yyyy HH:mm:ss")
					+ "Exception occured when trying to access the class whose defination is not found. for more details check debug log."
					+ exceptionObject.getClass().getSimpleName());

		} else if (exceptionObject instanceof FileNotFoundException) {

			Assert.fail(CalendarUtility.getCalendarUtilityObject().getTimeStamp("MM/dd/yyyy HH:mm:ss")
					+ "Exception is occured when file is not accessbile or does not open . for more details check debug log."
					+ exceptionObject.getClass().getSimpleName());

		} else if (exceptionObject instanceof IOException) {

			Assert.fail(CalendarUtility.getCalendarUtilityObject().getTimeStamp("MM/dd/yyyy HH:mm:ss")
					+ "Exception occured when an input output operation failed or interupted. for more details check debug log."
					+ exceptionObject.getClass().getSimpleName());

		} else if (exceptionObject instanceof InterruptedException) {

			Assert.fail(CalendarUtility.getCalendarUtilityObject().getTimeStamp("MM/dd/yyyy HH:mm:ss")
					+ "Exception is thrown whena thread is waiting, sleeping or doing some processing  . for more details check debug log."
					+ exceptionObject.getClass().getSimpleName());

		}

		// JSON Exception
		else if (exceptionObject instanceof ParseException) {

			Assert.fail(CalendarUtility.getCalendarUtilityObject().getTimeStamp("MM/dd/yyyy HH:mm:ss")
					+ "Exception occured while parsing the JSON. for more details check debug log."
					+ exceptionObject.getClass().getSimpleName());

		} else if (exceptionObject instanceof JsonException) {

			Assert.fail(CalendarUtility.getCalendarUtilityObject().getTimeStamp("MM/dd/yyyy HH:mm:ss")
					+ "Exception thown to indiate problem with JSON API. for more details check debug log."
					+ exceptionObject.getClass().getSimpleName());

		}

		// Socket Exception
		else if (exceptionObject instanceof ConnectException) {

			Assert.fail(CalendarUtility.getCalendarUtilityObject().getTimeStamp("MM/dd/yyyy HH:mm:ss")
					+ "Exception occured while attempting to connect a scocket to a remote address and port. for more details check debug log."
					+ exceptionObject.getClass().getSimpleName());

		} else if (exceptionObject instanceof BindException) {

			Assert.fail(CalendarUtility.getCalendarUtilityObject().getTimeStamp("MM/dd/yyyy HH:mm:ss")
					+ "Exception as unable to bind a socket to a local port . for more details check debug log."
					+ exceptionObject.getClass().getSimpleName());

		} else if (exceptionObject instanceof NoRouteToHostException) {

			Assert.fail(CalendarUtility.getCalendarUtilityObject().getTimeStamp("MM/dd/yyyy HH:mm:ss")
					+ "Exception due to Network error. for more details check debug log."
					+ exceptionObject.getClass().getSimpleName());

		} else if (exceptionObject instanceof InterruptedIOException) {

			Assert.fail(CalendarUtility.getCalendarUtilityObject().getTimeStamp("MM/dd/yyyy HH:mm:ss")
					+ "Exception while Read operation is blocked for sufficient time to cause a network timeout . for more details check debug log."
					+ exceptionObject.getClass().getSimpleName());

		}

		// SQL Exception
		else if (exceptionObject instanceof SQLSyntaxErrorException) {

			Assert.fail(CalendarUtility.getCalendarUtilityObject().getTimeStamp("MM/dd/yyyy HH:mm:ss")
					+ "Exception due to wrong SQL syntax provided. for more details check debug log."
					+ exceptionObject.getClass().getSimpleName());

		} else if (exceptionObject instanceof SQLException) {

			Assert.fail(CalendarUtility.getCalendarUtilityObject().getTimeStamp("MM/dd/yyyy HH:mm:ss")
					+ "SQL Exception has occured. for more details check debug log."
					+ exceptionObject.getClass().getSimpleName());

		}

		// Other Exception
		else {

			Assert.fail(CalendarUtility.getCalendarUtilityObject().getTimeStamp("MM/dd/yyyy HH:mm:ss")
					+ "Failue due to Exception . for more details check debug log."
					+ exceptionObject.getClass().getSimpleName());

		}
	}

}
