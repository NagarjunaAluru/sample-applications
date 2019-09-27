/**
 * 
 */
package com.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.dao.UserDao;
import com.practice.model.Login;
import com.practice.model.User;

/**
 * @author naluru
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	/* (non-Javadoc)
	 * @see com.practice.service.UserService#validateUser(com.practice.model.Login)
	 */
	@Override
	public User validateUser(Login login) {
		return userDao.validateUser(login);
	}

}
