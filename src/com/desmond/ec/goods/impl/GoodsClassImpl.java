package com.desmond.ec.goods.impl;

import com.desmond.ec.goods.intf.GoodsClass;

import com.desmond.ecommerce.base.model.impl.BaseModelImpl;

public class GoodsClassImpl extends BaseModelImpl implements GoodsClass{
		private String name;
	private long parentClass;

		public String getName() {		return name;	}
	public void setName(String name) {		this.name = name;	}
	public long getParentClass() {		return parentClass;	}
	public void setParentClass(long parentClass) {		this.parentClass = parentClass;	}

	
	public GoodsClass mockGoodsClassImpl() {
		GoodsClass goodsclass = new GoodsClassImpl();
				goodsclass.setName("Name" + Math.round(100000000));		goodsclass.setParentClass(Math.round(10000));
		
		return goodsclass;
	}
}
