package com.desmond.nec.user.model;

import java.sql.Timestamp;
import java.util.Date;

import com.desmond.servicebuilder.util.db.Counter;

public class User{
	private long id;
	private Timestamp createdDate;
	private Timestamp modifiedDate;	private String name;
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
		User user = new User();
		user.setId(Counter.getPrimaryKey("com.desmond.ec.user.intf.User"));
		user.setCreatedDate(new Timestamp(new Date().getTime()));
		user.setModifiedDate(new Timestamp(new Date().getTime()));		user.setName("Name" + Math.round(Math.random()*10000000));		user.setPassword("Password" + Math.round(Math.random()*10000000));		user.setReallyName("ReallyName" + Math.round(Math.random()*10000000));		user.setIdentity("Identity" + Math.round(Math.random()*10000000));		user.setPostcode("Postcode" + Math.round(Math.random()*10000000));		user.setEmail("Email" + Math.round(Math.random()*10000000));		user.setAddress("Address" + Math.round(Math.random()*10000000));		user.setPhone("Phone" + Math.round(Math.random()*10000000));		user.setQuestion("Question" + Math.round(Math.random()*10000000));		user.setAnswer("Answer" + Math.round(Math.random()*10000000));
		
		return user;
	}
	
	
	/**
	 * Returns the id of this User.
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Sets the id of this User.
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Returns the createdDate of this BaseModelImpl.
	 * @return the createdDate
	 */
	public Timestamp getCreatedDate() {
		return createdDate;
	}

	/**
	 * Sets the createdDate of this BaseModelImpl.
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * Returns the modifiedDate of this BaseModelImpl.
	 * @return the modifiedDate
	 */
	public Timestamp getModifiedDate() {
		return modifiedDate;
	}
	
	/**
	 * Sets the modifiedDate of this BaseModelImpl.
	 * @param modifiedDate the modifiedDate to set
	 */
	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
}
