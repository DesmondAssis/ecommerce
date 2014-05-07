package com.desmond.ecommerce.impl.model;

import com.desmond.ecommerce.impl.model.base.BaseModelImpl;
import com.desmond.ecommerce.service.model.BuyersModel;

/**
 * 
 * @author Presley
 * @date 6 May 2014 21:26:47
 * @version 1.0
 * #BuyersModelImpl
 */
public class BuyersModelImpl extends BaseModelImpl implements BuyersModel{
		
	private String sessionId;
	private int goodsId;
	private int goodNum;
	private int userId;
	private String goodsName;
	private double goodsPrice;
	private int cartId;
	private double sum;
	
	@Override
	public int getGoodsId() {
		return this.goodsId;
	}
	@Override
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
		
	}
	@Override
	public int getGoodNum() {
		return this.goodNum;
	}
	@Override
	public void setGoodNum(int goodNum) {
		this.goodNum = goodNum;
		
	}
	@Override
	public int getUserId() {
		return this.userId;
	}
	@Override
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * Returns the sessionId of this BuyersModelImpl.
	 * @return the sessionId
	 */
	public String getSessionId() {
		return sessionId;
	}
	/**
	 * Sets the sessionId of this BuyersModelImpl.
	 * @param sessionId the sessionId to set
	 */
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	/**
	 * Returns the goodsName of this BuyersModelImpl.
	 * @return the goodsName
	 */
	public String getGoodsName() {
		return goodsName;
	}
	/**
	 * Sets the goodsName of this BuyersModelImpl.
	 * @param goodsName the goodsName to set
	 */
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	/**
	 * Returns the goodsPrice of this BuyersModelImpl.
	 * @return the goodsPrice
	 */
	public double getGoodsPrice() {
		return goodsPrice;
	}
	/**
	 * Sets the goodsPrice of this BuyersModelImpl.
	 * @param goodsPrice the goodsPrice to set
	 */
	public void setGoodsPrice(double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	/**
	 * Returns the cartId of this BuyersModelImpl.
	 * @return the cartId
	 */
	public int getCartId() {
		return cartId;
	}
	/**
	 * Sets the cartId of this BuyersModelImpl.
	 * @param cartId the cartId to set
	 */
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	/**
	 * Returns the sum of this BuyersModelImpl.
	 * @return the sum
	 */
	public double getSum() {
		return sum;
	}
	/**
	 * Sets the sum of this BuyersModelImpl.
	 * @param sum the sum to set
	 */
	public void setSum(double sum) {
		this.sum = sum;
	}
		
}
