package com.desmond.ecommerce.form;

import org.apache.struts.action.ActionForm;


/**
 * 
 * @author Presley
 * @date 19 May 2014 21:05:16
 * @version 1.0
 * #AdminForm
 */
public class AdminForm extends ActionForm{
	/**
	 * 
	 */
	private static final long serialVersionUID = -814697262761482770L;
	private int adminId;
	private String userName;
	private int admin_type;
	private String pwd;
	private String newPwd;
	private String email;
	private String confirmPwd;
	private int[] authority;
	private int[] deleteAdminId;
	private int[] deleteUserId;
	private String startTime;
	private String endTime;
	
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAdmin_type() {
		return admin_type;
	}
	public void setAdmin_type(int admin_type) {
		this.admin_type = admin_type;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getNewPwd() {
		return newPwd;
	}
	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}
	public String getConfirmPwd() {
		return confirmPwd;
	}
	public void setConfirmPwd(String confirmPwd) {
		this.confirmPwd = confirmPwd;
	}
	public int[] getAuthority() {
		return authority;
	}
	public void setAuthority(int[] authority) {
		this.authority = authority;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int[] getDeleteAdminId() {
		return deleteAdminId;
	}
	public void setDeleteAdminId(int[] deleteAdminId) {
		this.deleteAdminId = deleteAdminId;
	}
	public int[] getDeleteUserId() {
		return deleteUserId;
	}
	public void setDeleteUserId(int[] deleteUserId) {
		this.deleteUserId = deleteUserId;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
}
