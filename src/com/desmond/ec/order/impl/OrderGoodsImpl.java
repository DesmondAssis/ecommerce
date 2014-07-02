package com.desmond.ec.order.impl;

import com.desmond.ec.order.intf.OrderGoods;

import com.desmond.servicebuilder.model.base.impl.BaseModelImpl;

public class OrderGoodsImpl extends BaseModelImpl implements OrderGoods{
		private long orderId;
	private long orderGoodId;
	private int orderGoodNum;
	private double orderGoodPrice;

		public long getOrderId() {		return orderId;	}
	public void setOrderId(long orderId) {		this.orderId = orderId;	}
	public long getOrderGoodId() {		return orderGoodId;	}
	public void setOrderGoodId(long orderGoodId) {		this.orderGoodId = orderGoodId;	}
	public int getOrderGoodNum() {		return orderGoodNum;	}
	public void setOrderGoodNum(int orderGoodNum) {		this.orderGoodNum = orderGoodNum;	}
	public double getOrderGoodPrice() {		return orderGoodPrice;	}
	public void setOrderGoodPrice(double orderGoodPrice) {		this.orderGoodPrice = orderGoodPrice;	}

	
	public OrderGoods mockOrderGoodsImpl() {
		OrderGoods ordergoods = new OrderGoodsImpl();
				ordergoods.setOrderId(Math.round(10000));		ordergoods.setOrderGoodId(Math.round(10000));		ordergoods.setOrderGoodNum(Math.round(100));		ordergoods.setOrderGoodPrice(Math.rint(100));
		
		return ordergoods;
	}
}
