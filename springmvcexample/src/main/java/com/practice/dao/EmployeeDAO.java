package com.practice.dao;

import java.util.List;

import com.practice.model.EmployeeVO;

/**
 * 
 * @author naluru
 *
 */
public interface EmployeeDAO 
{
	public List<EmployeeVO> getAllEmployees();
}