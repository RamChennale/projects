package com.qa.stdReports;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CalendarUtility {
	
	private static CalendarUtility calendarUtilityObject;
	
	private CalendarUtility() {
		
	}
	
	public synchronized static CalendarUtility getCalendarUtilityObject() {
		return (calendarUtilityObject == null ) ? new CalendarUtility() : calendarUtilityObject;
	}

	public synchronized String getTimeStamp(String dateFormat) {
		Date curreantDate = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
		return simpleDateFormat.format(curreantDate);
	}
}
