package com.desmond.ecommerce.interf.dao;

import com.desmond.ecommerce.interf.model.UserModel;

public interface UserDao {
	
	public int regist(UserModel user);
	
	public UserModel login(String username, String pwd);
	
	public int update(UserModel ub);
	
	public int modifyPwd(int userId,String newPwd);
	
	public int getPwd(String userName,String answer,String newPwd);
}
