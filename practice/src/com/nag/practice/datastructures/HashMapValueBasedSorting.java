/**
 * 
 */
package com.nag.practice.datastructures;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author naluru
 *
 */
public class HashMapValueBasedSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("A".hashCode());
		System.out.println("a".hashCode());
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("A", "zysuc");
		map.put("B", "Xorient");
		map.put("C", "Yearn");
		
		System.out.println("Before Sorting");
		map.forEach((K,V)-> System.out.println(K+"=>"+V));
		
		List<Map.Entry<String,String>> list = new LinkedList<>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, String>>() {

			@Override
			public int compare(Entry<String, String> o1,
					Entry<String, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
		
		System.out.println("After Sorting");
		for(Map.Entry<String,String> et : list)
			System.out.println(et.getKey()+"=>"+et.getValue());
		
		

	}

}
