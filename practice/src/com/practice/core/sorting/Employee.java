/**
 * 
 */
package com.practice.core.sorting;

/**
 * @author naluru
 * @param <T>
 *
 */
public class Employee implements Comparable<Employee> {

	private int empId;
	private String EmpName;
	private String designation;
	private double salary;
	private int age;
	

	public Employee(int empId, String empName, String designation,
			double salary, int age) {
		super();
		this.empId = empId;
		EmpName = empName;
		this.designation = designation;
		this.salary = salary;
		this.age = age;
	}
	
	@Override
	public int compareTo(Employee o) {
		if(o == null)
			return 0;
		else return empId - o.getEmpId();
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", EmpName=" + EmpName
				+ ", designation=" + designation + ", salary=" + salary
				+ ", age=" + age + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
