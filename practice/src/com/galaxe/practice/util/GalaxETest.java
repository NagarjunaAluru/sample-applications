/**
 * 
 */
package com.galaxe.practice.util;

/**
 * @author naluru
 *
 */
public class GalaxETest {
	
	private String type; 
	public String getType() { return type; } 
	public void setType(String type) { this.type = type; } 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//q1();
		//q2();
		//x(5.0);
		q3();
	}
	
	private static void q3() {
		/*for (int ii = 0; ii < 4; ii++) {
			System.out.println("ii = "+ ii);
			ii = ii +1; 
			}*/
		int i;
		for (i=0; i < 4; ++i) {
			System.out.println("i = "+ i);
			}
		System.out.println("i Out = "+ i);
	}
	private static void q1() {
		int result = 30 - 12 / (2*5)+1; 
//		int result = (20+3) +12 + 2 + 8 / 4 * 3;
		System.out.print("Result = " + result); 
	}
	static void q2() {
		GalaxETest obj1 = new GalaxETest(); 
		GalaxETest obj2 = new GalaxETest(); 
		obj1.setType(null); 
		obj2.setType("Fresco"); 
		System.out.print(obj1.getType() + " : " + obj2.getType());
	}
	
	static void x (long i) { System.out.println("one"); } 
	static void x (String s) { System.out.println("two"); } 
	static void x (double d) { System.out.println("three"); }  

}
