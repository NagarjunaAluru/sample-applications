/**
 * 
 */
package com.nag.practice.datastructures;

import java.util.LinkedList;

/**
 * @author naluru
 *
 */
public class MyLinkedList {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		System.out.println(ll.size());
		
		for(String s:ll)
			System.out.println(s);
		
		
	}
}
