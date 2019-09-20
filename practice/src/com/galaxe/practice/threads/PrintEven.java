package com.galaxe.practice.threads;

public class PrintEven {
	static int odd=1;
	static int even=2;
	boolean isEven;
	static boolean flag=true;
	
	
	public static void printOddNumbers() {
		while(odd <=100) {
			while(flag) {
				System.out.println("Odd Number:"+odd);
				odd +=2;
				flag = !flag;
			}
		}
	}

	public static void printEvenNumbers() {
		while(even <=100) {
			while(!flag) {
				System.out.println("Even Number:"+even);
				even +=2;
				flag = !flag;
			}
		}
	}
	
	public boolean isEven() {
		return isEven;
	}

	public void setEven(boolean isEven) {
		this.isEven = isEven;
	}
	

}
