package com.desmond.ecommerce.interf.model;

import java.sql.Date;

import com.desmond.ecommerce.interf.model.base.BaseModel;

/**
 * 
 * @author Presley
 * @date 6 May 2014 22:04:31
 * @version 1.0
 * #InfoModel,ec_info
 */
public interface InfoModel extends BaseModel{
	
	/**
	 * Returns the title of this InfoModel.
	 * @return the title
	 */
	public String getTitle();
	
	/**
	 * Sets the title of this InfoModel.
	 * @param title the title to set
	 */
	public void setTitle(String title);
	
	/**
	 * Returns the content of this InfoModel.
	 * @return the content
	 */
	public String getContent();
	
	/**
	 * Sets the content of this InfoModel.
	 * @param content the content to set
	 */
	public void setContent(String content);
	
	/**
	 * Returns the status of this InfoModel.
	 * @return the status
	 */
	public int getStatus();
	
	/**
	 * Sets the status of this InfoModel.
	 * @param status the status to set
	 */
	public void setStatus(int status);
	
	/**
	 * Returns the infoDate of this InfoModel.
	 * @return the infoDate
	 */
	public Date getInfoDate();
	
	/**
	 * Sets the infoDate of this InfoModel.
	 * @param infoDate the infoDate to set
	 */
	public void setInfoDate(Date infoDate);
	
	/**
	 * Returns the infoType of this InfoModel.
	 * @return the infoType
	 */
	public int getInfoType();
	
	/**
	 * Sets the infoType of this InfoModel.
	 * @param infoType the infoType to set
	 */
	public void setInfoType(int infoType);
	
}
