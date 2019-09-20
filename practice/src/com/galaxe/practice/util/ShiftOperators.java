/**
 * 
 */
package com.galaxe.practice.util;

/**
 * @author naluru
 *
 */
public class ShiftOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Object key = args;
		        int h;
		         
		//System.out.println((key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16));
		        
        System.out.println(Integer.toBinaryString(100 << 3)); 
        System.out.println(100 << 3); 
	}

}
