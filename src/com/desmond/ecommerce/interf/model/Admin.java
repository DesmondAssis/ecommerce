package com.desmond.ecommerce.interf.model;

import com.desmond.ecommerce.interf.model.base.BaseModel;


/**
 * 
 * @author Presley
 * @date 6 May 2014 07:20:39
 * @version 1.0 #Admin
 */
public interface Admin extends BaseModel {

	/**
	 * Returns the name of this Admin.
	 * 
	 * @return the name
	 */
	public String getName();

	/**
	 * Sets the name of this Admin.
	 * 
	 * @param name
	 *            the name to set
	 */
	public void setName(String name);

	/**
	 * Returns the password of this Admin.
	 * 
	 * @return the password
	 */
	public String getPassword();

	/**
	 * Sets the password of this Admin.
	 * 
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password);

	/**
	 * Returns the email of this Admin.
	 * 
	 * @return the email
	 */
	public String getEmail();

	/**
	 * Sets the email of this Admin.
	 * 
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email);

}
