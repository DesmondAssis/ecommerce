package com.desmond.user.intf;

import java.sql.Time;

import com.desmond.ecommerce.base.model.intf.BaseModel;

public interface User extends BaseModel{
		public long getId();
	public void setId(long id);
	public Time getCreatedDate();
	public void setCreatedDate(Time createdDate);
	public Time getModifiedDate();
	public void setModifiedDate(Time modifiedDate);
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
