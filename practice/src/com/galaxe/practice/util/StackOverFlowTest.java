/**
 * 
 */
package com.galaxe.practice.util;

/**
 * @author naluru
 *
 */
public class StackOverFlowTest {

	/**
	 * @param args
	 */
	public static final void main(String[] args) {
		Object o = new Object();
		Employee e = null;
		//System.out.println(e.getName());
		//e.methodOne();
		String s = new String("Nag");
		String s1 = new String("Nag");
		 String s2 = "Nag";
		 String s3 = "Nag";
		/* System.out.println(s == s2);//f
		 System.out.println(s2 == s3);//t
		 System.out.println(s == s3);//f
*/		 //s.intern();
		 System.out.println(s == s2);//t
		 System.out.println(s2 == s3);//t
		 System.out.println(s == s3);//t
		 System.out.println(s == s1);//t
		 System.out.println(s == s2);//t
		 System.out.println(s == s3);//t
		 
		 System.out.println(s.hashCode());
		 System.out.println(s1.hashCode());
		 System.out.println(s2.hashCode());
		 System.out.println(s3.hashCode());
		
		/*Employee e = new Employee("NIHAR", "SSE");
		System.out.println(e.hashCode());
		e.setName("Nagarjuna");
		System.out.println(e.hashCode());*/
		
		/*try {
			methodOne();
		}catch(Exception e) {
			System.out.println("Error occured: "+e.getMessage());
			//e.printStackTrace();
		}*/
	}

	/*private static void methodOne() {
		methodTwo();
		
	}

	private static void methodTwo() {
		methodOne();
	}*/

}
