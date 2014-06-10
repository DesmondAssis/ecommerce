package com.desmond.ec.user.impl;

import com.desmond.ec.user.intf.AdminAuthority;

public abstract class AdminAuthorityServiceBaseImpl {
	public int add(AdminAuthority adminAuthority) {
		return getDao().add(adminAuthority);
	}
	
	public int update(AdminAuthority adminAuthority) {
		return getDao().update(adminAuthority);
	}
	
	public AdminAuthority fetchByPrimaryKey(long primaryKey) {
		return getDao().fetchByPrimaryKey(primaryKey);
	}
	
	public int delete(long primaryKey) {
		return getDao().delete(primaryKey);
	}
	
	public AdminAuthorityDaoImpl getDao() {
		return dao;
	}
	
	public void setDao(AdminAuthorityDaoImpl dao) {
		this.dao = dao;
	}

	private AdminAuthorityDaoImpl dao;
}
