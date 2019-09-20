/**
 * 
 */
package com.galaxe.practice.util;

import java.util.Arrays;

/**
 * @author naluru
 *
 */
public class CallByReferenceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		test(1,8);
		System.exit(0);
		int i = 5;
		int arr[] = {0,1,2,3,4,5};
		StringBuffer s = new StringBuffer("Nag");
		arrTest(i,arr,s);
		System.out.println("i:"+i);
		System.out.println("arr:"+Arrays.toString(arr));
		System.out.println("s:"+s.toString());
		
	}

	private static void test(int i, Integer j) {
		System.out.println("Interger:"+i+":"+j);
		
	}

	private static void test(int i, int j) {
		System.out.println("int:"+i+":"+j);
		
	}

	private static void arrTest(int i, int[] arr,StringBuffer s) {
		arr[1] = i;
		i = 10;
		s.append("Arjun");
	}

	
}
