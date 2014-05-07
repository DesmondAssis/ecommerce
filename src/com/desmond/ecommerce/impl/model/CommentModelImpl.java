package com.desmond.ecommerce.impl.model;

import java.sql.Date;

import com.desmond.ecommerce.impl.model.base.BaseModelImpl;
import com.desmond.ecommerce.service.model.CommentModel;

/**
 * 
 * @author Presley
 * @date 6 May 2014 21:36:24
 * @version 1.0
 * #CommentModelImpl
 */
public class CommentModelImpl extends BaseModelImpl implements CommentModel{
	
	private long goodsId;
	private long userId;
	private Date commentDate;
	private String commentContent;
	
	@Override
	public long getGoodsId() {
		return this.goodsId;
	}
	@Override
	public void setGoodsId(long goodsId) {
		this.goodsId = goodsId;
		
	}
	@Override
	public long getUserId() {
		return this.userId;
	}
	@Override
	public void setUserId(long userId) {
		this.userId = userId;
	}
	@Override
	public Date getCommentDate() {
		return this.commentDate;
	}
	@Override
	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}
	@Override
	public String getCommentContent() {
		return this.commentContent;
	}
	@Override
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

}
