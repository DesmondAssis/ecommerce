package com.desmond.ec.order.intf;


import com.desmond.ecommerce.base.model.intf.BaseModel;

public interface Order extends BaseModel{
		public int getStatus();
	public void setStatus(int status);
	public long getUserId();
	public void setUserId(long userId);
	public String getName();
	public void setName(String name);
	public String getAddress();
	public void setAddress(String address);
	public String getPostCode();
	public void setPostCode(String postCode);
	public String getTelephone();
	public void setTelephone(String telephone);
	public String getPhone();
	public void setPhone(String phone);
	public int getPost();
	public void setPost(int post);
	public String getPay();
	public void setPay(String pay);
	public String getNotes();
	public void setNotes(String notes);

}
