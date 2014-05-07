package com.desmond.ecommerce.service.model;

import com.desmond.ecommerce.service.model.base.BaseModel;

/**
 * 
 * @author Presley
 * @date 6 May 2014 06:57:35
 * @version 1.0
 * #BuyersModel
 */
public interface BuyersModel extends BaseModel{
	
	/**
	 * Returns the sessionid of this BuyersModel.
	 * @return the sessionid
	 */
	public String getSessionId();
	
	/**
	 * Sets the sessionid of this BuyersModel.
	 * @param sessionid the sessionid to set
	 */
	public void setSessionId(String sessionid);
	
	/**
	 * Returns the goodsId of this BuyersModel.
	 * @return the goodsId
	 */
	public int getGoodsId();
	
	/**
	 * Sets the goodsId of this BuyersModel.
	 * @param goodsId the goodsId to set
	 */
	public void setGoodsId(int goodsId);
	
	/**
	 * Returns the goodNum of this BuyersModel.
	 * @return the goodNum
	 */
	public int getGoodNum();
	
	/**
	 * Sets the goodNum of this BuyersModel.
	 * @param goodNum the goodNum to set
	 */
	public void setGoodNum(int goodNum);
	
	/**
	 * Returns the userId of this BuyersModel.
	 * @return the userId
	 */
	public int getUserId();
	
	/**
	 * Sets the userId of this BuyersModel.
	 * @param userId the userId to set
	 */
	public void setUserId(int userId);
		
}
