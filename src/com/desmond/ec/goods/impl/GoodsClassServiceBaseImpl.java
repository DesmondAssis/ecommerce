package com.desmond.ec.goods.impl;

import com.desmond.ec.goods.intf.GoodsClass;

public abstract class GoodsClassServiceBaseImpl {
	public int add(GoodsClass goodsClass) {
		return getDao().add(goodsClass);
	}
	
	public int update(GoodsClass goodsClass) {
		return getDao().update(goodsClass);
	}
	
	public GoodsClass fetchByPrimaryKey(long primaryKey) {
		return getDao().fetchByPrimaryKey(primaryKey);
	}
	
	public int delete(long primaryKey) {
		return getDao().delete(primaryKey);
	}
	
	public GoodsClassDaoImpl getDao() {
		return dao;
	}
	
	public void setDao(GoodsClassDaoImpl dao) {
		this.dao = dao;
	}

	private GoodsClassDaoImpl dao;
}
