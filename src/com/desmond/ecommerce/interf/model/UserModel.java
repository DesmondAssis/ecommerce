package com.desmond.ecommerce.interf.model;

import java.sql.Date;

import com.desmond.ecommerce.interf.model.base.BaseModel;

/**
 * 
 * @author Presley
 * @date 8 May 2014 06:36:20
 * @version 1.0
 * #UserModel
 */
public interface UserModel extends BaseModel{
	
	public String getName();
	
	public void setName(String name);
	
	public String getPassword();
	
	public void setPassword(String password);
	
	public String getReallyName();
	
	public void setReallyName(String reallyName);
	
	public String getIdentity();
	
	public void setIdentity(String identity);
	
	public String getPostcode();
	
	public void setPostcode(String postcode);
	
	public String getEmail();
	
	public void setEmail(String email);
	
	public String getAddress();
	
	public void setAddress(String address);
	
	public String getPhone();
	
	public void setPhone(String phone);
	
	public String getQuestion();
	
	public void setQuestion(String question);
	
	public String getAnswer();
	
	public void setAnswer(String answer);
	
	public Date getRegistDate();
	
	public void setRegistDate(Date registDate);
	
}
