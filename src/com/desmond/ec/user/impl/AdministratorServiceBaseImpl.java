package com.desmond.ec.user.impl;

import com.desmond.ec.user.intf.Administrator;

public abstract class AdministratorServiceBaseImpl {
	public int add(Administrator administrator) {
		return getDao().add(administrator);
	}
	
	public int update(Administrator administrator) {
		return getDao().update(administrator);
	}
	
	public Administrator fetchByPrimaryKey(long primaryKey) {
		return getDao().fetchByPrimaryKey(primaryKey);
	}
	
	public int delete(long primaryKey) {
		return getDao().delete(primaryKey);
	}
	
	public AdministratorDaoImpl getDao() {
		return dao;
	}
	
	public void setDao(AdministratorDaoImpl dao) {
		this.dao = dao;
	}

	private AdministratorDaoImpl dao;
}
