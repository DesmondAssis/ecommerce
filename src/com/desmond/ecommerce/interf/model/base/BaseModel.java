package com.desmond.ecommerce.interf.model.base;

public interface BaseModel {
	
	/**
	 * Returns the primary key of this game.
	 *
	 * @return the primary key of this game
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this game.
	 *
	 * @param primaryKey the primary key of this game
	 */
	public void setPrimaryKey(long primaryKey);
}
