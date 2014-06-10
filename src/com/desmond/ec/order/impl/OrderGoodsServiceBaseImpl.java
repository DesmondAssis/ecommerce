package com.desmond.ec.order.impl;

import com.desmond.ec.order.intf.OrderGoods;

public abstract class OrderGoodsServiceBaseImpl {
	public int add(OrderGoods orderGoods) {
		return getDao().add(orderGoods);
	}
	
	public int update(OrderGoods orderGoods) {
		return getDao().update(orderGoods);
	}
	
	public OrderGoods fetchByPrimaryKey(long primaryKey) {
		return getDao().fetchByPrimaryKey(primaryKey);
	}
	
	public int delete(long primaryKey) {
		return getDao().delete(primaryKey);
	}
	
	public OrderGoodsDaoImpl getDao() {
		return dao;
	}
	
	public void setDao(OrderGoodsDaoImpl dao) {
		this.dao = dao;
	}

	private OrderGoodsDaoImpl dao;
}
