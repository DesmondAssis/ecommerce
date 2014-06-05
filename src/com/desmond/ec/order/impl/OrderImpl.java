package com.desmond.ec.order.impl;

import com.desmond.ec.order.intf.Order;

import com.desmond.ecommerce.base.model.impl.BaseModelImpl;

public class OrderImpl extends BaseModelImpl implements Order{
		private int status;
	private long userId;
	private String name;
	private String address;
	private String postCode;
	private String telephone;
	private String phone;
	private int post;
	private String pay;
	private String notes;

		public int getStatus() {		return status;	}
	public void setStatus(int status) {		this.status = status;	}
	public long getUserId() {		return userId;	}
	public void setUserId(long userId) {		this.userId = userId;	}
	public String getName() {		return name;	}
	public void setName(String name) {		this.name = name;	}
	public String getAddress() {		return address;	}
	public void setAddress(String address) {		this.address = address;	}
	public String getPostCode() {		return postCode;	}
	public void setPostCode(String postCode) {		this.postCode = postCode;	}
	public String getTelephone() {		return telephone;	}
	public void setTelephone(String telephone) {		this.telephone = telephone;	}
	public String getPhone() {		return phone;	}
	public void setPhone(String phone) {		this.phone = phone;	}
	public int getPost() {		return post;	}
	public void setPost(int post) {		this.post = post;	}
	public String getPay() {		return pay;	}
	public void setPay(String pay) {		this.pay = pay;	}
	public String getNotes() {		return notes;	}
	public void setNotes(String notes) {		this.notes = notes;	}

	
	public Order mockOrderImpl() {
		Order order = new OrderImpl();
				order.setStatus(Math.round(100));		order.setUserId(Math.round(10000));		order.setName("Name" + Math.round(100000000));		order.setAddress("Address" + Math.round(100000000));		order.setPostCode("PostCode" + Math.round(100000000));		order.setTelephone("Telephone" + Math.round(100000000));		order.setPhone("Phone" + Math.round(100000000));		order.setPost(Math.round(100));		order.setPay("Pay" + Math.round(100000000));		order.setNotes("Notes" + Math.round(100000000));
		
		return order;
	}
}
