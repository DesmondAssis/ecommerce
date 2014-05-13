package com.desmond.ecommerce.impl.model;

import java.util.List;

import com.desmond.ecommerce.impl.model.base.BaseModelImpl;
import com.desmond.ecommerce.interf.model.GoodsModel;

/**
 * 
 * @author Presley
 * @date 6 May 2014 21:46:37
 * @version 1.0 #GoodsModelImpl
 */
public class GoodsModelImpl extends BaseModelImpl implements GoodsModel {
	private String name;
	private String mainClass;
	private String subClass;
	private int unit;
	private double price;
	private int remain;
	private String image;
	private boolean isRecommend;
	private String describe;
	private String goodsBigType;
	private List<CommentModelImpl> commentList;
	
	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String getMainClass() {
		return this.mainClass;
	}
	@Override
	public void setMainClass(String mainClass) {
		this.mainClass = mainClass;
		
	}
	@Override
	public String getSubClass() {
		return this.subClass;
	}
	@Override
	public void setSubClass(String subClass) {
		this.subClass = subClass;
	}
	@Override
	public double getPrice() {
		return this.price;
	}
	@Override
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public int getRemain() {
		return this.remain;
	}
	@Override
	public void setRemain(int remain) {
		this.remain = remain;
	}
	@Override
	public String getImage() {
		return image;
	}
	@Override
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public int getUnit() {
		return unit;
	}
	@Override
	public void setUnit(int unit) {
		this.unit = unit;
	}
	@Override
	public boolean isRecommend() {
		return this.isRecommend;
	}
	@Override
	public void setRecommend(boolean isRecommend) {
		this.isRecommend = isRecommend;
	}
	/**
	 * Returns the describe of this GoodsModelImpl.
	 * @return the describe
	 */
	public String getDescribe() {
		return describe;
	}
	/**
	 * Sets the describe of this GoodsModelImpl.
	 * @param describe the describe to set
	 */
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	/**
	 * Returns the goodsBigType of this GoodsModelImpl.
	 * @return the goodsBigType
	 */
	public String getGoodsBigType() {
		return goodsBigType;
	}
	/**
	 * Sets the goodsBigType of this GoodsModelImpl.
	 * @param goodsBigType the goodsBigType to set
	 */
	public void setGoodsBigType(String goodsBigType) {
		this.goodsBigType = goodsBigType;
	}
	/**
	 * Returns the commentList of this GoodsModelImpl.
	 * @return the commentList
	 */
	public List<CommentModelImpl> getCommentList() {
		return commentList;
	}
	/**
	 * Sets the commentList of this GoodsModelImpl.
	 * @param commentList the commentList to set
	 */
	public void setCommentList(List<CommentModelImpl> commentList) {
		this.commentList = commentList;
	}
}
