/**
 * 
 */
package com.galaxe.practice.util.innerclass;

/**
 * @author naluru
 *
 */
public class MyOuterClassDemo {

	private int x = 1;

	public void innerInstance() {
		MyInnerClassDemo inner = new MyInnerClassDemo();
		inner.seeOuter();
	}

	// inner class definition
	class MyInnerClassDemo {
		public void seeOuter() {
			System.out.println("Outer Value of x is :" + x);
		}
	} // close inner class definition
	
	public static void main(String args[]) {
		/*MyOuterClassDemo obj = new MyOuterClassDemo();
		obj.innerInstance();*/
		
		 MyOuterClassDemo.MyInnerClassDemo inner = new MyOuterClassDemo().new MyInnerClassDemo();
		  inner.seeOuter();
	}
	
}
