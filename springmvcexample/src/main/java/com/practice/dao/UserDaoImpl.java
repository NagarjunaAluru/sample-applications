/**
 * 
 */
package com.practice.dao;

import org.springframework.stereotype.Repository;

import com.practice.model.Login;
import com.practice.model.User;

/**
 * @author naluru
 *
 */
@Repository
public class UserDaoImpl implements UserDao {

	public void register(User user) {
	}

	public User validateUser(Login login) {
		User user = null;
		if(login != null && login.getUserName() != null && login.getUserName().equalsIgnoreCase("Nagarjuna")
				&& login.getPassword() != null && login.getPassword().equalsIgnoreCase("Test")) {
			user = new User();
			user.setFirstname(login.getUserName());
		}
		return user;
	}
}
