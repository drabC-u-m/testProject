package com.wbf.test.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.wbf.test.model.User;
import com.wbf.test.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	
	private final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	private final Logger actionLoglogger = LoggerFactory.getLogger("actionLog");
	
	@Resource
	private UserService userService;
	
	@RequestMapping("index")
	public ModelAndView index(HttpServletRequest request , HttpServletResponse response){
		actionLoglogger.info("测试actionLog");
		logger.info("user/index");
		User user = userService.selectAll();
		ModelAndView mod = new ModelAndView("user");
		mod.addObject(user);
//		JSONObject json = new JSONObject();
//		json.put("user",user);
		return mod;
	}
	
	@RequestMapping("deleteOne")
	public ModelAndView deleteOne(HttpServletRequest request , HttpServletResponse response,int id){
		logger.info("user/delete");
		userService.deleteOne(id);
		ModelAndView mod = new ModelAndView("user");
		return mod;
	}
	@RequestMapping("login")
	public void login(HttpServletRequest request , HttpServletResponse response,
			String username,String password) throws IOException{
		request.getSession().setAttribute("role", "1");
		response.sendRedirect(request.getContextPath()+"/user/index");
	}
}
