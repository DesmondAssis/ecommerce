package com.desmond.ec.goods.intf;


import com.desmond.ecommerce.base.model.intf.BaseModel;

public interface Goods extends BaseModel{
		public long getName();
	public void setName(long name);
	public String getMainClass();
	public void setMainClass(String mainClass);
	public String getSubClass();
	public void setSubClass(String subClass);
	public double getPrice();
	public void setPrice(double price);
	public int getRemain();
	public void setRemain(int remain);
	public String getImage();
	public void setImage(String image);
	public String getUnit();
	public void setUnit(String unit);
	public boolean getIsRecommend();
	public void setIsRecommend(boolean isRecommend);

}
