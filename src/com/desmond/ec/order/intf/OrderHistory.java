package com.desmond.ec.order.intf;


import com.desmond.servicebuilder.model.base.intf.BaseModel;

public interface OrderHistory extends BaseModel{
		public long getOrderId();
	public void setOrderId(long orderId);
	public String getModifiedReason();
	public void setModifiedReason(String modifiedReason);
	public long getUserId();
	public void setUserId(long userId);

}
