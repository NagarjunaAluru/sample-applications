/**
 * 
 */
package com.galaxe.practice.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author naluru
 *
 */
public class ListRemoveTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		
		Integer val = 2;
		list2.remove(val);
		
		list2.forEach(l2-> System.out.println(l2));
		
		System.exit(0);
		List<String> list = new ArrayList<>();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		Map<String,String> map = new HashMap<>();
		map.put("1", "One");
		map.put("2", "Two");
		map.put("3", "Three");
		
		map.forEach((key,value) ->{
			System.out.println("Key:"+key);
			System.out.println("Value:"+value);
		});
		
		System.out.println("@@@@@@@@");
		for(Map.Entry<String, String> m :map.entrySet()) {
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		
		System.exit(0);
		
		/*while(flag) {
			list.forEach(s -> {
				if(s.equals("2") || s.equals("4")) {
					list.remove(s);
					break;
				}
			} );
		}*/
		
		
		boolean flag =true;
		
		while(flag) {
			int counter =0;
			for(String s :list) {
				if(s.equals("2") || s.equals("4")) {
					list.remove(s);
					break;
				}
				counter++;
			}
			if(counter == list.size())
				break;
		}
		
		
		list.forEach(n -> System.out.println(n)); 
		

	}

}
