package com.desmond.ec.comment.impl;

import com.desmond.ec.comment.intf.Comment;

public abstract class CommentServiceBaseImpl {
	public int add(Comment comment) {
		return getDao().add(comment);
	}
	
	public int update(Comment comment) {
		return getDao().update(comment);
	}
	
	public Comment fetchByPrimaryKey(long primaryKey) {
		return getDao().fetchByPrimaryKey(primaryKey);
	}
	
	public int delete(long primaryKey) {
		return getDao().delete(primaryKey);
	}
	
	public CommentDaoImpl getDao() {
		return dao;
	}
	
	public void setDao(CommentDaoImpl dao) {
		this.dao = dao;
	}

	private CommentDaoImpl dao;
}
