package com.galaxe.practice.util;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author naluru
 *
 */
public class ArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//arrayRotation();
		//arraySwaping();
		multiDimentionalArraySwaping();
	}

	private static void arrayRotation() {
		int arr[] = {};
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of rotations:");
		int count = sc.nextInt();
		System.out.println("Enter 0 for backward or enter 1 for forward rotation");
		int direction = sc.nextInt();
		
		if(direction == 0){
			System.out.println(direction);
		}else {
			System.out.println(direction);
		}
	}

	private static void arraySwaping() {
		int arr[] = {1,2,3,4,5,6};
		
		for(int i=0;i<(arr.length/2);i++){
				int temp = arr[i];
				arr[i] = arr[arr.length-1-i];
				arr[arr.length-1-i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void multiDimentionalArraySwaping() {
		String arr[][] = {  { "a1", "a2", "a3" }, 
							{ "b1", "b2", "b3" },
							{ "c1", "c2", "c3" } };

		for (String[] ar : arr)
			System.out.println(Arrays.toString(ar));

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i > j) {
					System.out.println(arr[i][j] + " swaping with "+ arr[j][i]);
					String temp = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] = temp;
				}
			}
		}
		System.out.println("=========");
		for (String[] ar : arr)
			System.out.println(Arrays.toString(ar));

	}

}
