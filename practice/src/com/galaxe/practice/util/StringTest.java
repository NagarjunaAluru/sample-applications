/**
 * 
 */
package com.galaxe.practice.util;

import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

/**
 * @author naluru
 *
 */
public class StringTest {

	private static String chair,table="metal";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		exeTimeTest();
		System.exit(0);
		int meal=5;
		//int tip=2;
		//int total= meal+(meal>6?++tip:tip++);
		for(int tip=2;tip<3;tip++)
			System.out.println("tip:"+tip);
		
		//System.out.println(tip);
		System.exit(0);
		chair = chair +table;
		System.out.println(chair);
		
		System.exit(0);
		findSubString();
		//replaceString();
		
		System.exit(0);
		String s1 = "123";
		String s2 = null;
		
		System.out.println("test".equals(s2));
		
		int i ;
		boolean val = false;
		
		if(val) {
			i = 10;
		}else
			i=20;
		
		System.out.println(i);
		
		System.exit(0);
		
		Map<String,String> map = new HashMap<String,String>();
		map.put(null, "tets");
		map.put(null, "tets123");
		
		for(String s : map.keySet()) {
			System.out.println(map.get(s));
		}
		
		//split();
		System.exit(0);
	//	StringJoiner sj = new StringJoiner("],[", "[", "]");
		StringBuffer sb = new StringBuffer();
		StringBuilder s = new StringBuilder();
		
		/*for(int i=0;i<10;i++) {
			sj.add(i+"");
		}
		System.out.println(sj);
		for(int i=20;i<30;i++) {
			sj.add(i+"");
		}
		System.out.println(sj);*/
		
		/*for(int i=1;i<20;i++) {
			if(i%5==0) System.out.println("Its Divided :" +i);
			else System.out.println(i);
			
		}*/
		
		String name = "Nagarjuna";
		ListTest lt = new ListTest();
		Method[] methods = lt.getClass().getMethods();
		
		for(Method method : methods) {
			System.out.println(method.toString());
		}
		//String newName = name.replace("a", "@");
		//System.out.println(newName);
	}

	private static void findSubString() {
		String name = "NAGARJUNA";
		String sub ="ARJ";
		
		int subL = sub.length(); 
        int mainL = name.length(); 
      
        /* A loop to slide pat[] one by one */
        for (int i = 0; i <= mainL - subL; i++) { 
        	int j;
            for (j = 0; j < subL; j++) 
                if (name.charAt(i + j) != sub.charAt(j)) 
                    break; 
      
            if (j == subL) {
                System.out.println("Matching");
                break;
            }
        } 
	}

	private static void replaceString() {
		String content = "This :currentDate is to test String :currentDate Replacement.";
		
		Date date = Calendar.getInstance().getTime();
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String currentDate = dateFormat.format(date);
		System.out.println(currentDate);
		
		//System.out.println(content.replace(":currentDate", currentDate));
		
	}

	private static void split() {
		      String test = "am preparing for CPJP tyseffn sdsd";
		      String[] tokens = test.split("\\s");
		      System.out.println(tokens.length);
		
	}
	
	private static void exeTimeTest(){
		long start = System.currentTimeMillis();
		
		long l = 10;
		String s ="";
		
		for(int i=1;i<=l;i++)
			s += Integer.toBinaryString(i);
		
		long l2 = Integer.parseInt(s, 2);
		System.out.println(l2);
		long end = System.currentTimeMillis();
		System.out.println(end - start);

	}

}
