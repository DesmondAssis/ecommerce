package com.desmond.ecommerce.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.Date;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.desmond.ecommerce.form.UserForm;
import com.desmond.ecommerce.impl.model.UserModelImpl;
import com.desmond.ecommerce.impl.service.UserLocalServiceImpl;
import com.desmond.ecommerce.interf.model.UserModel;
import com.desmond.ecommerce.interf.service.UserService;

/**
 * 
 * @author Presley
 * @date 13 May 2014 21:53:14
 * @version 1.0 #UserAction
 */
public class UserAction extends DispatchAction {

	/**
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward regist(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		UserForm uf = (UserForm) form;
		ActionForward forward = null;
		String forwardPage = "";
		boolean isSuccess = false;
		UserService us = new UserLocalServiceImpl();

		UserModel ub = new UserModelImpl();

		ub.setAddress(uf.getAddress());
		ub.setAnswer(uf.getAnswer());
		// ub.setCreditId(uf.getCreditId());
		ub.setEmail(uf.getEmail());
		ub.setIdentity(uf.getIdentity());
		ub.setName(uf.getName());
		ub.setPostcode(uf.getPostcode());
		ub.setPassword(uf.getPassword());
		ub.setQuestion(uf.getQuestion());
		ub.setPhone(uf.getPhone());
		ub.setReallyName(uf.getReallyName());

		Date now = new Date(new java.util.Date().getTime());
		ub.setRegistDate(now);

		isSuccess = us.regist(ub);
		
		if (isSuccess) {
			HttpSession session = request.getSession();
			session.setAttribute("user", ub);
			forwardPage = "";
		}
		
		forward = mapping.findForward(forwardPage);
		
		return forward;
	}

	/**
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward login(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		UserForm uf = (UserForm) form;
		ActionForward forward = null;
		String forwardPage = "";
		UserService us = new UserLocalServiceImpl();
		UserModel ub = null;
		ub = us.login(uf.getName(), uf.getPassword());
		
		if (ub != null) {
			HttpSession session = request.getSession();
			session.setAttribute("user", ub);
			forwardPage = "";
		}
		
		forward = mapping.findForward(forwardPage);
		
		return forward;
	}

	/**
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward update(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		UserForm uf = (UserForm) form;
		ActionForward forward = null;
		String forwardPage = ""; // Ĭ��Ϊʧ��ҳ��
		boolean isSuccess = false;
		UserService us = new UserLocalServiceImpl();

		UserModel ub = new UserModelImpl();
		ub.setPrimaryKey(uf.getUserId());
		ub.setName(uf.getName());
		ub.setPassword(uf.getPassword());
		ub.setName(uf.getName());
		ub.setAddress(uf.getAddress());
		ub.setQuestion(uf.getQuestion());
		ub.setAnswer(uf.getAnswer());
//		ub.setCreditId(uf.getCreditId());
		ub.setEmail(uf.getEmail());
		ub.setIdentity(uf.getIdentity());
		ub.setPostcode(uf.getPostcode());
		ub.setPhone(uf.getPhone());

		isSuccess = us.update(ub);

		if (isSuccess) {
			HttpSession session = request.getSession();
			session.setAttribute("user", ub);
			forwardPage = "";
		}
		
		forward = mapping.findForward(forwardPage);
		
		return forward;
	}

	/**
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward modifyPwd(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		UserForm uf = (UserForm) form;
		ActionForward forward = null;
		String forwardPage = "";
		boolean isSuccess = false;
		UserService us = new UserLocalServiceImpl();
		isSuccess = us.modifyPassword(uf.getUserId(), uf.getNewPwd());

		
		if (isSuccess) {
			HttpSession session = request.getSession();
			UserModel ub = (UserModel) session.getAttribute("user");
			ub.setPassword(uf.getPassword());
			session.setAttribute("user", ub);
			forwardPage = "";
		}
		
		forward = mapping.findForward(forwardPage);
		
		return forward;
	}

	/**
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward getPwd(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		UserForm uf = (UserForm) form;
		ActionForward forward = null;
		String forwardPage = ""; // Ĭ��Ϊʧ��ҳ��
		boolean isSuccess = false;
		UserService us = new UserLocalServiceImpl();
		isSuccess = us.changePassword(uf.getName(), uf.getAnswer(), uf.getNewPwd());
		
		if (isSuccess) {
			forwardPage = "";
		}
		forward = mapping.findForward(forwardPage);
		
		return forward;
	}

}
