package com.desmond.nec.user.model;

import java.sql.Timestamp;
import java.util.Date;

import com.desmond.servicebuilder.util.db.Counter;

public class User{
	private long id;
	private Timestamp createdDate;
	private Timestamp modifiedDate;










	




















	
	public User mockUserImpl() {
		User user = new User();
		user.setId(Counter.getPrimaryKey("com.desmond.ec.user.intf.User"));
		user.setCreatedDate(new Timestamp(new Date().getTime()));
		user.setModifiedDate(new Timestamp(new Date().getTime()));
		
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