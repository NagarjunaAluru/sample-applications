/**
 * 
 */
package com.galaxe.practice.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author naluru
 *
 */
public class TimeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Calendar cal = Calendar.getInstance();
		//cal.setTimeZone(TimeZone.getTimeZone("EST"));
		cal.setTimeZone(TimeZone.getTimeZone("US/Eastern"));
		Date date = cal.getTime();
		System.out.println(date);
		System.out.println(cal.getTimeZone().getDisplayName());*/
		 String timeFormat = "MM/dd/yyyy HH:mm:ss.SSS a zzzz";
		 //System.out.println(getTodaysDay(timeFormat,TimeZone.getTimeZone("US/Eastern")));
		 System.out.println(getTodaysDay(timeFormat,TimeZone.getTimeZone("UTC")));
		 
	}
	
	 public static String getTodaysDay(String dayFormat, TimeZone timeZone)
	  {
	      Date date = new Date();
	      /* Specifying the format */
	      DateFormat requiredFormat = new SimpleDateFormat(dayFormat);
	      /* Setting the Timezone */
	      requiredFormat.setTimeZone(timeZone);
	      /* Picking the day value in the required Format */
	      String strCurrentDay = requiredFormat.format(date).toUpperCase();
	      return strCurrentDay;
	   }

}
