package com.desmond.ec.goods.intf;


import com.desmond.ecommerce.base.model.intf.BaseModel;

public interface GoodsClass extends BaseModel{
		public String getName();
	public void setName(String name);
	public long getParentClass();
	public void setParentClass(long parentClass);

}
