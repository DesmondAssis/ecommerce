package com.desmond.ec.cart.intf;


import com.desmond.servicebuilder.model.base.intf.BaseModel;

public interface Cart extends BaseModel{
		public String getSessionId();
	public void setSessionId(String sessionId);
	public long getGoodId();
	public void setGoodId(long goodId);
	public int getGoodNum();
	public void setGoodNum(int goodNum);
	public long getUserId();
	public void setUserId(long userId);

}
