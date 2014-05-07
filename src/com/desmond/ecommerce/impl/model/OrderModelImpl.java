package com.desmond.ecommerce.impl.model;

import java.sql.Date;
import java.util.List;

import com.desmond.ecommerce.impl.model.base.BaseModelImpl;
import com.desmond.ecommerce.service.model.BuyersModel;
import com.desmond.ecommerce.service.model.OrderModel;

/**
 * 
 * @author Presley
 * @date 8 May 2014 06:16:11
 * @version 1.0
 * #OrderModel
 */
public class OrderModelImpl extends BaseModelImpl implements OrderModel{
	private String status; // 0-new, 1-payed, 2-sent, 3-invalid
	private Date orderDate;
	private int userId;
	private String name;
	private String address;
	private String postcode;
	private String telephone;
	private String phone;
	private String post; // the way to post
	private String pay; // the way to pay
	private String notes; // comments
	
	
	private Date orderTimebefore;
	private Date orderTimeafter;
	private int orderHoldTime;
	private String orderGoodGname;
	private int orderGoodNum;
	private double orderGoodPrice;
	private double sumMoney;
	
	private List<BuyersModel> buyerlist;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Date getOrderTimebefore() {
		return orderTimebefore;
	}

	public void setOrderTimebefore(Date orderTimebefore) {
		this.orderTimebefore = orderTimebefore;
	}

	public Date getOrderTimeafter() {
		return orderTimeafter;
	}

	public void setOrderTimeafter(Date orderTimeafter) {
		this.orderTimeafter = orderTimeafter;
	}

	public int getOrderHoldTime() {
		return orderHoldTime;
	}

	public void setOrderHoldTime(int orderHoldTime) {
		this.orderHoldTime = orderHoldTime;
	}

	public String getOrderGoodGname() {
		return orderGoodGname;
	}

	public void setOrderGoodGname(String orderGoodGname) {
		this.orderGoodGname = orderGoodGname;
	}

	public int getOrderGoodNum() {
		return orderGoodNum;
	}

	public void setOrderGoodNum(int orderGoodNum) {
		this.orderGoodNum = orderGoodNum;
	}

	public double getOrderGoodPrice() {
		return orderGoodPrice;
	}

	public void setOrderGoodPrice(double orderGoodPrice) {
		this.orderGoodPrice = orderGoodPrice;
	}

	public double getSumMoney() {
		return sumMoney;
	}

	public void setSumMoney(double sumMoney) {
		this.sumMoney = sumMoney;
	}

	public List<BuyersModel> getBuyerlist() {
		return buyerlist;
	}

	public void setBuyerlist(List<BuyersModel> buyerlist) {
		this.buyerlist = buyerlist;
	}
	
}