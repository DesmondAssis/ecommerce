package com.desmond.ecommerce.interf.model;

import java.util.List;

/**
 * 
 * @author Presley
 * @date 6 May 2014 22:11:55
 * @version 1.0
 * #KindsManageModel,
 */
public class KindsManageModelIMpl {
	
	private int classid;
	private String classname;
	private int classbelong;
	private int classtype;
	private double saleamount;
	private List<KindsManageModelIMpl> list;
	
	/**
	 * Returns the classid of this KindsManageModel.
	 * @return the classid
	 */
	public int getClassid() {
		return classid;
	}
	/**
	 * Sets the classid of this KindsManageModel.
	 * @param classid the classid to set
	 */
	public void setClassid(int classid) {
		this.classid = classid;
	}
	/**
	 * Returns the classname of this KindsManageModel.
	 * @return the classname
	 */
	public String getClassname() {
		return classname;
	}
	/**
	 * Sets the classname of this KindsManageModel.
	 * @param classname the classname to set
	 */
	public void setClassname(String classname) {
		this.classname = classname;
	}
	/**
	 * Returns the classbelong of this KindsManageModel.
	 * @return the classbelong
	 */
	public int getClassbelong() {
		return classbelong;
	}
	/**
	 * Sets the classbelong of this KindsManageModel.
	 * @param classbelong the classbelong to set
	 */
	public void setClassbelong(int classbelong) {
		this.classbelong = classbelong;
	}
	/**
	 * Returns the classtype of this KindsManageModel.
	 * @return the classtype
	 */
	public int getClasstype() {
		return classtype;
	}
	/**
	 * Sets the classtype of this KindsManageModel.
	 * @param classtype the classtype to set
	 */
	public void setClasstype(int classtype) {
		this.classtype = classtype;
	}
	/**
	 * Returns the saleamount of this KindsManageModel.
	 * @return the saleamount
	 */
	public double getSaleamount() {
		return saleamount;
	}
	/**
	 * Sets the saleamount of this KindsManageModel.
	 * @param saleamount the saleamount to set
	 */
	public void setSaleamount(double saleamount) {
		this.saleamount = saleamount;
	}
	/**
	 * Returns the list of this KindsManageModel.
	 * @return the list
	 */
	public List<KindsManageModelIMpl> getList() {
		return list;
	}
	/**
	 * Sets the list of this KindsManageModel.
	 * @param list the list to set
	 */
	public void setList(List<KindsManageModelIMpl> list) {
		this.list = list;
	}
	
}
