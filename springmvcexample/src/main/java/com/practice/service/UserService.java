/**
 * 
 */
package com.practice.service;

import com.practice.model.Login;
import com.practice.model.User;

/**
 * @author naluru
 *
 */
public interface UserService {
	
	public User validateUser(Login login);

}
