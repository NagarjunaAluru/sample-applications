/**
 * 
 */
package com.galaxe.practice.core.programs;

import java.util.Scanner;

/**
 * @author naluru
 *
 */
//Output:
//    *
//   * *
//  *   *
// *     *
//*       *
public class DisplayStarts {
	private String input;
	
	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	private DisplayStarts() {
	
	}
	
	public DisplayStarts(String s) {
		this.input = s;
	}

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		DisplayStarts ds = new DisplayStarts();
		System.out.println(ds.toString());
		System.out.println(ds.hashCode());
		System.out.println(Integer.toHexString(ds.hashCode()));
		System.exit(0);

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

