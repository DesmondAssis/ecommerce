package com.desmond.ec.comment.intf;


import com.desmond.ecommerce.base.model.intf.BaseModel;

public interface Comment extends BaseModel{
		public long getUserId();
	public void setUserId(long userId);
	public String getContent();
	public void setContent(String content);
	public long getGoodId();
	public void setGoodId(long goodId);

}
