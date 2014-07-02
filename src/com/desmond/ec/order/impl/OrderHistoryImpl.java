package com.desmond.ec.order.impl;

import com.desmond.ec.order.intf.OrderHistory;

import com.desmond.servicebuilder.model.base.impl.BaseModelImpl;

public class OrderHistoryImpl extends BaseModelImpl implements OrderHistory{
		private long orderId;
	private String modifiedReason;
	private long userId;

		public long getOrderId() {		return orderId;	}
	public void setOrderId(long orderId) {		this.orderId = orderId;	}
	public String getModifiedReason() {		return modifiedReason;	}
	public void setModifiedReason(String modifiedReason) {		this.modifiedReason = modifiedReason;	}
	public long getUserId() {		return userId;	}
	public void setUserId(long userId) {		this.userId = userId;	}

	
	public OrderHistory mockOrderHistoryImpl() {
		OrderHistory orderhistory = new OrderHistoryImpl();
				orderhistory.setOrderId(Math.round(10000));		orderhistory.setModifiedReason("ModifiedReason" + Math.round(100000000));		orderhistory.setUserId(Math.round(10000));
		
		return orderhistory;
	}
}
