package com.wbf.test.service;

import com.wbf.test.model.User;

public interface UserService {
	public User selectAll();
	
	public void deleteOne(int id);
}
