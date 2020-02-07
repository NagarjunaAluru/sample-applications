/**
 * 
 */
package com.galaxe.practice.util;

import java.util.Scanner;

/**
 * @author naluru
 *
 */
public class ArraySpiral {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter length of th Array");
			int length = sc.nextInt();
			
			int[][] arr = new int[length][length];
			
			int value = 1; 
			
			int minRow=0,maxRow=length-1;
			int minCol=0,maxCol=length-1;
			
			while(value <= (length*length)){
				
				for(int i=minRow;i<=maxCol;i++){
					arr[minRow][i] = value;
					value++;
				}
				
				for(int j=minRow+1;j<=maxRow;j++){
					arr[j][maxCol] = value;
					value++;
				}
				
				for(int i=maxCol-1;i>=minCol;i--){
					arr[maxRow][i] = value;
					value++;					
				}
				
				for(int j=maxRow-1;j>=minRow+1;j--){
					arr[j][minCol]=value;
					value++;
				}
				minRow++;
				maxRow--;
				minCol++;
				maxCol--;
			}
			
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr.length;j++){
					System.out.print(arr[i][j]+" ");
					if(arr[i][j]<9)
						System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
}
