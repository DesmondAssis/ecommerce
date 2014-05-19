package com.desmond.ecommerce.interf.service;
import com.desmond.ecommerce.interf.model.AdminModel;

/**
 * 
 * @author Presley
 * @date 19 May 2014 21:07:38
 * @version 1.0
 * #AdminLocalServiceImpl
 */
public interface AdminService {
	public boolean regist(String name, String pwd, String email);
	
	public AdminModel login(String name,String pwd);
	
	public boolean updatePwd(int adminId, String newPwd);
//	/**
//	��������ɾ�����Ա��ҵ��
//	@param adminId ����Ա��ID
//	*/
//	public boolean deleteAdmin(int[] adminId){
//		boolean isSuccess=false;
//		int result=0;
//		AdminDao dao=new AdminDao();
//		result=dao.deleteAdmin(adminId);		
//		if(result>0){
//			isSuccess=true;
//		}		
//		return isSuccess;
//	}
//	/**
//	��������ɾ���û���ҵ��
//	@param userId �û���ID
//	*/
//	public boolean deleteUser(int[] userId){
//		boolean isSuccess=false;
//		int result=0;
//		AdminDao dao=new AdminDao();
//		result=dao.deleteAdmin(userId);		
//		if(result>0){
//			isSuccess=true;
//		}		
//		return isSuccess;
//	}
//	/**
//	���������ѯ����Ա��Ϣ��ҵ��
//	@param adminId ����Աid
//	*/
//	 public AdminBean viewAdmin(int adminId){
//		 AdminBean ad=null;
//		 AdminDao dao=new AdminDao();
//		 ad=dao.viewAdmin(adminId);
//		 return ad;
//		 
//	 }
//	 /**
//		���������ѯ���й���Ա��Ϣ��ҵ��
//		@param adminId ����Աid
//		*/
//	 public List<AdminBean> getAdmin(){
//		 List<AdminBean> adminList=null;
//			 AdminDao dao=new AdminDao();
//			 adminList=dao.getAdmin();
//			 log.info("service getAdmin   ok");
//			 return adminList;
//			 
//		 }
//	 
//	/**
//	���������޸Ĺ���ԱȨ�޵�ҵ��
//	@param adminId ����Աid
//	@param authority ����ԱȨ��
//	*/
//	public boolean updateAuthority(int adminId,int[] authority){
//		boolean isSuccess=false;
//		int result=0;
//
//		AdminDao dao=new AdminDao();
//		result=dao.updateAuthority(authority,adminId);		
//		if(result>0){
//			isSuccess=true;
//		}		
//		return isSuccess;
//	}
//	/**
//	�����������Ա��ѯ�û���ҵ��
//	@param start ��ʼʱ��
//	@param end ����ʱ��
//	*/
//	public List<UserBean> searchUsers(String startTime,String endTime){
//		List<UserBean> userList=null;
//        
//		
//		Date start=new Date(java.util.Date.parse(startTime));
//		Date end=new Date(java.util.Date.parse(endTime));	
//		
//		
//		AdminDao dao=new AdminDao();
//		userList=dao.searchUsers(start,end);	
//		
//		return userList;
//	}
}
