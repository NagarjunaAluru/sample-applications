/**
 * 
 */
package com.nag.practice.datastructures;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author naluru
 *
 */
public class StackImplUsingQueues<E> implements Iterable<E>{
	
	 Queue<E> q1 = new LinkedList<E>(); 
     Queue<E> q2 = new LinkedList<E>(); 
     
     
     int curr_size; 
     
     StackImplUsingQueues(){ 
         curr_size = 0; 
     } 

     void push(E x) 
     { 
         curr_size++; 

         // Push x first in empty q2 
         q2.add(x); 

         // Push all the remaining 
         // elements in q1 to q2. 
         while (!q1.isEmpty()) { 
             q2.add(q1.peek()); 
             q1.remove(); 
         } 

         // swap the names of two queues 
         Queue<E> q = q1; 
         q1 = q2; 
         q2 = q; 
     } 

     void pop(){ 

         // if no elements are there in q1 
         if (q1.isEmpty()) 
             return; 
         q1.remove(); 
         curr_size--; 
     } 
     
     E peek(){ 
         if (q1.isEmpty()) 
             return null; 
         return q1.peek(); 
     } 

     E top(){ 
         if (q1.isEmpty()) 
             return null; 
         return q1.peek(); 
     } 

     int size() 
     { 
         return curr_size; 
     } 
     

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		StackImplUsingQueues<String> a= new StackImplUsingQueues<String>();
		a.push("Nag");
		a.push("Arjun");
		a.push("Aluru");
		System.out.println(a.top());
		for(String s :a){
			System.out.print(s);
			Thread.sleep(1000);
		}
		

	}

	@Override
	public Iterator<E> iterator() {
		
		return new CustomIterator<E>();
	}

	class CustomIterator<E> implements Iterator<E>{
		
	/*	 // constructor 
	   CustomIterator<E>(StackImplUsingQueues<E> obj) { 
	        // initialize cursor 
	    }*/ 

		@Override
		public boolean hasNext() {
			Iterator<E> it = (Iterator<E>) q1.iterator();
			return it.hasNext();
		}

		@Override
		public E next() {
			Iterator<E> it = (Iterator<E>) q1.iterator();
			return it.next();
		}
		
	}
	
}
