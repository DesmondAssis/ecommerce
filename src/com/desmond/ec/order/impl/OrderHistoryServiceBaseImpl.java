package com.desmond.ec.order.impl;

import com.desmond.ec.order.intf.OrderHistory;

public abstract class OrderHistoryServiceBaseImpl {
	public int add(OrderHistory orderHistory) {
		return getDao().add(orderHistory);
	}
	
	public int update(OrderHistory orderHistory) {
		return getDao().update(orderHistory);
	}
	
	public OrderHistory fetchByPrimaryKey(long primaryKey) {
		return getDao().fetchByPrimaryKey(primaryKey);
	}
	
	public int delete(long primaryKey) {
		return getDao().delete(primaryKey);
	}
	
	public OrderHistoryDaoImpl getDao() {
		return dao;
	}
	
	public void setDao(OrderHistoryDaoImpl dao) {
		this.dao = dao;
	}

	private OrderHistoryDaoImpl dao;
}
