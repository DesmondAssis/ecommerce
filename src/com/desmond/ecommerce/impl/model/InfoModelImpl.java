package com.desmond.ecommerce.impl.model;

import java.sql.Date;

import com.desmond.ecommerce.impl.model.base.BaseModelImpl;
import com.desmond.ecommerce.service.model.InfoModel;

/**
 * 
 * @author Presley
 * @date 6 May 2014 22:09:56
 * @version 1.0
 * #InfoModelImpl
 */
public class InfoModelImpl extends BaseModelImpl implements InfoModel{
	
	private String title;
	private String content;
	private int status=-1; // 0-draft, 1-published
	private Date infoDate;
	private int infoType=-1; // 0-notice, 1-information
	
	/**
	 * Returns the title of this InfoModelImpl.
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * Sets the title of this InfoModelImpl.
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * Returns the content of this InfoModelImpl.
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * Sets the content of this InfoModelImpl.
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * Returns the status of this InfoModelImpl.
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}
	/**
	 * Sets the status of this InfoModelImpl.
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}
	/**
	 * Returns the infoDate of this InfoModelImpl.
	 * @return the infoDate
	 */
	public Date getInfoDate() {
		return infoDate;
	}
	/**
	 * Sets the infoDate of this InfoModelImpl.
	 * @param infoDate the infoDate to set
	 */
	public void setInfoDate(Date infoDate) {
		this.infoDate = infoDate;
	}
	/**
	 * Returns the infoType of this InfoModelImpl.
	 * @return the infoType
	 */
	public int getInfoType() {
		return infoType;
	}
	/**
	 * Sets the infoType of this InfoModelImpl.
	 * @param infoType the infoType to set
	 */
	public void setInfoType(int infoType) {
		this.infoType = infoType;
	}
	
}
