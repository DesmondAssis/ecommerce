package com.desmond.ec.comment.impl;

import com.desmond.ec.comment.intf.Comment;

import com.desmond.ecommerce.base.model.impl.BaseModelImpl;

public class CommentImpl extends BaseModelImpl implements Comment{
		private long userId;
	private String content;
	private long goodId;

		public long getUserId() {		return userId;	}
	public void setUserId(long userId) {		this.userId = userId;	}
	public String getContent() {		return content;	}
	public void setContent(String content) {		this.content = content;	}
	public long getGoodId() {		return goodId;	}
	public void setGoodId(long goodId) {		this.goodId = goodId;	}

	
	public Comment mockCommentImpl() {
		Comment comment = new CommentImpl();
				comment.setUserId(Math.round(10000));		comment.setContent("Content" + Math.round(100000000));		comment.setGoodId(Math.round(10000));
		
		return comment;
	}
}
