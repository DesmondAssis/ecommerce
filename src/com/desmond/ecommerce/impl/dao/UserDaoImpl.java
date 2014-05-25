package com.desmond.ecommerce.impl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

import org.apache.log4j.Logger;

import com.desmond.ecommerce.impl.model.UserModelImpl;
import com.desmond.ecommerce.interf.dao.UserDao;
import com.desmond.ecommerce.interf.model.UserModel;
import com.desmond.ecommerce.util.db.Counter;
import com.desmond.ecommerce.util.db.DButil;
import com.desmond.user.User;

public class UserDaoImpl{
	
	public int add(UserModel user) {
		int update = 0;
		Connection conn = DButil.getConnection();
		long nextPrimaryKey = Counter.getPrimaryKey(User.class.getName(), conn);
		
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
	
	public int update(UserModel ub){
		int update=0;
		Connection conn=DButil.getConnection();
		PreparedStatement ps=null;
		String sql="update ec_user set name=?,"
				+ "password=?,"
				+ "reallyName=?,"
				+ "identity=?,"
				+ "postcode=?,"
				+ "email=?,"
				+ "address=?,"
				+ "phone=?,"
				+ "question=?,"
				+ "answer=?,"
				+ "registTime=?"
				+ " where user_id=?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, ub.getName());
			ps.setString(2, ub.getPassword());
			ps.setString(3, ub.getReallyName());
			ps.setString(4, ub.getIdentity());
			
			ps.setString(5, ub.getPostcode());
			ps.setString(6, ub.getEmail());		
			ps.setString(7, ub.getAddress());
			ps.setString(8, ub.getPhone());
			ps.setString(9, ub.getQuestion());
			ps.setString(10, ub.getAnswer());
			ps.setDate(11, ub.getRegistDate());
			ps.setLong(12, ub.getPrimaryKey());	
			
			update=ps.executeUpdate();		
			logger.debug(String.format("DML: s%, affect %d row.", sql, update));
		} catch (SQLException e) {
			logger.error(e);
		}finally{
			DButil.close(conn, ps);
		}
		
		return update;
	}
	
	public int fetchByPrimaryKey(UserModel ub){
		int update=0;
		Connection conn=DButil.getConnection();
		PreparedStatement ps=null;
		String sql="update ec_user set name=?,"
				+ "password=?,"
				+ "reallyName=?,"
				+ "identity=?,"
				+ "postcode=?,"
				+ "email=?,"
				+ "address=?,"
				+ "phone=?,"
				+ "question=?,"
				+ "answer=?,"
				+ "registTime=?"
				+ " where user_id=?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, ub.getName());
			ps.setString(2, ub.getPassword());
			ps.setString(3, ub.getReallyName());
			ps.setString(4, ub.getIdentity());
			
			ps.setString(5, ub.getPostcode());
			ps.setString(6, ub.getEmail());		
			ps.setString(7, ub.getAddress());
			ps.setString(8, ub.getPhone());
			ps.setString(9, ub.getQuestion());
			ps.setString(10, ub.getAnswer());
			ps.setDate(11, ub.getRegistDate());
			ps.setLong(12, ub.getPrimaryKey());	
			
			update=ps.executeUpdate();		
			logger.debug(String.format("DML: s%, affect %d row.", sql, update));
		} catch (SQLException e) {
			logger.error(e);
		}finally{
			DButil.close(conn, ps);
		}
		
		return update;
	}
	
	public int delete(UserModel ub){
		int update=0;
		Connection conn=DButil.getConnection();
		PreparedStatement ps=null;
		String sql="update ec_user set name=?,"
				+ "password=?,"
				+ "reallyName=?,"
				+ "identity=?,"
				+ "postcode=?,"
				+ "email=?,"
				+ "address=?,"
				+ "phone=?,"
				+ "question=?,"
				+ "answer=?,"
				+ "registTime=?"
				+ " where user_id=?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, ub.getName());
			ps.setString(2, ub.getPassword());
			ps.setString(3, ub.getReallyName());
			ps.setString(4, ub.getIdentity());
			
			ps.setString(5, ub.getPostcode());
			ps.setString(6, ub.getEmail());		
			ps.setString(7, ub.getAddress());
			ps.setString(8, ub.getPhone());
			ps.setString(9, ub.getQuestion());
			ps.setString(10, ub.getAnswer());
			ps.setDate(11, ub.getRegistDate());
			ps.setLong(12, ub.getPrimaryKey());	
			
			update=ps.executeUpdate();		
			logger.debug(String.format("DML: s%, affect %d row.", sql, update));
		} catch (SQLException e) {
			logger.error(e);
		}finally{
			DButil.close(conn, ps);
		}
		
		return update;
	}
	
}
