/**
 * 
 */
package com.galaxe.practice.util;

/**
 * @author naluru
 *
 */
public class Employee {
	
	private String name;
	private String designation;
	
	public Employee(String name, String designation) {
		this.name = name;
		this.designation = designation;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
