/**
 * 
 */
package com.galaxe.practice.oops;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * @author naluru
 *
 */
public class PolymophismExamples extends Parent{
	int j;
	
	/*public String methodOne(){
		System.out.println("Parent");
		return "Parent";
	}*/
	
	static {
		System.out.println("Child static block");
	}
	{
		System.out.println("Output from Child instance block");
	}
	PolymophismExamples(){
		System.out.println("Child Constructor");
	}

	/**
	 * @param args
	 * @throws Throwable 
	 */
	public static void main(String[] args) throws Throwable {
		Parent pp = new PolymophismExamples();
		/*int n = 3;
		int n2 = 3;*/
		/*pp.methodTwo(n++);
		pp.methodTwo(++n2);*/
		/*System.out.println("Now:"+n);
		System.out.println("Now:"+n2);*/
		System.out.println("#########");
		new PolymophismExamples();
		
		System.exit(0);
		/*long l = 10;
		String s ="";
		for(int i=1;i<=l;i++)
			s += Integer.toBinaryString(i);*/
		//Arrays.stream(new long[(int) l]).forEach(n->System.out.println(Long.toBinaryString(n)));
		
		
		
		/*Stream.iterate(1, n -> n)
        .limit(l)
        .forEach(x -> s += Integer.toBinaryString(x));*/
		
		/*System.out.println(s);
		long l2 = Integer.parseInt(s, 2);
		System.out.println(l2);
		System.exit(0);
		
		PolymophismExamples p = new PolymophismExamples();
		Parent p2 = new PolymophismExamples();
		p2.methodOne();
		PolymophismExamples ss = (PolymophismExamples) new Parent();
		ss.methodFour(9);*/
		//p.methodTwo(1);
		
	}

	/*public String methodOne(){
		System.out.println("Child");
		return "Parent";
	}*/
	
	/*public String methodTwo(Integer i)throws RuntimeException{
		System.out.println("Child Integer");
		return "Parent";
	}*/
	
	/*public String methodTwo(Number n)throws RuntimeException{
		System.out.println("Child Number"+n);
		return "Parent";
	}
	
	public String methodFour(Number n)throws RuntimeException{
		System.out.println("Child Number");
		return "Parent";
	}
	
	public static String methodFive()throws RuntimeException{
		System.out.println("static methodFive");
		return "Parent";
	}*/
	
}
