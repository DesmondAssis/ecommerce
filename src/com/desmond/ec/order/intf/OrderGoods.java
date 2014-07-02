package com.desmond.ec.order.intf;


import com.desmond.servicebuilder.model.base.intf.BaseModel;

public interface OrderGoods extends BaseModel{
		public long getOrderId();
	public void setOrderId(long orderId);
	public long getOrderGoodId();
	public void setOrderGoodId(long orderGoodId);
	public int getOrderGoodNum();
	public void setOrderGoodNum(int orderGoodNum);
	public double getOrderGoodPrice();
	public void setOrderGoodPrice(double orderGoodPrice);

}
