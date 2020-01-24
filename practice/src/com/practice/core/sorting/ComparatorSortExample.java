/**
 * 
 */
package com.practice.core.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.galaxe.practice.util.Employee;

/**
 * @author naluru
 *
 */
public class ComparatorSortExample {

	/**
	 * @param <E>
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Employee> lst = new ArrayList<>();
		
		for(int i =1;i<10;i++){
			if(i%2 == 0){
				Employee e = new Employee(i, "Name"+i, "SSE", 10000+i, 25+i);
				lst.add(e);
			}
		}
		
		for(int i =1;i<10;i++){
			if(i%2 != 0){
				Employee e = new Employee(i, "Name"+i, "SSE", 10000+i, 25+i);
				lst.add(e);
			}
		}
		
		for(Employee s :lst)
			System.out.println("Before:"+s.toString());
		
		Collections.sort(lst,new EmpAgeComparator());
		
		for(Employee s :lst)
			System.out.println("After:"+s.toString());
	}

	
	
}
