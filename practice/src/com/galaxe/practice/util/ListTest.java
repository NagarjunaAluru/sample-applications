/**
 * 
 */
package com.galaxe.practice.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author naluru
 *
 */
public class ListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> numsList = new ArrayList<String>();
		numsList.add("One");
		numsList.add("Two");
		numsList.add("Two");
		numsList.add("Three");
		numsList.add("Four");
		numsList.add("Five");
		numsList.add("Six");
		numsList.add("seven");
		numsList.add("Eight");
		numsList.add("Nine");
		numsList.add("Ten");
		
		numsList.remove("Two");
		for(int i=1;i<=numsList.size();i++) {
			System.out.println(numsList.get(i-1));
			
		}
		
		
	}

}
