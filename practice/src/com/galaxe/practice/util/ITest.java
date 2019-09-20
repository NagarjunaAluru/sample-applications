/**
 * 
 */
package com.galaxe.practice.util;

/**
 * @author naluru
 *
 */
public interface ITest {
	
	String methodOne();
	
	default void methodTwo() {
		System.out.println("Test");
		return ;
	}

}
