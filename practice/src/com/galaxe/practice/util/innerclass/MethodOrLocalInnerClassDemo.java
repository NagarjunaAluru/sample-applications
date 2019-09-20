/**
 * 
 */
package com.galaxe.practice.util.innerclass;

/**
 * @author naluru
 *
 */
public class MethodOrLocalInnerClassDemo {

	private int x = 1;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void doThings(){
	      String name ="local variable";
	      // inner class defined inside a method of outer class
	      class MyInnerClassDemo {
	        public void seeOuter () {
	           System.out.println("Outer Value of x is :" + x);
	           System.out.println("Value of name is :" + name);//compilation error!!
	        } //close inner class method
	      } // close inner class definition
	   } //close Top level class method
}
