package com.desmond.ecommerce.impl.model.base;

import com.desmond.ecommerce.interf.model.base.BaseModel;

public class BaseModelImpl implements BaseModel{

	private long id;
	
	/**
	 * 
	 */
	public BaseModelImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param id
	 */
	public BaseModelImpl(long id) {
		super();
		this.id = id;
	}



	@Override
	public void setPrimaryKey(long primaryKey) {
		this.id = primaryKey;
	}

	@Override
	public long getPrimaryKey() {
		return this.id;
	}

}
