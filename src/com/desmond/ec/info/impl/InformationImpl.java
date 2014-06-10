package com.desmond.ec.info.impl;

import com.desmond.ec.info.intf.Information;

import com.desmond.ecommerce.base.model.impl.BaseModelImpl;

public class InformationImpl extends BaseModelImpl implements Information{
		private String title;
	private String content;
	private int status;
	private int type;

		public String getTitle() {		return title;	}
	public void setTitle(String title) {		this.title = title;	}
	public String getContent() {		return content;	}
	public void setContent(String content) {		this.content = content;	}
	public int getStatus() {		return status;	}
	public void setStatus(int status) {		this.status = status;	}
	public int getType() {		return type;	}
	public void setType(int type) {		this.type = type;	}

	
	public Information mockInformationImpl() {
		Information information = new InformationImpl();
				information.setTitle("Title" + Math.round(100000000));		information.setContent("Content" + Math.round(100000000));		information.setStatus(Math.round(100));		information.setType(Math.round(100));
		
		return information;
	}
}
