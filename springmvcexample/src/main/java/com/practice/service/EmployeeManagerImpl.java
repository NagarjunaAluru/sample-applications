package com.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.dao.EmployeeDAO;
import com.practice.model.EmployeeVO;

/**
 * 
 * @author naluru
 *
 */
@Service
public class EmployeeManagerImpl implements EmployeeManager {

	@Autowired
	EmployeeDAO dao;
	
	public List<EmployeeVO> getAllEmployees() 
	{
		return dao.getAllEmployees();
	}
}
