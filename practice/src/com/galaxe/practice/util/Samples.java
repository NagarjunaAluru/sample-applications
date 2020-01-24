/**
 * 
 */
package com.galaxe.practice.util;

/**
 * @author naluru
 *
 */
public class Samples{

	protected int num;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Samples sm = new Samples();
		sm.methodOne();
		System.exit(0);
		int counter = 0;
		
		counter++;
		
		if(counter == 1)
			System.out.println(counter);
		
		
		System.exit(0);
		
		String ss = "test,123";
		
		String arr[] = ss.split(",");
		
		for(String s: arr )
		System.out.println(s);
		
		System.exit(0);
		ifConditions();
		System.exit(0);
		/*String num = "20";
		
		try {
			int i = Integer.parseInt(num);
			System.out.println(i);
			
		}catch(NumberFormatException nfe) {
			nfe.printStackTrace();
			System.out.println(nfe.getMessage());
		}*/
		
		String s=null;
		String s2="";
		
		//System.out.println(s==null?s2==null:s.equalsIgnoreCase(s2));
		
		if(s2.equalsIgnoreCase(s)) {
			System.out.println("In");
		}
		
		
		int val = Integer.valueOf(s2);
		System.out.println(val);

	}
	
	void methodOne(){
		System.out.println(num);
	}
	
	static void ifConditions() {
		int count = 0;
		
		if(count == 0) {
			System.out.println("count == 0");
		}else if(count == 1) {
			System.out.println("count == 1");
		}else if (count == 2) {
			System.out.println("count == 2");
		}else if(count < 3) {
			System.out.println("count < 3");
		}
		
		
	}
	
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}

}
