package com.desmond.ecommerce.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.desmond.ec.user.impl.AdministratorImpl;
import com.desmond.ec.user.impl.AdministratorLocalServiceImpl;
import com.desmond.ec.user.intf.Administrator;
import com.desmond.ecommerce.form.AdminForm;

/**"
 * 
 * @author Presley
 * @date 19 May 2014 20:53:45
 * @version 1.0
 * #AdminAction
 */
public class AdminAction extends DispatchAction {
	private static Logger log = Logger.getLogger(AdminAction.class.getName());

public ActionForward regist(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response){	  
	  AdminForm af=(AdminForm)form;	
	  ActionForward forward=null;
	  String forwardPage="managerFailed";  
	  boolean isSucces=false;
	  
	  AdministratorLocalServiceImpl as=new AdministratorLocalServiceImpl();
	  Administrator admin = new AdministratorImpl();
	  admin.setUserId(userId);
	  isSucces = as.regist(af.getUserName(), af.getPwd(), af.getEmail());
	  
      if(isSucces){
    	forwardPage="listAdmin"; 
      }
      
      forward = mapping.findForward(forwardPage);
      return forward;
}


public ActionForward login(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response){
	 AdminForm af=(AdminForm)form;	
	 ActionForward forward=null;
	 String forwardPage="adminLoginFailed";
	 boolean isSucces=false;	  
	 
	 log.info("controller method----login");

	 AdminService as=new AdminLocalServiceImpl();
	 AdminModel admin = as.login(af.getUserName(),af.getPwd()); 	 
	 if(admin!=null){
		 HttpSession session=request.getSession();
		 session.setAttribute("admin", admin);

		 forwardPage="adminLoginSuccess";//��ͨ����Ա��½�ɹ�ҳ��
		 if(false){
			 forwardPage="managerSuccess";
		 }
	 }
	 forward=mapping.findForward(forwardPage);
	 return forward;
}
//
//public ActionForward updatePwd(ActionMapping mapping, ActionForm form,
//		HttpServletRequest request, HttpServletResponse response){
//	AdminForm af=(AdminForm)form;	
//	ActionForward forward=null;
//	String forwardPage="adminLoginFailed";//��ͨ����Աʧ��ҳ��
//	
//	
//	forwardPage="managerFailed"; //ϵͳ����Աʧ��ҳ��
//	
//	
//	log.info("controller method----updatePwd  adminid:"+af.getAdminId()+"newpwd:"+af.getNewPwd());
//	
///*	HttpSession session=request.getSession();
//	AdminBean admin=(AdminBean)session.getAttribute("admin");
//	if(admin==null){
//		log.info("admin don't exits");
//	}
//	if(admin.getAdmin_type()==0){
//		forwardPage="managerFailed"; //ϵͳ����Աʧ��ҳ��
//	}
//
//	//�����������
//	if(!admin.getPwd().equals(af.getPwd())){
//		forward=mapping.findForward(forwardPage);
//		return forward;
//	}*/
//
//	boolean isSucces=false;		  
//	AdminService as=new AdminService();
//	isSucces=as.updatePwd(af.getAdminId(), af.getNewPwd());	
//	 if(isSucces){
//		 //�޸ĳɹ���
//		 log.info("�����޸ĳɹ�");
//		 //admin.setPwd(af.getNewPwd());		 
//		 //session.setAttribute("admin", admin);		 
//		 forwardPage="managerSuccess";//�޸ĳɹ�ҳ��
//		 
//		 /*if(admin.getAdmin_type()==1){
//			 forwardPage="adminLoginSuccess";
//		 }else{
//			 forwardPage="managerSuccess";//�޸ĳɹ�ҳ��
//		 }*/
//
//	 }
//	 forward=mapping.findForward(forwardPage);
//	return forward;
//}
///**
//��������ɾ�����Ա������
//@param af ��װ�?��Ϣ��formbean
// @param request  HttpServletRequest
// @param response HttpServletResponse
// @return String ��תҳ��
//*/
//public ActionForward deleteAdmin(ActionMapping mapping, ActionForm form,
//		HttpServletRequest request, HttpServletResponse response){
//	AdminForm af=(AdminForm)form;	
//	ActionForward forward=null;
//	String forwardPage="managerFailed"; //Ĭ��Ϊʧ��ҳ��
//	boolean isSucces=false;	
//	AdminService as=new AdminService();
//	isSucces=as.deleteAdmin(af.getDeleteAdminId());		
//	if(isSucces){
//		forwardPage="getAdmin";//ɾ��ɹ�ҳ��
//	}
//	forward=mapping.findForward(forwardPage);
//	return forward;
//	
//}
///**
//��������ɾ���û�������
//@param af ��װ�?��Ϣ��formbean
// @param request  HttpServletRequest
// @param response HttpServletResponse
// @return String ��תҳ��
//*/
//public ActionForward deleteUser(ActionMapping mapping, ActionForm form,
//		HttpServletRequest request, HttpServletResponse response){
//	AdminForm af=(AdminForm)form;	
//	ActionForward forward=null;
//	String forwardPage=""; //Ĭ��Ϊʧ��ҳ��
//	boolean isSucces=false;	
//	AdminService as=new AdminService();
//	isSucces=as.deleteAdmin(af.getDeleteUserId());		
//	if(isSucces){
//		forwardPage="";//ɾ��ɹ�ҳ��
//	}
//	forward=mapping.findForward(forwardPage);
//	return forward;
//	
//}
//
///**
//���������ѯ����Ա��Ϣ������
//@param af ��װ�?��Ϣ��formbean
// @param request  HttpServletRequest
// @param response HttpServletResponse
// @return String ��תҳ��
//*/
//public ActionForward viewAdmin(ActionMapping mapping, ActionForm form,
//		HttpServletRequest request, HttpServletResponse response){
//	AdminForm af=(AdminForm)form;	
//	ActionForward forward=null;
//	String forwardPage="managerFailed"; //Ĭ��Ϊʧ��ҳ��
//	AdminBean ad=null;
//	AdminService as=new AdminService();
//
//	String id=request.getParameter("adminId");
//	int adminId=Integer.parseInt(id);
//	
//	ad=as.viewAdmin(adminId);	
//	if(ad!=null){
//		
//		request.setAttribute("viewAdmin", ad);
//
//		for(int i=0;i<ad.getAuthority().length;i++){
//			switch(i){
//			case 0:  if(ad.getAuthority()[i]==1){request.setAttribute("authority1", new Integer(1));};break; 
//			case 1: if(ad.getAuthority()[i]==1){request.setAttribute("authority2", new Integer(1));};break; 
//			case 2: if(ad.getAuthority()[i]==1){request.setAttribute("authority3", new Integer(1));};break;
//			case 3:  if(ad.getAuthority()[i]==1){request.setAttribute("authority4", new Integer(1));};break;
//			case 4: if(ad.getAuthority()[i]==1){request.setAttribute("authority5", new Integer(1));};break;
//			
//			}
//		}
//		
//				
//		forwardPage="listAdmin";//�鿴�ɹ�ҳ��
//		log.info("�鿴�ɹ���"+ad.getAdminId());
//	}
//	forward=mapping.findForward(forwardPage);
//	return forward;
//	
//}
//
///**
//���������ѯ���й���Ա��Ϣ������
//@param af ��װ�?��Ϣ��formbean
// @param request  HttpServletRequest
// @param response HttpServletResponse
// @return String ��תҳ��
//*/
//public ActionForward getAdmin(ActionMapping mapping, ActionForm form,
//		HttpServletRequest request, HttpServletResponse response){
//	AdminForm af=(AdminForm)form;	
//	ActionForward forward=null;
//	String forwardPage="managerFailed"; //Ĭ��Ϊʧ��ҳ��
//	List<AdminBean> adminList=null;
//	AdminService as=new AdminService();
//	adminList=as.getAdmin();	
//	if(adminList.size()>0){
//		request.setAttribute("adminList", adminList);
//		request.setAttribute("adminListSize", adminList.size());
//		forwardPage="getAdmin";
//		log.info("controller getAdmin   ok");
//		
//		for(int i=0;i<adminList.size();i++){
//			AdminBean ab=(AdminBean)adminList.get(i);
//			log.info("adminid :"+ab.getAdminId());
//		}
//	}
//	forward=mapping.findForward(forwardPage);
//	return forward;
//	
//}
//
//
///**
//���������޸Ĺ���ԱȨ�޵�����
//@param af ��װ�?��Ϣ��formbean
// @param request  HttpServletRequest
// @param response HttpServletResponse
// @return String ��תҳ��
//*/
//public ActionForward updateAuthority(ActionMapping mapping, ActionForm form,
//		HttpServletRequest request, HttpServletResponse response){
//	AdminForm af=(AdminForm)form;	
//	ActionForward forward=null;
//	String forwardPage="managerFailed"; //Ĭ��Ϊʧ��ҳ��
//	boolean isSucces=false;	
//	AdminService as=new AdminService();
//	isSucces=as.updateAuthority(af.getAdminId(),af.getAuthority());		
//	if(isSucces){
//		forwardPage="OperateAdminSuccess";//�ɹ�ҳ��
//	}
//	forward=mapping.findForward(forwardPage);
//	return forward;
//}
///**
//�����������Ա��ѯ�û�������
//@param af ��װ�?��Ϣ��formbean
// @param request  HttpServletRequest
// @param response HttpServletResponse
// @return String ��תҳ��
//*/
//public ActionForward searchUsers(ActionMapping mapping, ActionForm form,
//		HttpServletRequest request, HttpServletResponse response){
//	AdminForm af=(AdminForm)form;	
//	ActionForward forward=null;
//	String forwardPage=""; //Ĭ��Ϊʧ��ҳ��
//	List<UserBean> userList=null;
//	AdminService as=new AdminService();
//    userList=as.searchUsers(af.getStartTime(),af.getEndTime());		
//	if(userList.size()>0){
//		request.setAttribute("userList", userList);
//		forwardPage="";//�ɹ�ҳ��
//	}
//	forward=mapping.findForward(forwardPage);
//	return forward;
//}

}
