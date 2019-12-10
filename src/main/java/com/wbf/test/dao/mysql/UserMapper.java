package com.wbf.test.dao.mysql;

import org.apache.ibatis.annotations.Param;

import com.wbf.test.model.User;

public interface UserMapper {
	
	public User selectAll();
	
	public void deleteOne(@Param("id")int id);
	
}
