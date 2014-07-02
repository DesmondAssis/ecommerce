package com.desmond.ec.user.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.sql.Time;

import org.apache.log4j.Logger;

import com.desmond.servicebuilder.util.db.Counter;
import com.desmond.servicebuilder.util.db.DButil;
import com.desmond.ec.user.intf.User;

public class UserDaoImpl{
	
	public int add(User user) {
		int update = 0;
		Connection conn = DButil.getConnection();
		long nextPrimaryKey = Counter.getPrimaryKey(User.class.getName(), conn);
		
		PreparedStatement ps = null;
		String sql = "INSERT INTO ec_user VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			ps=conn.prepareStatement(sql);
			ps.setLong(1, nextPrimaryKey);
			ps.setTimestamp(2, new Timestamp(new Date().getTime()));
			ps.setTimestamp(3, new Timestamp(new Date().getTime()));
						ps.setString(4, user.getName());			ps.setString(5, user.getPassword());			ps.setString(6, user.getReallyName());			ps.setString(7, user.getIdentity());			ps.setString(8, user.getPostcode());			ps.setString(9, user.getEmail());			ps.setString(10, user.getAddress());			ps.setString(11, user.getPhone());			ps.setString(12, user.getQuestion());			ps.setString(13, user.getAnswer());
			
			update = ps.executeUpdate();
			log.debug("count= " + update);
		} catch(SQLException e) {
			log.error("error when insert", e);
		} finally {
			DButil.close(conn, ps);
		}
		
		return update;
	}
	
	public int update(User user){
		int update=0;
		Connection conn = DButil.getConnection();
		PreparedStatement ps=null;
		String sql = "UPDATE ec_user set createdDate = ?, modifiedDate = ?,"				+ "name = ?,"				+ "password = ?,"				+ "reallyName = ?,"				+ "identity = ?,"				+ "postcode = ?,"				+ "email = ?,"				+ "address = ?,"				+ "phone = ?,"				+ "question = ?,"				+ "answer = ?" 				+" where id = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setTimestamp(1, user.getCreatedDate());
			ps.setTimestamp(2, new Timestamp(new Date().getTime()));
						ps.setString(3, user.getName());			ps.setString(4, user.getPassword());			ps.setString(5, user.getReallyName());			ps.setString(6, user.getIdentity());			ps.setString(7, user.getPostcode());			ps.setString(8, user.getEmail());			ps.setString(9, user.getAddress());			ps.setString(10, user.getPhone());			ps.setString(11, user.getQuestion());			ps.setString(12, user.getAnswer());			ps.setLong(13, user.getPrimaryKey());
			
			update=ps.executeUpdate();		
			log.debug("DML:" + sql + " affect " + sql + " row.");
		} catch (SQLException e) {
			log.error("error when update.", e);
		}finally{
			DButil.close(conn, ps);
		}
		
		return update;
	}
	
	public User fetchByPrimaryKey(long primaryKey){
		User user = null;
		Connection conn = DButil.getConnection();
		PreparedStatement ps = null;
		String sql = "SELECT * FROM ec_user WHERE id = ?";
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setLong(1, primaryKey);
			rs = ps.executeQuery();
			while(rs.next()) {
				user = new UserImpl();
								user.setPrimaryKey(rs.getLong(1));				user.setCreatedDate(rs.getTimestamp(2));				user.setModifiedDate(rs.getTimestamp(3));				user.setName(rs.getString(4));				user.setPassword(rs.getString(5));				user.setReallyName(rs.getString(6));				user.setIdentity(rs.getString(7));				user.setPostcode(rs.getString(8));				user.setEmail(rs.getString(9));				user.setAddress(rs.getString(10));				user.setPhone(rs.getString(11));				user.setQuestion(rs.getString(12));				user.setAnswer(rs.getString(13));
			}
		} catch (SQLException e) {
			log.error("error when get ${User} by primaryKey: " + primaryKey, e);
		}
		
		return user;
	}
	
	public java.util.List<User> findByNamePwd(String name, String password){
		java.util.List<User> users = new java.util.ArrayList<User>();
		Connection conn = DButil.getConnection();
		PreparedStatement ps = null;
		String sql = "SELECT * FROM ec_user WHERE name = ? and password = ?";
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);			ps.setString(2, password);
			rs = ps.executeQuery();
			while(rs.next()) {
				User user = new UserImpl();
								user.setPrimaryKey(rs.getLong(1));				user.setCreatedDate(rs.getTimestamp(2));				user.setModifiedDate(rs.getTimestamp(3));				user.setName(rs.getString(4));				user.setPassword(rs.getString(5));				user.setReallyName(rs.getString(6));				user.setIdentity(rs.getString(7));				user.setPostcode(rs.getString(8));				user.setEmail(rs.getString(9));				user.setAddress(rs.getString(10));				user.setPhone(rs.getString(11));				user.setQuestion(rs.getString(12));				user.setAnswer(rs.getString(13));
				
				users.add(user);
			}
		} catch (SQLException e) {
			log.error("error when get ${User} by String name, String password ", e);
		}
		
		return users;
}
	
	public int delete(long primaryKey){
		int update = 0;
		Connection conn = DButil.getConnection();
		PreparedStatement ps = null;
		String sql = "DELETE FROM ec_user WHERE id = ?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setLong(1, primaryKey);
			update = ps.executeUpdate();
		} catch (SQLException e) {
			log.error("error when delete", e);
		}finally{
			DButil.close(conn, ps);
		}
		
		return update;
	}
	
	private static Logger log = Logger.getLogger(UserDaoImpl.class.getName());
}
