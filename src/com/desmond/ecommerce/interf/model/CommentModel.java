package com.desmond.ecommerce.interf.model;

import java.sql.Date;

import com.desmond.ecommerce.interf.model.base.BaseModel;

/**
 * 
 * @author Presley
 * @date 6 May 2014 21:32:50
 * @version 1.0 #CommentModel
 */
public interface CommentModel extends BaseModel{
	
	/**
	 * Returns the goodsId of this CommentModel.
	 * @return the goodsId
	 */
	public long getGoodsId();
	
	/**
	 * Sets the goodsId of this CommentModel.
	 * @param goodsId the goodsId to set
	 */
	public void setGoodsId(long goodsId);
	
	/**
	 * Returns the userId of this CommentModel.
	 * @return the userId
	 */
	public long getUserId();
	
	/**
	 * Sets the userId of this CommentModel.
	 * @param userId the userId to set
	 */
	public void setUserId(long userId);
	
	/**
	 * Returns the commentDate of this CommentModel.
	 * @return the commentDate
	 */
	public Date getCommentDate();
	
	/**
	 * Sets the commentDate of this CommentModel.
	 * @param commentDate the commentDate to set
	 */
	public void setCommentDate(Date commentDate);
	
	/**
	 * Returns the commentContent of this CommentModel.
	 * @return the commentContent
	 */
	public String getCommentContent();
	
	/**
	 * Sets the commentContent of this CommentModel.
	 * @param commentContent the commentContent to set
	 */
	public void setCommentContent(String commentContent);
	
}
