package com.desmond.ec.user.impl;

import com.desmond.ec.user.intf.AdminAuthority;

import com.desmond.ecommerce.base.model.impl.BaseModelImpl;

public class AdminAuthorityImpl extends BaseModelImpl implements AdminAuthority{
		private String name;

		public String getName() {		return name;	}
	public void setName(String name) {		this.name = name;	}

	
	public AdminAuthority mockAdminAuthorityImpl() {
		AdminAuthority adminauthority = new AdminAuthorityImpl();
				adminauthority.setName("Name" + Math.round(100000000));
		
		return adminauthority;
	}
}
