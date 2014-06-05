package com.desmond.ec.order.impl;

import com.desmond.ec.order.intf.Order;

public abstract class OrderServiceBaseImpl {
	public int add(Order order) {
		return getDao().add(order);
	}
	
	public int update(Order order) {
		return getDao().update(order);
	}
	
	public Order fetchByPrimaryKey(long primaryKey) {
		return getDao().fetchByPrimaryKey(primaryKey);
	}
	
	public int delete(long primaryKey) {
		return getDao().delete(primaryKey);
	}
	
	public OrderDaoImpl getDao() {
		return dao;
	}
	
	public void setDao(OrderDaoImpl dao) {
		this.dao = dao;
	}

	private OrderDaoImpl dao;
}
