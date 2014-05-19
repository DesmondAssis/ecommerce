package com.desmond.ecommerce.impl.model;

import com.desmond.ecommerce.impl.model.base.BaseModelImpl;
import com.desmond.ecommerce.interf.model.AdminModel;

/**
 * 
 * @author Presley
 * @date 6 May 2014 06:56:07
 * @version 1.0
 * #AdminModel
 */
public class AdminModelImpl extends BaseModelImpl implements AdminModel{
	private String name;
	private String password;
	private String email;
	private int adminType;
	private int[] authority;
	
	public AdminModelImpl() {
		super();
	}

	/**
	 * @param name
	 * @param pwd
	 * @param email
	 * @param adminType
	 * @param authority
	 */
	public AdminModelImpl(String name, String pwd, String email, int adminType,
			int[] authority) {
		super();
		this.name = name;
		this.password = pwd;
		this.email = email;
		this.adminType = adminType;
		this.authority = authority;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String getEmail() {
		return this.email;
	}

	@Override
	public void setEmail(String email) {
		this.email = email;
	}

}
