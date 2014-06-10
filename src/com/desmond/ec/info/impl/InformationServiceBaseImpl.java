package com.desmond.ec.info.impl;

import com.desmond.ec.info.intf.Information;

public abstract class InformationServiceBaseImpl {
	public int add(Information information) {
		return getDao().add(information);
	}
	
	public int update(Information information) {
		return getDao().update(information);
	}
	
	public Information fetchByPrimaryKey(long primaryKey) {
		return getDao().fetchByPrimaryKey(primaryKey);
	}
	
	public int delete(long primaryKey) {
		return getDao().delete(primaryKey);
	}
	
	public InformationDaoImpl getDao() {
		return dao;
	}
	
	public void setDao(InformationDaoImpl dao) {
		this.dao = dao;
	}

	private InformationDaoImpl dao;
}
