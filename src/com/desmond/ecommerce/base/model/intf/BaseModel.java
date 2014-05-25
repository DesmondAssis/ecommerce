package com.desmond.ecommerce.base.model.intf;

import java.sql.Time;

public interface BaseModel {
	/**
	 * Returns the primaryKey of this BaseModelImpl.
	 * @return the primaryKey
	 */
	public long getPrimaryKey();
	
	/**
	 * Sets the primaryKey of this BaseModelImpl.
	 * @param primaryKey the primaryKey to set
	 */
	public void setPrimaryKey(long primaryKey);
	
	/**
	 * Returns the createDate of this BaseModelImpl.
	 * @return the createDate
	 */
	public Time getCreateDate();
	
	/**
	 * Sets the createDate of this BaseModelImpl.
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Time createDate);
	
	/**
	 * Returns the modifiedDate of this BaseModelImpl.
	 * @return the modifiedDate
	 */
	public Time getModifiedDate();
	
	/**
	 * Sets the modifiedDate of this BaseModelImpl.
	 * @param modifiedDate the modifiedDate to set
	 */
	public void setModifiedDate(Time modifiedDate);
}
