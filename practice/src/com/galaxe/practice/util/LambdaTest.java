/**
 * 
 */
package com.galaxe.practice.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author naluru
 *
 */
public class LambdaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> nameList = new ArrayList<String>();
		
		nameList.add("One");
		nameList.add("Two");
		nameList.add("Three");
		nameList.add(null);
		nameList.add("Four");
		nameList.add("Five");
		
		nameList.forEach(name-> {
			if("O1ne".equals(name))
			System.out.println(name);
		});
		
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("Six", 6);
		map.put("Seven", 7);
		map.put("Eight", 8);
		map.put("Nine", 9);
		map.put("Ten", 10);
		map.put(null, 11);
		
		map.forEach((k,v) -> {
			if(k == null)
				System.out.print(0);
			else
			System.out.print((k.hashCode()%16));
			System.out.println(" K:"+k+" V:"+v);
		});
		

	}

}
