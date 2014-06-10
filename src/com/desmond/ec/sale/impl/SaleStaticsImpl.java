package com.desmond.ec.sale.impl;

import com.desmond.ec.sale.intf.SaleStatics;

import com.desmond.ecommerce.base.model.impl.BaseModelImpl;

public class SaleStaticsImpl extends BaseModelImpl implements SaleStatics{
		private long goodId;
	private long goodsClass;
	private int saleNumber;
	private int saleNumAmount;

		public long getGoodId() {		return goodId;	}
	public void setGoodId(long goodId) {		this.goodId = goodId;	}
	public long getGoodsClass() {		return goodsClass;	}
	public void setGoodsClass(long goodsClass) {		this.goodsClass = goodsClass;	}
	public int getSaleNumber() {		return saleNumber;	}
	public void setSaleNumber(int saleNumber) {		this.saleNumber = saleNumber;	}
	public int getSaleNumAmount() {		return saleNumAmount;	}
	public void setSaleNumAmount(int saleNumAmount) {		this.saleNumAmount = saleNumAmount;	}

	
	public SaleStatics mockSaleStaticsImpl() {
		SaleStatics salestatics = new SaleStaticsImpl();
				salestatics.setGoodId(Math.round(10000));		salestatics.setGoodsClass(Math.round(10000));		salestatics.setSaleNumber(Math.round(100));		salestatics.setSaleNumAmount(Math.round(100));
		
		return salestatics;
	}
}
