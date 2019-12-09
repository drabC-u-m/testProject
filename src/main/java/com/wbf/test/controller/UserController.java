package com.wbf.test.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wbf.test.model.User;
import com.wbf.test.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping("index")
	public ModelAndView index(HttpServletRequest request , HttpServletResponse response){
		User user = userService.selectAll();
		ModelAndView mod = new ModelAndView("user");
		mod.addObject(user);
		return mod;
	}
}
