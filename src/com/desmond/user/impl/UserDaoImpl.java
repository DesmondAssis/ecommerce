package com.desmond.user.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.sql.Time;

import org.apache.log4j.Logger;

import com.desmond.ecommerce.util.db.Counter;
import com.desmond.ecommerce.util.db.DButil;
import com.desmond.user.intf.User;

public class UserDaoImpl{
	
	public int add(User user) {
		int update = 0;
		Connection conn = DButil.getConnection();
		long nextPrimaryKey = Counter.getPrimaryKey(User.class.getName(), conn);
		
		PreparedStatement ps = null;
		String sql="insert into ec_user values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			ps=conn.prepareStatement(sql);
			ps.setLong(1, nextPrimaryKey);
			ps.setTime(2, new Time(new Date().getTime()));
			ps.setTime(3, new Time(new Date().getTime()));
			
			ps.setString(4, user.getName());
			ps.setString(5, user.getPassword());
			ps.setString(6, user.getReallyName());
			ps.setString(7, user.getIdentity());
			ps.setString(8, user.getPostcode());
			ps.setString(9, user.getEmail());
			ps.setString(10, user.getAddress());
			ps.setString(11, user.getPhone());
			ps.setString(12, user.getQuestion());
			ps.setString(13, user.getAnswer());
			
			update = ps.executeUpdate();
			System.out.println("count= " + update);
		} catch(SQLException e) {
			log.error("error when insert", e);
		} finally {
			DButil.close(conn, ps);
		}
		
		return update;
	}
	
	public int update(User user){
		int update=0;
		Connection conn=DButil.getConnection();
		PreparedStatement ps=null;
		String sql="update ec_user set createdDate = ?,"
				+ "modifiedDate = ?,"
				+ "name = ?,"
				+ "password = ?,"
				+ "reallyName = ?,"
				+ "identity = ?,"
				
				+ "postcode = ?," //7
				+ "email = ?,"
				+ "address = ?,"
				+ "phone = ?,"
				+ "question = ?,"
				+ "answer = ?"
				+ " where id=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setTime(1, user.getCreateDate());
			ps.setTime(2, new Time(new Date().getTime()));
			ps.setString(3, user.getName());
			ps.setString(4, user.getPassword());
			ps.setString(5, user.getReallyName());
			ps.setString(6, user.getIdentity());
			
			ps.setString(7, user.getPostcode());
			ps.setString(8, user.getEmail());		
			ps.setString(9, user.getAddress());
			ps.setString(10, user.getPhone());
			ps.setString(11, user.getQuestion());
			ps.setString(12, user.getAnswer());
			ps.setLong(13, user.getPrimaryKey());	
			
			update=ps.executeUpdate();		
			log.debug(String.format("DML: s%, affect %d row.", sql, update));
		} catch (SQLException e) {
			log.error("error when update.", e);
		}finally{
			DButil.close(conn, ps);
		}
		
		return update;
	}
	
	public User fetchByPrimaryKey(long userId){
		User user = null;
		Connection conn = DButil.getConnection();
		PreparedStatement ps = null;
		String sql = "select * from ec_user where id = ?";
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setLong(1, userId);
			rs = ps.executeQuery();
			while(rs.next()) {
				user = new UserImpl();
				user.setPrimaryKey(rs.getLong("id"));
			}
		} catch (SQLException e) {
			log.error(String.format("error when get User by Id: s%", userId), e);
		}
		
		return user;
	}
	
	public int delete(long id){
		int update=0;
		Connection conn=DButil.getConnection();
		PreparedStatement ps=null;
		String sql="delete from ec_user where id = ?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setLong(1, id);
			update=ps.executeUpdate();
		} catch (SQLException e) {
			log.error("error when delete", e);
		}finally{
			DButil.close(conn, ps);
		}
		
		return update;
	}
	
	public static void main(String[] args) {
		// insert
		User user = new UserImpl();
		user.setAddress("addr");
		user.setAnswer("answer");
		user.setEmail("test@desmond.com");
		user.setIdentity("identity");
		user.setName("test");
		user.setPassword("test");
		user.setPhone("12307");
		user.setPostcode("12344");
		user.setQuestion("question");
		user.setReallyName("really name");
		
		UserDaoImpl dao = new UserDaoImpl(); 
		dao.add(user);
		
		//User u = dao.fetchByPrimaryKey(userId);
	}
	
	private static Logger log = Logger.getLogger(UserDaoImpl.class.getName());
}
