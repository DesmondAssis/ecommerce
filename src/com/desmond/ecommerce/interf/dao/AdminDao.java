package com.desmond.ecommerce.interf.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import org.apache.log4j.Logger;

import com.desmond.ecommerce.impl.model.AdminModelImpl;
import com.desmond.ecommerce.interf.model.AdminModel;
import com.desmond.ecommerce.util.DButil;


/**
 * 
 * @author Presley
 * @date 19 May 2014 21:08:23
 * @version 1.0
 * #AdminDaoImpl
 */
public interface AdminDao {
	
	public int c(String name, String pwd, String email);
	
	public AdminModel login(String name,String pwd);
		
	public int updatePassword(int adminId, String newPwd);
//	/**
//	��������ɾ���û�����ݿ����
//	@param userId �û���ID
//	*/
//	public int deleteUser(int[] deleteId){
//		int update=0;
//		 
//	       Connection conn = DButil.getConnection();
//	       String sql="";
//	       PreparedStatement ps=null;
//	       try {
//	    	for(int i=0;i<deleteId.length;i++){
//	    	sql="delete from users where user_id=?";
//			ps=conn.prepareStatement(sql);
//			ps.setInt(1, deleteId[i]);			
//			update=ps.executeUpdate();			
//	    	}
//		} catch (SQLException e) {
//			log.error("error when execute sql" + sql, e);
//		}finally{
//			DButil.close(conn, ps);
//		}
//		}				
//		return update;		
//	}
//	/**
//	��������鿴����Ա��Ϣ����ݿ����
//	@param adminId ����Աid
//	*/
//   public AdminBean viewAdmin(int adminId){
//	   AdminBean ad=null;
//	   
//		
//	    Connection conn = DButil.getConnection();
//	    String sql="select * from admin where admin_id=?";
//	    PreparedStatement ps=null;
//	    ResultSet rs=null;
//	    try {
//			ps=conn.prepareStatement(sql);
//			ps.setInt(1, adminId);
//			rs=ps.executeQuery();
//			if(rs.next()){
//				ad=new AdminBean();
//				ad.setAdminId(rs.getInt("admin_id"));
//				ad.setUserName(rs.getString("admin_name"));
//				ad.setPwd(rs.getString("admin_pwd"));
//				ad.setAdmin_type(rs.getInt("admin_type"));
//				int [] auth=new int[5];
//				for(int i=0;i<auth.length;i++){
//					auth[i]=rs.getInt("authority"+(i+1));
//				}
//				ad.setAuthority(auth);
//				log.info("dao�鿴�ɹ�"+ad.getAdminId());
//			}
//			
//		} catch (SQLException e) {
//			log.error("error when execute sql" + sql, e);
//		}finally{
//			DButil.close(conn, ps);
//		}
//		}
//	   
//	   return ad;
//   }
//   
//   /**
//	���������ѯ���й���Ա��Ϣ����ݿ����
//	*/ 
//   
//	public List<AdminBean> getAdmin(){
//		List<AdminBean> adminList=new ArrayList<AdminBean>();
//		
//	    Connection conn = DButil.getConnection();
//	    String sql="select * from admin ";
//	    PreparedStatement ps=null;
//	    ResultSet rs=null;
//	    try {
//			ps=conn.prepareStatement(sql);
//			rs=ps.executeQuery();
//			while(rs.next()){
//				AdminBean ad=new AdminBean();
//				ad.setAdminId(rs.getInt("admin_id"));
//				ad.setUserName(rs.getString("admin_name"));
//				ad.setPwd(rs.getString("admin_pwd"));
//				ad.setAdmin_type(rs.getInt("admin_type"));
//				int [] auth=new int[5];
//				for(int i=0;i<auth.length;i++){
//					auth[i]=rs.getInt("authority"+(i+1));
//				}
//				ad.setAuthority(auth);
//				
//				adminList.add(ad);
//				
//			}
//			
//		} catch (SQLException e) {
//			log.error("error when execute sql" + sql, e);
//		}finally{
//			DButil.close(conn, ps);
//		}
//		}
//		log.info("dao getAdmin   ok");
//		return adminList;
//	}
//	
//	/**
//	���������޸Ĺ���ԱȨ�޵���ݿ����
//	@param adminId ����Աid
//	@param authority ����ԱȨ��
//	*/
//	public int updateAuthority(int[] authority,int adminId){
//		int update=0;
//		 
//	      Connection conn = DButil.getConnection();
//	       String sql="update admin set authority1=?,authority2=?,authority3=?,authority4=?,authority5=? where admin_id=?";
//	       PreparedStatement ps=null;
//	       try {
//			ps=conn.prepareStatement(sql);
//			ps.setInt(1, authority[0]);	
//			ps.setInt(2, authority[1]);	
//			ps.setInt(3, authority[2]);	
//			ps.setInt(4, authority[3]);	
//			ps.setInt(5, authority[4]);	
//			ps.setInt(6, adminId);				
//			update=ps.executeUpdate();				    	
//		} catch (SQLException e) {
//			log.error("error when execute sql" + sql, e);
//		}finally{
//			DButil.close(conn, ps);
//		}
//		}		
//		return update;	
//	}
//	
//	
//	
//	
//	
//	/**
//	�����������Ա��ѯ�û�����ݿ����
//	@param start ��ʼʱ��
//	@param end ����ʱ��
//	*/
//	public List<UserBean> searchUsers(Date start,Date end){
//		List<UserBean> userList=new ArrayList<UserBean>();
//		
//	    Connection conn = DButil.getConnection();
//	    String sql="select * from users where  user_registtime>=? and user_registtime<=?";
//	    PreparedStatement ps=null;
//	    ResultSet rs=null;
//	    try {
//			ps=conn.prepareStatement(sql);
//			ps.setDate(1, start);
//			ps.setDate(2, end);
//			rs=ps.executeQuery();
//			while(rs.next()){
//				UserBean ub=new UserBean();
//				
//				ub.setUserId(rs.getInt("user_id"));
//				ub.setUserName(rs.getString("user_username"));
//                ub.setName(rs.getString("user_realName"));
//                ub.setPwd(rs.getString("user_password"));
//                ub.setAddress(rs.getString("user_address"));
//                ub.setQuestion(rs.getString("user_question"));
//                ub.setAnswer(rs.getString("user_answer"));
//                ub.setEmail(rs.getString("user_email"));
//                ub.setIdentity(rs.getString("user_identity"));
//                ub.setPostcode(rs.getString("user_postcode"));              
//                ub.setTel(rs.getString("user_phone"));
//                ub.setCreditId(rs.getString("user_creditid"));               
//                ub.setRegistTime(rs.getDate("user_registtime"));
//               
//                userList.add(ub);
//				
//			}
//			
//		} catch (SQLException e) {
//			log.error("error when execute sql" + sql, e);
//		}finally{
//			DButil.close(conn, ps);
//		}
//		}
//		return userList;
//	}
}
