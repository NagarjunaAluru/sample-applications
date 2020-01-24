/**
 * 
 */
package com.practice.core.sorting;

import java.util.Comparator;

/**
 * @author naluru
 *
 */
public class EmpAgeComparator implements Comparator<com.galaxe.practice.util.Employee>{


	@Override
	public int compare(com.galaxe.practice.util.Employee o1,
			com.galaxe.practice.util.Employee o2) {
		return o2.getEmpId()-o1.getEmpId();
	}

}
