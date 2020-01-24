/**
 * 
 */
package com.practice.core.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author naluru
 *
 */
public class ComparableSortExample {

	/**
	 * @param <E>
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Employee> lst = new ArrayList<>();
		
		lst.add(null);
		for(int i =1;i<10;i++){
			if(i%2 == 0){
				Employee e = new Employee(i, "Name"+i, "SSE", 10000+i, 25+i);
				lst.add(e);
			}
		}
		lst.add(null);
		for(int i =1;i<10;i++){
			if(i%2 != 0){
				Employee e = new Employee(i, "Name"+i, "SSE", 10000+i, 25+i);
				lst.add(e);
			}
		}
		
		lst.add(null);
		
		for(Employee s :lst){
			if(s !=null)
				System.out.println("Before:"+s.toString());
			else
				System.out.println("Before:"+s);
		}
		
		while(lst.remove(null))
			System.out.println("While");
		/*for(Employee e :lst)
			if(e == null)
				lst.remove(e);*/
		
		Collections.sort(lst);
		
		for(Employee s :lst){
			if(s !=null)
				System.out.println("After:"+s.toString());
			else
				System.out.println("After:"+s);
		}
	}

	
	
}
