package com.desmond.user.impl;

import java.sql.Time;
import com.desmond.user.intf.User;

import com.desmond.ecommerce.base.model.impl.BaseModelImpl;

public class UserImpl extends BaseModelImpl implements User{
		private long id;
	private Time createdDate;
	private Time modifiedDate;
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

		public long getId() {		return id;	}
	public void setId(long id) {		this.id = id;	}
	public Time getCreatedDate() {		return createdDate;	}
	public void setCreatedDate(Time createdDate) {		this.createdDate = createdDate;	}
	public Time getModifiedDate() {		return modifiedDate;	}
	public void setModifiedDate(Time modifiedDate) {		this.modifiedDate = modifiedDate;	}
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

}
