package com.desmond.ec.sale.impl;

import com.desmond.ec.sale.intf.SaleStatics;

public abstract class SaleStaticsServiceBaseImpl {
	public int add(SaleStatics saleStatics) {
		return getDao().add(saleStatics);
	}
	
	public int update(SaleStatics saleStatics) {
		return getDao().update(saleStatics);
	}
	
	public SaleStatics fetchByPrimaryKey(long primaryKey) {
		return getDao().fetchByPrimaryKey(primaryKey);
	}
	
	public int delete(long primaryKey) {
		return getDao().delete(primaryKey);
	}
	
	public SaleStaticsDaoImpl getDao() {
		return dao;
	}
	
	public void setDao(SaleStaticsDaoImpl dao) {
		this.dao = dao;
	}

	private SaleStaticsDaoImpl dao;
}
