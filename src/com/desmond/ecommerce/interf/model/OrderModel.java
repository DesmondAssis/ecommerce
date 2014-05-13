package com.desmond.ecommerce.interf.model;

import java.sql.Date;

import com.desmond.ecommerce.interf.model.base.BaseModel;

/**
 * 
 * @author Presley
 * @date 8 May 2014 06:16:11
 * @version 1.0
 * #OrderModel
 */
public interface OrderModel extends BaseModel{
	
	/**
	 * Returns the status of this OrderModel.
	 * @return the status
	 */
	public String getStatus();
	
	/**
	 * Sets the status of this OrderModel.
	 * @param status the status to set
	 */
	public void setStatus(String status);
	
	/**
	 * Returns the orderDate of this OrderModel.
	 * @return the orderDate
	 */
	public Date getOrderDate();
	
	/**
	 * Sets the orderDate of this OrderModel.
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(Date orderDate);
	
	/**
	 * Returns the userId of this OrderModel.
	 * @return the userId
	 */
	public int getUserId();
	
	/**
	 * Sets the userId of this OrderModel.
	 * @param userId the userId to set
	 */
	public void setUserId(int userId);
	
	/**
	 * Returns the name of this OrderModel.
	 * @return the name
	 */
	public String getName();
	
	/**
	 * Sets the name of this OrderModel.
	 * @param name the name to set
	 */
	public void setName(String name);
	
	/**
	 * Returns the address of this OrderModel.
	 * @return the address
	 */
	public String getAddress();
	
	/**
	 * Sets the address of this OrderModel.
	 * @param address the address to set
	 */
	public void setAddress(String address);
	
	/**
	 * Returns the postCode of this OrderModel.
	 * @return the postCode
	 */
	public String getPostcode();
	
	/**
	 * Sets the postCode of this OrderModel.
	 * @param postCode the postCode to set
	 */
	public void setPostcode(String postCode);
	
	/**
	 * Returns the telephone of this OrderModel.
	 * @return the telephone
	 */
	public String getTelephone();
	
	/**
	 * Sets the telephone of this OrderModel.
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone);
	
	/**
	 * Returns the phone of this OrderModel.
	 * @return the phone
	 */
	public String getPhone();
	
	/**
	 * Sets the phone of this OrderModel.
	 * @param phone the phone to set
	 */
	public void setPhone(String phone);
	
	/**
	 * Returns the post of this OrderModel.
	 * @return the post
	 */
	public String getPost();
	
	/**
	 * Sets the post of this OrderModel.
	 * @param post the post to set
	 */
	public void setPost(String post);
	
	/**
	 * Returns the pay of this OrderModel.
	 * @return the pay
	 */
	public String getPay();
	
	/**
	 * Sets the pay of this OrderModel.
	 * @param pay the pay to set
	 */
	public void setPay(String pay);
	
	/**
	 * Returns the notes of this OrderModel.
	 * @return the notes
	 */
	public String getNotes();
	
	/**
	 * Sets the notes of this OrderModel.
	 * @param notes the notes to set
	 */
	public void setNotes(String notes);
	
}