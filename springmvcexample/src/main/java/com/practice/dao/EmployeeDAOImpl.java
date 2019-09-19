package com.practice.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.practice.model.EmployeeVO;

/**
 * 
 * @author naluru
 *
 */
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	// Database connections and CURD operations code will goes here
	public List<EmployeeVO> getAllEmployees() 
	{
		List<EmployeeVO> employees = new ArrayList<EmployeeVO>();
		
		EmployeeVO vo1 = new EmployeeVO();
		vo1.setId(1);
		vo1.setFirstName("Nagarjuna");
		vo1.setLastName("Aluru");
		employees.add(vo1);
		
		EmployeeVO vo2 = new EmployeeVO();
		vo2.setId(2);
		vo2.setFirstName("Kishore");
		vo2.setLastName("Gorla");
		employees.add(vo2);
		
		EmployeeVO vo3 = new EmployeeVO();
		vo3.setId(3);
		vo3.setFirstName("Harish");
		vo3.setLastName("Yeluru");
		employees.add(vo3);
		
		EmployeeVO vo4 = new EmployeeVO();
		vo4.setId(4);
		vo4.setFirstName("Pawan Kalyan");
		vo4.setLastName("Gorla");
		employees.add(vo4);
		
		return employees;
	}
}