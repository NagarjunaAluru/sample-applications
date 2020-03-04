/**
 * 
 */
package com.galaxe.practice.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author naluru
 *
 */
public class RepeatedNumsDecOrderDisplay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(5);list.add(5);list.add(5);list.add(5);
		list.add(4);list.add(4);list.add(4);
		list.add(2);list.add(2);list.add(2);
		list.add(1);list.add(1);list.add(1);list.add(1);
		
		Map<Integer, Long> result = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		Map<Integer, Long> sorted = result
				        .entrySet()
				        .stream()
				        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				        .collect(
				        		Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
				                LinkedHashMap::new));

	}

}
