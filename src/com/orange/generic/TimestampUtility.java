package com.orange.generic;

import java.util.Calendar;

public class TimestampUtility {

	static Calendar cal = Calendar.getInstance();
	static int year = cal.get(Calendar.YEAR);
	static	int month = cal.get(Calendar.MONTH) + 1;
	static	int day = cal.get(Calendar.DATE);
	static int hour = cal.get(Calendar.HOUR_OF_DAY);
	static int min = cal.get(Calendar.MINUTE);
	static int sec = cal.get(Calendar.SECOND);
	static String timestamp = year + ":" + month + ":" + day + ":" + hour + ":" + min + ":" + sec;
}
