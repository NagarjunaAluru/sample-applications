/**
 * 
 */
package com.practice.exception.handling;


/**
 * @author naluru
 *
 */
public class ExceptionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s = "Nag";
		String s2 = new String("Nag");
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s == s2);
		System.out.println(s.equals(s2));
		System.exit(0);
		int output = methodOne();
		System.out.println(output);

	}

	private static int methodOne() {
		try{
			Integer.parseInt("4h");
			return 1;
		}catch(NumberFormatException | NullPointerException nfe){
			System.exit(0);
			return 2;
		}finally{
			return 3;
		}
	}

}
