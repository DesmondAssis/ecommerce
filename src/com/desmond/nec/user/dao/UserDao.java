package com.desmond.nec.user.dao;

import java.util.List;

import com.desmond.nec.user.model.User;

public interface UserDao {
	
     /**
      *  Save new user.
      * @param userBean the user you want to insert into database
      * @return the number of record update
      * @throws SaveOrUpdateNotSucc save exception
      */
	 long add(User user);
	
	 /**
	  * Update user.
	  * @param userBean the user which would be change
	  */
	 void update(User userBean);
	
	 public java.util.List<User> findByNamePwd(String name, String password);
	 
	 public void delete(long primaryKey);
	 
	 public List<User> loadAll();
}
