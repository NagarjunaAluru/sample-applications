/**
 * 
 */
package com.practice.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.practice.model.Login;
import com.practice.model.User;
import com.practice.service.UserService;

/**
 * @author naluru
 *
 */
@Controller
public class LoginController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/loginProcess", params="login", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request,
			HttpServletResponse response, @ModelAttribute("login") Login login) {
		ModelAndView mav = null;
		User user = userService.validateUser(login);
		if (null != user) {
			mav = new ModelAndView("welcome");
			mav.addObject("firstname", user.getFirstname());
		} else {
			mav = new ModelAndView("login");
			mav.addObject("message", "User Name or Password is wrong!!");
		}
		return mav;
	}
	
	@RequestMapping(value = "/loginProcess", params="signup", method = RequestMethod.POST)
	public ModelAndView signUp(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("signup");
		return mav;
	}

}
