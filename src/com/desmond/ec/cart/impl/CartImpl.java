package com.desmond.ec.cart.impl;

import com.desmond.ec.cart.intf.Cart;

import com.desmond.ecommerce.base.model.impl.BaseModelImpl;

public class CartImpl extends BaseModelImpl implements Cart{
		private String sessionId;
	private long goodId;
	private int goodNum;
	private long userId;

		public String getSessionId() {		return sessionId;	}
	public void setSessionId(String sessionId) {		this.sessionId = sessionId;	}
	public long getGoodId() {		return goodId;	}
	public void setGoodId(long goodId) {		this.goodId = goodId;	}
	public int getGoodNum() {		return goodNum;	}
	public void setGoodNum(int goodNum) {		this.goodNum = goodNum;	}
	public long getUserId() {		return userId;	}
	public void setUserId(long userId) {		this.userId = userId;	}

	
	public Cart mockCartImpl() {
		Cart cart = new CartImpl();
				cart.setSessionId("SessionId" + Math.round(100000000));		cart.setGoodId(Math.round(10000));		cart.setGoodNum(Math.round(100));		cart.setUserId(Math.round(10000));
		
		return cart;
	}
}
