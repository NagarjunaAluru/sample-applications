/**
 * 
 */
package com.galaxe.practice.util;

import java.util.List;

/**
 * @author naluru
 *
 */
public class TestFinalClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TestFinal tf = new TestFinal();
		System.out.println(tf);
		List<Object> newList = tf.getListItems();
		for(Object s : newList)
			System.out.println("Exist:"+s);
		
		newList.add("N");
		for(Object s : newList)
			System.out.println("After adding:"+s);
		
		List<Object> newL = tf.getListItems();
		for(Object s : newL)
			System.out.println("Existing:"+s);
		System.out.println(tf);
	}
	
	

}
