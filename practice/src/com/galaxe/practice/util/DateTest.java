/**
 * 
 */
package com.galaxe.practice.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author naluru
 *
 */
public class DateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.exit(0);

		String dateStart = "2019.03.28.16:00:00";

		//HH converts hour in 24 hours format (0-23), day calculation
		SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd.HH:mm:ss");

		Date d1 = null;
		Date d2 = Calendar.getInstance().getTime();

		try {
			d1 = format.parse(dateStart);

			//in milliseconds
			long diff = d2.getTime() - d1.getTime();

			long diffSeconds = diff / 1000 % 60;
			long diffMinutes = diff / (60 * 1000) % 60;
			long diffHours = diff / (60 * 60 * 1000) % 24;
			long diffDays = diff / (24 * 60 * 60 * 1000);

			System.out.print(diffDays + " days, ");
			System.out.print(diffHours + " hours, ");
			System.out.print(diffMinutes + " minutes, ");
			System.out.println(diffSeconds + " seconds.");
			System.out.println(diffHours*60+diffMinutes+" Only Minutes");
	}catch(Exception e) {
		e.printStackTrace();
	}
	}

	private static void exit(int i) {
		// TODO Auto-generated method stub
		
	}
}
