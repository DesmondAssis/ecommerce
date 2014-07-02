package com.desmond.ecommerce.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.Date;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.desmond.ec.user.impl.UserImpl;
import com.desmond.ec.user.impl.UserLocalServiceImpl;
import com.desmond.ec.user.intf.User;
import com.desmond.ecommerce.form.UserForm;

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
		int isSuccess = 0;
		UserLocalServiceImpl uls = new UserLocalServiceImpl();

		User user = new UserImpl();

		user.setAddress(uf.getAddress());
		user.setAnswer(uf.getAnswer());
		user.setEmail(uf.getEmail());
		user.setIdentity(uf.getIdentity());
		user.setName(uf.getName());
		user.setPostcode(uf.getPostcode());
		user.setPassword(uf.getPassword());
		user.setQuestion(uf.getQuestion());
		user.setPhone(uf.getPhone());
		user.setReallyName(uf.getReallyName());

		isSuccess = uls.add(user);
		
		if (isSuccess > 0) {
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			forwardPage = "index";
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
		String forwardPage = "index";
		UserLocalServiceImpl uls = new UserLocalServiceImpl();
		User user =  uls.login(uf);
		
		if (user != null) {
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			forwardPage = "loginSuccess";
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
		String forwardPage = "";
		int isSuccess = 0;
		UserLocalServiceImpl us = new UserLocalServiceImpl();

		User ub = new UserImpl();
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

		if (isSuccess > 0) {
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
		UserLocalServiceImpl us = new UserLocalServiceImpl();
		User user = us.fetchByPrimaryKey(uf.getUserId());
		user.setPassword(uf.getNewPwd());

		return update(mapping, form, request, response);
	}
	
	public ActionForward logout(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("user", null);
		request.getSession().invalidate();
		
		ActionForward forward = mapping.findForward("index");
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
		String forwardPage = "";
		boolean isSuccess = false;
		UserLocalServiceImpl uls = new UserLocalServiceImpl();
		isSuccess = uls.changePassword(uf);
		
		if (isSuccess) {
			forwardPage = "";
		}
		forward = mapping.findForward(forwardPage);
		
		return forward;
	}

}
