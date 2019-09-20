/**
 * 
 */
package com.galaxe.practice.util;

/**
 * @author naluru
 *
 */
public class ObjectCreationTypes{

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, CloneNotSupportedException {

		// Way 1
		Samples sample = new Samples();
		System.out.println(sample);
		//Way 2
		Samples sample2 = (Samples) Class.forName("com.galaxe.practice.util.MyObject").newInstance();
		System.out.println(sample2);
		//Way3
		Samples sample3 = (Samples) sample.clone();
		System.out.println(sample3);
		//Way4
		
		System.out.println(sample);
		System.out.println(sample);
	}

}
