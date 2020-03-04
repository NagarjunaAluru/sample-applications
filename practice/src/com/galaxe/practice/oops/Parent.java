/**
 * 
 */
package com.galaxe.practice.oops;

/**
 * @author naluru
 *
 */
public class Parent {
//	protected int j;
	public Parent(){
		System.out.println("Parent Constructor");
	}
	
	static{
		System.out.println("Output from Parent Static block");
	}
	
	{
		System.out.println("Output from Parent instance block");
	}
/*	final public String methodOne()throws Throwable{
		System.out.println("Parent");
		return "Parent";
	}
	
	
	public static String methodThree(){
		System.out.println("Parent Static");
		return "Parent";
	}
	
	public String methodTwo(Number n)throws RuntimeException{
		System.out.println("Parent Number");
		return "Parent";
	}*/
	

}
