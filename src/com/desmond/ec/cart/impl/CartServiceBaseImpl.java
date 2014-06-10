package com.desmond.ec.cart.impl;

import com.desmond.ec.cart.intf.Cart;

public abstract class CartServiceBaseImpl {
	public int add(Cart cart) {
		return getDao().add(cart);
	}
	
	public int update(Cart cart) {
		return getDao().update(cart);
	}
	
	public Cart fetchByPrimaryKey(long primaryKey) {
		return getDao().fetchByPrimaryKey(primaryKey);
	}
	
	public int delete(long primaryKey) {
		return getDao().delete(primaryKey);
	}
	
	public CartDaoImpl getDao() {
		return dao;
	}
	
	public void setDao(CartDaoImpl dao) {
		this.dao = dao;
	}

	private CartDaoImpl dao;
}
