package com.desmond.ec.goods.impl;

import com.desmond.ec.goods.intf.Goods;

import com.desmond.ecommerce.base.model.impl.BaseModelImpl;

public class GoodsImpl extends BaseModelImpl implements Goods{
		private long name;
	private String mainClass;
	private String subClass;
	private double price;
	private int remain;
	private String image;
	private String unit;
	private boolean isRecommend;

		public long getName() {		return name;	}
	public void setName(long name) {		this.name = name;	}
	public String getMainClass() {		return mainClass;	}
	public void setMainClass(String mainClass) {		this.mainClass = mainClass;	}
	public String getSubClass() {		return subClass;	}
	public void setSubClass(String subClass) {		this.subClass = subClass;	}
	public double getPrice() {		return price;	}
	public void setPrice(double price) {		this.price = price;	}
	public int getRemain() {		return remain;	}
	public void setRemain(int remain) {		this.remain = remain;	}
	public String getImage() {		return image;	}
	public void setImage(String image) {		this.image = image;	}
	public String getUnit() {		return unit;	}
	public void setUnit(String unit) {		this.unit = unit;	}
	public boolean getIsRecommend() {		return isRecommend;	}
	public void setIsRecommend(boolean isRecommend) {		this.isRecommend = isRecommend;	}

	
	public Goods mockGoodsImpl() {
		Goods goods = new GoodsImpl();
				goods.setName(Math.round(10000));		goods.setMainClass("MainClass" + Math.round(100000000));		goods.setSubClass("SubClass" + Math.round(100000000));		goods.setPrice(Math.rint(100));		goods.setRemain(Math.round(100));		goods.setImage("Image" + Math.round(100000000));		goods.setUnit("Unit" + Math.round(100000000));		goods.setIsRecommend(false);
		
		return goods;
	}
}
