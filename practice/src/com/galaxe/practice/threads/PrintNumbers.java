/**
 * 
 */
package com.galaxe.practice.threads;

/**
 * @author naluru
 *
 */
public class PrintNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		PrintOddEvenNummbers odd = new PrintOddEvenNummbers(true);
		PrintOddEvenNummbers even = new PrintOddEvenNummbers(false);
		
		
		Thread t1 = new Thread(odd);
		Thread t2 = new Thread(even);
		
		t2.start();
		t1.start();
		
		
	}

}
