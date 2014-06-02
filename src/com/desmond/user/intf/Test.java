package com.desmond.user.intf;


import com.desmond.ecommerce.base.model.intf.BaseModel;

public interface User extends BaseModel{
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

}
