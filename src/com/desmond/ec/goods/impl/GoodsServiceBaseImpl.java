package com.desmond.ec.goods.impl;

import com.desmond.ec.goods.intf.Goods;

public abstract class GoodsServiceBaseImpl {
	public int add(Goods goods) {
		return getDao().add(goods);
	}
	
	public int update(Goods goods) {
		return getDao().update(goods);
	}
	
	public Goods fetchByPrimaryKey(long primaryKey) {
		return getDao().fetchByPrimaryKey(primaryKey);
	}
	
	public int delete(long primaryKey) {
		return getDao().delete(primaryKey);
	}
	
	public GoodsDaoImpl getDao() {
		return dao;
	}
	
	public void setDao(GoodsDaoImpl dao) {
		this.dao = dao;
	}

	private GoodsDaoImpl dao;
}
