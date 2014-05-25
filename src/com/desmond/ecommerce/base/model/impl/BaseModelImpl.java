package com.desmond.ecommerce.base.model.impl;

import java.sql.Time;

import com.desmond.ecommerce.base.model.intf.BaseModel;

public class BaseModelImpl implements BaseModel{
	private long primaryKey;
	private Time createDate;
	private Time modifiedDate;
	
	/**
	 * Returns the primaryKey of this BaseModelImpl.
	 * @return the primaryKey
	 */
	public long getPrimaryKey() {
		return primaryKey;
	}
	
	/**
	 * Sets the primaryKey of this BaseModelImpl.
	 * @param primaryKey the primaryKey to set
	 */
	public void setPrimaryKey(long primaryKey) {
		this.primaryKey = primaryKey;
	}
	
	/**
	 * Returns the createDate of this BaseModelImpl.
	 * @return the createDate
	 */
	public Time getCreateDate() {
		return createDate;
	}
	
	/**
	 * Sets the createDate of this BaseModelImpl.
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Time createDate) {
		this.createDate = createDate;
	}
	
	/**
	 * Returns the modifiedDate of this BaseModelImpl.
	 * @return the modifiedDate
	 */
	public Time getModifiedDate() {
		return modifiedDate;
	}
	
	/**
	 * Sets the modifiedDate of this BaseModelImpl.
	 * @param modifiedDate the modifiedDate to set
	 */
	public void setModifiedDate(Time modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
}
