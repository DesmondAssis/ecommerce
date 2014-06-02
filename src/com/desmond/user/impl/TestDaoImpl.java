package com.desmond.user.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
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
			ps.setTimestamp(1, user.getCreateDate());
			ps.setTimestamp(2, new Timestamp(new Date().getTime()));
			
						ps.setString(3, user.getName());			ps.setString(4, user.getPassword());			ps.setString(5, user.getReallyName());			ps.setString(6, user.getIdentity());			ps.setString(7, user.getPostcode());			ps.setString(8, user.getEmail());			ps.setString(9, user.getAddress());			ps.setString(10, user.getPhone());			ps.setString(11, user.getQuestion());			ps.setString(12, user.getAnswer());			ps.setLong(13, user.getPrimaryKey());
			
			update=ps.executeUpdate();		
			log.debug(String.format("DML: s%, affect %d row.", sql, update));
		} catch (SQLException e) {
			log.error("error when update.", e);
		}finally{
			DButil.close(conn, ps);
		}
		
		return update;
	}
	
	private static Logger log = Logger.getLogger(UserDaoImpl.class.getName());
}
