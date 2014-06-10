package com.desmond.ec.user.impl;

import com.desmond.ec.user.intf.User;

public abstract class UserServiceBaseImpl {
	public int add(User user) {
		return getDao().add(user);
	}
	
	public int update(User user) {
		return getDao().update(user);
	}
	
	public User fetchByPrimaryKey(long primaryKey) {
		return getDao().fetchByPrimaryKey(primaryKey);
	}
	
	public int delete(long primaryKey) {
		return getDao().delete(primaryKey);
	}
	
	public UserDaoImpl getDao() {
//		return dao;
		return new UserDaoImpl();
	}
	
	public void setDao(UserDaoImpl dao) {
		this.dao = dao;
	}

	private UserDaoImpl dao;
}
