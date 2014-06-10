package com.desmond.ec.user.impl;

import com.desmond.ec.user.intf.User;
import com.desmond.ecommerce.form.UserForm;

public class UserLocalServiceImpl extends UserServiceBaseImpl{
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. 
	 * Add your custom code here.
	 */
	
	public boolean changePassword(UserForm userForm) {
		boolean modifiedSuccessfully = false;
		
		User user = this.fetchByPrimaryKey(userForm.getUserId());
		if(user.getAnswer().equals(userForm.getAnswer())) {
			user.setPassword(userForm.getPassword()); 
			this.update(user);
			modifiedSuccessfully = true;
		}
		
		return modifiedSuccessfully;
	}
	
	public User login(UserForm userForm) {
		User user = null;
		
		User userFromDb = this.fetchByPrimaryKey(userForm.getUserId());
		if(userFromDb.getPassword().equals(userForm.getPassword())) {
			user = userFromDb;
		}
		
		return user;
	}
}
