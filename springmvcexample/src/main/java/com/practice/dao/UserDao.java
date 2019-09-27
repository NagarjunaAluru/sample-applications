/**
 * 
 */
package com.practice.dao;

import com.practice.model.Login;
import com.practice.model.User;

/**
 * @author naluru
 *
 */
public interface UserDao {

	  void register(User user);
	  User validateUser(Login login);
}
