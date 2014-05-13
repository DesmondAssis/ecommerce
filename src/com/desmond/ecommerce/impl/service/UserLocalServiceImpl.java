package com.desmond.ecommerce.impl.service;

import com.desmond.ecommerce.impl.dao.UserDaoImpl;
import com.desmond.ecommerce.interf.dao.UserDao;
import com.desmond.ecommerce.interf.model.UserModel;

/**
 * 
 * @author Presley
 * @date 13 May 2014 20:56:09
 * @version 1.0 #UserLocalServiceImpl
 */
public class UserLocalServiceImpl {

	/**
	 * register a new user.
	 * @param ub
	 * @return
	 */
	public boolean regist(UserModel ub) {
		boolean isSuccess = false;
		int result = 0;
		UserDao dao = new UserDaoImpl();
		result = dao.regist(ub);
		
		if (result > 0) {
			isSuccess = true;
		}
		return isSuccess;
	}
	
	/**
	 * login.
	 * @param username
	 * @param pwd
	 * @return
	 */
	public UserModel login(String username, String pwd) {
		UserModel ub = null;
		UserDao dao = new UserDaoImpl();
		ub = dao.login(username, pwd);
		return ub;
	}
	
	/**
	 * update user's information.
	 * @param ub
	 * @return
	 */
	public boolean update(UserModel ub) {
		boolean isSuccess = false;
		int result = 0;
		UserDao dao = new UserDaoImpl();
		result = dao.update(ub);
		if (result > 0) {
			isSuccess = true;
		}
		return isSuccess;
	}
	
	/**
	 * modify password.
	 * @param userId
	 * @param newPwd
	 * @return
	 */
	public boolean modifyPassword(int userId, String newPwd) {
		boolean isSuccess = false;
		int result = 0;
		UserDao dao = new UserDaoImpl();
		result = dao.modifyPwd(userId, newPwd);
		if (result > 0) {
			isSuccess = true;
		}
		return isSuccess;
	}
	
	/**
	 * change the password according user's answer.
	 * @param userName
	 * @param anwser
	 * @param newPwd
	 * @return
	 */
	public boolean changePassword(String userName, String anwser, String newPwd) {
		boolean isSuccess = false;
		int result = 0;
		UserDao dao = new UserDaoImpl();
		result = dao.getPwd(userName, anwser, newPwd);
		if (result > 0) {
			isSuccess = true;
		}
		return isSuccess;
	}
}
