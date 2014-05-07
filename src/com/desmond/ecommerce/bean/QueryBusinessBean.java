package com.desmond.ecommerce.bean;

import java.util.Date;

/**
 * 
 * @author Presley
 * @date 8 May 2014 06:34:52
 * @version 1.0
 * #QueryBusinessBean
 */
public class QueryBusinessBean {
	private Date solddate;
	private String goodname;
	private String goodsclass;
	private int salenum;	
	private double saleamount;
	
	public Date getSolddate() {
		return solddate;
	}
	public void setSolddate(Date solddate) {
		this.solddate = solddate;
	}
	public String getGoodname() {
		return goodname;
	}
	public void setGoodname(String goodname) {
		this.goodname = goodname;
	}
	public String getGoodsclass() {
		return goodsclass;
	}
	public void setGoodsclass(String goodsclass) {
		this.goodsclass = goodsclass;
	}
	public int getSalenum() {
		return salenum;
	}
	public void setSalenum(int salenum) {
		this.salenum = salenum;
	}
	public double getSaleamount() {
		return saleamount;
	}
	public void setSaleamount(double saleamount) {
		this.saleamount = saleamount;
	}
	
	
}
