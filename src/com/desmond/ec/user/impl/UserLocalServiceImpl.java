package com.desmond.ec.user.impl;

import java.util.List;

import com.desmond.ec.user.intf.User;
import com.desmond.ecommerce.form.UserForm;

public class UserLocalServiceImpl extends UserServiceBaseImpl{
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. 
	 * Add your custom code here.
	 */
	
	public User login(UserForm uf) {
		User user = null;
		List<User> userList = this.getDao().findByNamePwd(uf.getName(), uf.getPassword());
		
		return userList != null && userList.size() > 0 ? userList.get(0) : user;
	}
	
	public boolean changePassword(UserForm uf) {
		boolean isSuccess = false;
		User user = this.fetchByPrimaryKey(uf.getUserId());
		if(user != null && user.getQuestion().equals(uf.getQuestion())) {
			isSuccess = true;
		}
		
		return isSuccess;
	}
	
	public UserDaoImpl getDao() {
		return new UserDaoImpl();
	}
	
}
