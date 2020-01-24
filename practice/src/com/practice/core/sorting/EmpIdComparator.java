/**
 * 
 */
package com.practice.core.sorting;

import java.util.Comparator;

/**
 * @author naluru
 *
 */
public class EmpIdComparator implements Comparator<com.galaxe.practice.util.Employee>{


	@Override
	public int compare(com.galaxe.practice.util.Employee o1,
			com.galaxe.practice.util.Employee o2) {
		return o1.getAge()-o2.getAge();
	}

}
