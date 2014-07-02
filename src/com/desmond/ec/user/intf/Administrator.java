package com.desmond.ec.user.intf;


import com.desmond.servicebuilder.model.base.intf.BaseModel;

public interface Administrator extends BaseModel{
		public long getUserId();
	public void setUserId(long userId);
	public int getAuthority();
	public void setAuthority(int authority);

}
