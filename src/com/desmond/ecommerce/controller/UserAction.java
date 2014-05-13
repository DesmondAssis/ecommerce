package com.desmond.ecommerce.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.Date;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 * 
 * @author Presley
 * @date 13 May 2014 21:53:14
 * @version 1.0
 * #UserAction
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
			HttpServletRequest request, HttpServletResponse response){
		UserForm uf=(UserForm)form;
		ActionForward forward=null;
		String forwardPage=""; //Ĭ��Ϊʧ��ҳ��
		boolean isSuccess=false;	  
		UserService us=new UserService();
		
		UserBean ub=new UserBean();
		
	    ub.setAddress(uf.getAddress()); 
	    ub.setAnswer(uf.getAnswer());
	    ub.setCreditId(uf.getCreditId());
	    ub.setEmail(uf.getEmail());
	    ub.setIdentity(uf.getIdentity());
	    ub.setName(uf.getName());
	    ub.setPostcode(uf.getPostcode());
	    ub.setPwd(uf.getPwd());
	    ub.setQuestion(uf.getQuestion());
	    ub.setTel(uf.getTel());
	    ub.setUserName(uf.getUserName());
	    
	    Date now=new Date(new java.util.Date().getTime());	    
	    ub.setRegistTime(now);
			    
	    isSuccess=us.regist(ub);
		  
	    //ע��ɹ�  ���سɹ�ҳ��
	    if(isSuccess){
	      HttpSession session=request.getSession();
	      session.setAttribute("user",ub);
	  	  forwardPage="";
	    }
	    forward=mapping.findForward(forwardPage);
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
			HttpServletRequest request, HttpServletResponse response){
		UserForm uf=(UserForm)form;
		ActionForward forward=null;
		String forwardPage=""; //Ĭ��Ϊʧ��ҳ��
		UserService us=new UserService();
		UserBean ub=null;
		ub=us.login(uf.getUserName(), uf.getPwd());
		
	    //ע��ɹ�  ���سɹ�ҳ��
	    if(ub!=null){
	      HttpSession session=request.getSession();
		  session.setAttribute("user",ub);
	  	  forwardPage="";
	    }
	    forward=mapping.findForward(forwardPage);
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
			HttpServletRequest request, HttpServletResponse response){
		UserForm uf=(UserForm)form;
		ActionForward forward=null;
		String forwardPage=""; //Ĭ��Ϊʧ��ҳ��
		boolean isSuccess=false;	  
		UserService us=new UserService();
	     
        UserBean ub=new UserBean();
        ub.setUserId(uf.getUserId());
        ub.setUserName(uf.getUserName());
        ub.setPwd(uf.getPwd());
        ub.setName(uf.getName());
	    ub.setAddress(uf.getAddress());
	    ub.setQuestion(uf.getQuestion());
	    ub.setAnswer(uf.getAnswer());
	    ub.setCreditId(uf.getCreditId());
	    ub.setEmail(uf.getEmail());
	    ub.setIdentity(uf.getIdentity());	   
	    ub.setPostcode(uf.getPostcode());	   
	    ub.setTel(uf.getTel());
	    	    			    
	    isSuccess=us.update(ub);
				  
	    //ע��ɹ�  ���سɹ�ҳ��
	    if(isSuccess){
	      HttpSession session=request.getSession();
		  session.setAttribute("user",ub);
	  	  forwardPage="";
	    }
	    forward=mapping.findForward(forwardPage);
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
			HttpServletRequest request, HttpServletResponse response){
		UserForm uf=(UserForm)form;
		ActionForward forward=null;
		String forwardPage=""; //Ĭ��Ϊʧ��ҳ��
		boolean isSuccess=false;	  
		UserService us=new UserService();
		isSuccess=us.modifyPwd(uf.getUserId(),uf.getNewPwd());
		
	    //ע��ɹ�  ���سɹ�ҳ��
	    if(isSuccess){
	      HttpSession session=request.getSession();
	      UserBean ub=(UserBean)session.getAttribute("user");
	      ub.setPwd(uf.getNewPwd());
	      session.setAttribute("user", ub);
	  	  forwardPage="";
	    }
	    forward=mapping.findForward(forwardPage);
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
			HttpServletRequest request, HttpServletResponse response){
		UserForm uf=(UserForm)form;
		ActionForward forward=null;
		String forwardPage=""; //Ĭ��Ϊʧ��ҳ��
		boolean isSuccess=false;	  
		UserService us=new UserService();
		isSuccess=us.getPwd(uf.getUserName(),uf.getAnswer(),uf.getNewPwd()); 		  
	    //ע��ɹ�  ���سɹ�ҳ��
	    if(isSuccess){
	  	  forwardPage="";
	    }
	    forward=mapping.findForward(forwardPage);
		return forward;
	}	
	
}
