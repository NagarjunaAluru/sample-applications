/**
 * 
 */
package com.galaxe.practice.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**
 * @author naluru
 *
 */
public class MapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("vinni", "three");
		map.put("Nag", "nine");
		map.put("bag", "ten");
		
		map.values().forEach(l->System.out.println("Values:"+l));
		
		Set<Entry<String, String>> vals = map.entrySet();
		
		Iterator it = vals.iterator();
		
		while(it.hasNext()) {
			//Map<Entry> ent = it.next();
		}
		

	}

}
