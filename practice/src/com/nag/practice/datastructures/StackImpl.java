/**
 * 
 */
package com.nag.practice.datastructures;

import java.util.Stack;

/**
 * @author naluru
 *
 */
public class StackImpl<E> {

	public static final int   MAX_VALUE = 0x7fffffff;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(MAX_VALUE);
		Stack<String> s = new Stack<String>();
		s.add("Nag");
		s.add("Arjun");
		s.add("Aluru");
		System.out.println(s.capacity());
		System.out.println(s.empty());
		System.out.println(s.elementAt(1));
		System.out.println(s.firstElement());
		System.out.println(s.get(2));
		System.out.println(s.contains("Aluru"));
		System.out.println(s.lastElement());
		System.out.println(s.lastIndexOf("Nag"));
	}
}
