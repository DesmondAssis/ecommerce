package com.desmond.ecommerce.impl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

import org.apache.log4j.Logger;

import com.desmond.ecommerce.impl.model.UserModelImpl;
import com.desmond.ecommerce.service.model.UserModel;
import com.desmond.ecommerce.util.DButil;

public class UserDaoImpl {
	
	public int regist(UserModel user) {
		int update = 0;
		Connection conn = DButil.getConnection();
		PreparedStatement ps = null;
		String sql="insert into ec_user values(?,?,?,?,?,?,?,?,?,?,?,?)";
		ResultSet rs = null;
		try {
			ps=conn.prepareStatement(sql);
			ps.setLong(1,1);
			ps.setString(2, user.getName());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getReallyName());
			ps.setString(5, user.getIdentity());
			ps.setString(6, user.getPostcode());
			ps.setString(7, user.getEmail());
			ps.setString(8, user.getAddress());
			ps.setString(9, user.getPhone());
			ps.setString(10, user.getQuestion());
			ps.setString(11, user.getAnswer());
			ps.setDate(12, user.getRegistDate());
			
			update = ps.executeUpdate();
			System.out.println("count= " + update);
		} catch(SQLException e) {
			logger.error(e);
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(ps != null) {
					ps.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
			DButil.close();
		}
		
		
		
		return update;
	}
	
//	public UserModel login(String username, String pwd){
//		UserModel user = null;
//		Connection conn=DButil.getConnection();
//		PreparedStatement ps=null;
//		String sql="select *  from ec_user where name=? and password=?";
//		ResultSet rs=null;
//		try {
//			ps=conn.prepareStatement(sql);
//			ps.setString(1, username);
//			ps.setString(2, pwd);
//			rs=ps.executeQuery();
//			if(rs.next()){
//				user = new UserModelImpl(
//						rs.getLong(1),
//						rs.getString("name"),
//						rs.getString("password"),
//						rs.getString("reallyName"),
//						rs.getString("identity"),
//						rs.getString("postcode"),
//						rs.getString("email"),
//						rs.getString("address"),
//						rs.getString("phone"),
//						rs.getString("question"),
//						rs.getString("answer"),
//						rs.getDate("registDate"),
//						null, null);
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}finally{
//			DButil.close(conn, ps, rs);
//		}
//		
//		return user;
//	}
//	/**
//	���������޸��û���Ϣ������
//	@param user ����洢ע����Ϣ��UserBean
//	@return UserBean �޸ĳɹ�����һ�����µ�UserBean����ʧ�ܷ���null
//	
//	public int update(UserModel ub){
//		int update=0;
//		Connection conn=DButil.getConnection();
//		PreparedStatement ps=null;
//		String sql="update users set user_username=?,user_password=?,user_realName=?,user_identity=?,user_creditId=?,user_postcode=?,user_email=?,user_address=?,user _phone=?,user_question=?,user_answer=? where user_id=?";
//		ResultSet rs=null;
//		try {
//			ps=conn.prepareStatement(sql);
//			ps.setString(1, ub.getUserName());
//			ps.setString(2, ub.getPwd());
//			ps.setString(3, ub.getName());
//			ps.setString(4, ub.getIdentity());
//			ps.setString(5, ub.getCreditId());
//			ps.setString(6, ub.getPostcode());
//			ps.setString(7, ub.getEmail());		
//			ps.setString(8, ub.getAddress());
//			ps.setString(9, ub.getTel());
//			ps.setString(10, ub.getQuestion());
//			ps.setString(11, ub.getAnswer());		
//			ps.setInt(12, ub.getUserId());		
//			update=ps.executeUpdate();		
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally{
//			try {
//				if(ps!=null){
//					ps.close();
//				}
//				if(conn!=null){
//					conn.close();
//				}
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			DButil.close();
//		}
//		return update;
//	}
//	/**
//	���������޸����������
//	@param pwd ����������
//	@return UserBean �޸ĳɹ�����һ�����µ�UserBean����ʧ�ܷ���null
//	*/	
//	public int modifyPwd(int userId,String newPwd){
//		int update=0;
//		Connection conn=DButil.getConnection();
//		PreparedStatement ps=null;
//		String sql="update users set user_password=? where user_id=?";
//		try {
//			ps=conn.prepareStatement(sql);
//			ps.setString(1,newPwd);
//			ps.setInt(2,userId);			
//			update=ps.executeUpdate();				
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally{
//			try {
//				if(ps!=null){
//					ps.close();
//				}
//				if(conn!=null){
//					conn.close();
//				}
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			DButil.close();
//		}
//		return update;
//	}
//	/**
//	���������һ��������������
//	@param userName �����û���
//	@param anwser ����������ʾ�����
//	@param newPwd ����������
//	*/	
//	public int getPwd(String userName,String answer,String newPwd){
//		int update=0;
//		Connection conn=DButil.getConnection();
//		PreparedStatement ps=null;
//		ResultSet rs=null;
//		String sql="select user_answer where user_username=?";	
//		String sql2="update users set user_password=? where user_username=?";
//		String user_answser="";
//		try {
//			ps=conn.prepareStatement(sql);
//			ps.setString(1,userName);
//			rs=ps.executeQuery();
//			if(rs.next()){
//				if(answer.equals(rs.getString("user_answer")));
//				ps=conn.prepareStatement(sql2);
//				ps.setString(1,newPwd);
//				ps.setString(2,userName);
//				update=ps.executeUpdate();	
//			}
//						
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally{
//			try {
//				if(rs!=null){
//					rs.close();
//				}
//				if(ps!=null){
//					ps.close();
//				}
//				if(conn!=null){
//					conn.close();
//				}
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			DButil.close();
//		}
//		return update;
//	}
//	*/
	
	static Logger logger = Logger.getLogger(UserDaoImpl.class.getName());
	
	public static void main(String[] args) {
		UserModel user = new UserModelImpl(1, "desmond", "test", "Li",
				"43042822324", "12345", "desmond@desmond.com", "Shanghai",
				"13120547998", "what's your girl friend's name?", "Alina", new Date(new java.util.Date().getTime()),
				"cId", "tel");
		logger.error("sss");
		new UserDaoImpl().regist(user);
	}
}
