/**
 * 
 */
package com.galaxe.practice.core.programs;

import java.util.Scanner;

/**
 * @author naluru
 *
 */
/*Output:
    *
   * *
  *   *
 *     *
*       **/
public class DisplayStarts {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int inputVal = input.nextInt();
		
		for(int i=1;i<=inputVal;i++) {
			printSpaces(inputVal-i);
			printStarts(i);
			System.out.println("");
		}

	}

	private static void printStarts(int i) {
		for(int j=1;j<=(i*2-1);j++) {
			if(j==1 || j==(i*2-1)) {
				System.out.print("*");
			}else 
				System.out.print(" ");
		}
		
	}

	private static void printSpaces(int n) {
		for(int j=n;j>=1;j--) {
			System.out.print(" ");
		}
		
	}

}

