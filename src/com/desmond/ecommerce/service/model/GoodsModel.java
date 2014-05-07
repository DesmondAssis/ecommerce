package com.desmond.ecommerce.service.model;


import com.desmond.ecommerce.service.model.base.BaseModel;

/**
 * 
 * @author Presley
 * @date 6 May 2014 21:45:52
 * @version 1.0
 * #GoodsModel
 */
public interface GoodsModel extends BaseModel{
	
	/**
	 * Returns the name of this GoodsModel.
	 * @return the name
	 */
	public String getName();
	
	/**
	 * Sets the name of this GoodsModel.
	 * @param name the name to set
	 */
	public void setName(String name);
	
	/**
	 * Returns the mainClass of this GoodsModel.
	 * @return the mainClass
	 */
	public String getMainClass();
	
	/**
	 * Sets the mainClass of this GoodsModel.
	 * @param mainClass the mainClass to set
	 */
	public void setMainClass(String mainClass);
	
	/**
	 * Returns the subClass of this GoodsModel.
	 * @return the subClass
	 */
	public String getSubClass();
	
	/**
	 * Sets the subClass of this GoodsModel.
	 * @param subClass the subClass to set
	 */
	public void setSubClass(String subClass);
	
	/**
	 * Returns the price of this GoodsModel.
	 * @return the price
	 */
	public double getPrice();
	
	/**
	 * Sets the price of this GoodsModel.
	 * @param price the price to set
	 */
	public void setPrice(double price);
	
	/**
	 * Returns the remian of this GoodsModel.
	 * @return the remian
	 */
	public int getRemain();
	
	/**
	 * Sets the remian of this GoodsModel.
	 * @param remian the remian to set
	 */
	public void setRemain(int remian);
	
	/**
	 * Returns the image of this GoodsModel.
	 * @return the image
	 */
	public String getImage();
	
	/**
	 * Sets the image of this GoodsModel.
	 * @param image the image to set
	 */
	public void setImage(String image);
	
	/**
	 * Returns the unit of this GoodsModel.
	 * @return the unit
	 */
	public int getUnit();
	
	/**
	 * Sets the unit of this GoodsModel.
	 * @param unit the unit to set
	 */
	public void setUnit(int unit);
	
	/**
	 * Returns the isRecommend of this GoodsModel.
	 * @return the isRecommend
	 */
	public boolean isRecommend();
	
	/**
	 * Sets the isRecommend of this GoodsModel.
	 * @param isRecommend the isRecommend to set
	 */
	public void setRecommend(boolean isRecommend);
	
}
