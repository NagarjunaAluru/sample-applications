/**
 * 
 */
package com.galaxe.practice.util;

import java.util.Scanner;

/**
 * @author naluru
 *
 */
public class ThreadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s = "thkjhfsos sd fsfs'pfj s;dhfs;d  24 sdfsodh; ";
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		s = s.replaceFirst("24", "6");
		
		System.out.println(s);
		
		
	}

}
