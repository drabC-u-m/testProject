package com.wbf.test.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wbf.test.dao.mysql.UserMapper;
import com.wbf.test.model.User;
import com.wbf.test.service.UserService;


@Service
public class UserServiceImpl implements UserService{

	@Resource
	private UserMapper userMapper;
	
	public User selectAll() {
		return userMapper.selectAll();
	}

	@Override
	public void deleteOne(int id) {
		userMapper.deleteOne(id);
	}
	
}
