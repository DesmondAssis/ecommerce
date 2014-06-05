package com.desmond.ec.user.impl;

import com.desmond.ec.user.intf.User;

import com.desmond.ecommerce.base.model.impl.BaseModelImpl;

public class UserImpl extends BaseModelImpl implements User{
		private String name;
	private String password;
	private String reallyName;
	private String identity;
	private String postcode;
	private String email;
	private String address;
	private String phone;
	private String question;
	private String answer;

		public String getName() {		return name;	}
	public void setName(String name) {		this.name = name;	}
	public String getPassword() {		return password;	}
	public void setPassword(String password) {		this.password = password;	}
	public String getReallyName() {		return reallyName;	}
	public void setReallyName(String reallyName) {		this.reallyName = reallyName;	}
	public String getIdentity() {		return identity;	}
	public void setIdentity(String identity) {		this.identity = identity;	}
	public String getPostcode() {		return postcode;	}
	public void setPostcode(String postcode) {		this.postcode = postcode;	}
	public String getEmail() {		return email;	}
	public void setEmail(String email) {		this.email = email;	}
	public String getAddress() {		return address;	}
	public void setAddress(String address) {		this.address = address;	}
	public String getPhone() {		return phone;	}
	public void setPhone(String phone) {		this.phone = phone;	}
	public String getQuestion() {		return question;	}
	public void setQuestion(String question) {		this.question = question;	}
	public String getAnswer() {		return answer;	}
	public void setAnswer(String answer) {		this.answer = answer;	}

	
	public User mockUserImpl() {
		User user = new UserImpl();
				user.setName("Name" + Math.round(100000000));		user.setPassword("Password" + Math.round(100000000));		user.setReallyName("ReallyName" + Math.round(100000000));		user.setIdentity("Identity" + Math.round(100000000));		user.setPostcode("Postcode" + Math.round(100000000));		user.setEmail("Email" + Math.round(100000000));		user.setAddress("Address" + Math.round(100000000));		user.setPhone("Phone" + Math.round(100000000));		user.setQuestion("Question" + Math.round(100000000));		user.setAnswer("Answer" + Math.round(100000000));
		
		return user;
	}
}
