package com.desmond.ecommerce.interf.service;

import com.desmond.ecommerce.interf.model.UserModel;

/**
 * 
 * @author Presley
 * @date 14 May 2014 22:49:20
 * @version 1.0
 * #UserService
 */
public interface UserService {

	/**
	 * register a new user.
	 * @param ub
	 * @return
	 */
	public boolean regist(UserModel ub);
	
	/**
	 * login.
	 * @param username
	 * @param pwd
	 * @return
	 */
	public UserModel login(String username, String pwd);
	
	/**
	 * update user's information.
	 * @param ub
	 * @return
	 */
	public boolean update(UserModel ub);
	
	/**
	 * modify password.
	 * @param userId
	 * @param newPwd
	 * @return
	 */
	public boolean modifyPassword(int userId, String newPwd);
	
	/**
	 * change the password according user's answer.
	 * @param userName
	 * @param anwser
	 * @param newPwd
	 * @return
	 */
	public boolean changePassword(String userName, String anwser, String newPwd);
}
