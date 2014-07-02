package com.desmond.ec.user.impl;

import com.desmond.ec.user.intf.Administrator;

import com.desmond.servicebuilder.model.base.impl.BaseModelImpl;

public class AdministratorImpl extends BaseModelImpl implements Administrator{
		private long userId;
	private int authority;

		public long getUserId() {		return userId;	}
	public void setUserId(long userId) {		this.userId = userId;	}
	public int getAuthority() {		return authority;	}
	public void setAuthority(int authority) {		this.authority = authority;	}

	
	public Administrator mockAdministratorImpl() {
		Administrator administrator = new AdministratorImpl();
				administrator.setUserId(Math.round(10000));		administrator.setAuthority(Math.round(100));
		
		return administrator;
	}
}
