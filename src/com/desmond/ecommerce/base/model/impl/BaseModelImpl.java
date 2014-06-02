package com.desmond.ecommerce.base.model.impl;

import java.sql.Timestamp;

import com.desmond.ecommerce.base.model.intf.BaseModel;

public class BaseModelImpl implements BaseModel{
	private long primaryKey;
	private Timestamp createDate;
	private Timestamp modifiedDate;
	
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
	public Timestamp getCreateDate() {
		return createDate;
	}
	
	/**
	 * Sets the createDate of this BaseModelImpl.
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
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
