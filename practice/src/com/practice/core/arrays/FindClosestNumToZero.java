/**
 * 
 */
package com.practice.core.arrays;

/**
 * @author naluru
 *
 */
public class FindClosestNumToZero {
	int a = 10+b;
	static int b =5;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    int[] arr = {-2,7,4,2};
	    
	    int max = Integer.MAX_VALUE;
	    int closest = 0;
	    
	    for (int i = 0; i < arr.length; i++){
	        int value = arr[i];
	        int abs = Math.abs(value);
	        if (abs < max){
	            max = abs;
	            closest = value;
	        }else if (abs == max){
	            if (value > closest){
	                closest = value;
	            }
	        }
	    }
	    
	    System.out.println("Closest to Zero:"+closest);
	}
}
