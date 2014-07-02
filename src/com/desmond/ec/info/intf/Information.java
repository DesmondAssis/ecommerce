package com.desmond.ec.info.intf;


import com.desmond.servicebuilder.model.base.intf.BaseModel;

public interface Information extends BaseModel{
		public String getTitle();
	public void setTitle(String title);
	public String getContent();
	public void setContent(String content);
	public int getStatus();
	public void setStatus(int status);
	public int getType();
	public void setType(int type);

}
