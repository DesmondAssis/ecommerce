package com.desmond.ec.sale.intf;


import com.desmond.ecommerce.base.model.intf.BaseModel;

public interface SaleStatics extends BaseModel{
		public long getGoodId();
	public void setGoodId(long goodId);
	public long getGoodsClass();
	public void setGoodsClass(long goodsClass);
	public int getSaleNumber();
	public void setSaleNumber(int saleNumber);
	public int getSaleNumAmount();
	public void setSaleNumAmount(int saleNumAmount);

}
