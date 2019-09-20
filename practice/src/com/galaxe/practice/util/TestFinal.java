/**
 * 
 */
package com.galaxe.practice.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author naluru
 *
 */
public final class TestFinal {
	public TestFinal(){
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
	}
	
	private final List<String> list = new ArrayList<>();
	
	public List<Object> getListItems() {
		/*List<String> l = new ArrayList<>();
		for(String s : list) {
			l.add(s);
		}*/
		return Arrays.asList(Arrays.copyOf(list.toArray(), list.size()));
	}

}
