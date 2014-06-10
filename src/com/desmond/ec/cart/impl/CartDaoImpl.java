package com.desmond.ec.cart.impl;

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
import com.desmond.ec.cart.intf.Cart;

public class CartDaoImpl{
	
	public int add(Cart cart) {
		int update = 0;
		Connection conn = DButil.getConnection();
		long nextPrimaryKey = Counter.getPrimaryKey(Cart.class.getName(), conn);
		
		PreparedStatement ps = null;
		String sql = "INSERT INTO ec_Cart VALUES(?, ?, ?, ?, ?, ?, ?)";
		try {
			ps=conn.prepareStatement(sql);
			ps.setLong(1, nextPrimaryKey);
			ps.setTimestamp(2, new Timestamp(new Date().getTime()));
			ps.setTimestamp(3, new Timestamp(new Date().getTime()));
						ps.setString(4, cart.getSessionId());			ps.setLong(5, cart.getGoodId());			ps.setInt(6, cart.getGoodNum());			ps.setLong(7, cart.getUserId());
			
			update = ps.executeUpdate();
			log.debug("count= " + update);
		} catch(SQLException e) {
			log.error("error when insert", e);
		} finally {
			DButil.close(conn, ps);
		}
		
		return update;
	}
	
	public int update(Cart cart){
		int update=0;
		Connection conn = DButil.getConnection();
		PreparedStatement ps=null;
		String sql = "UPDATE ec_Cart set createdDate = ?, modifiedDate = ?,"				+ "sessionId = ?,"				+ "goodId = ?,"				+ "goodNum = ?,"				+ "userId = ?" 				+" where id = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setTimestamp(1, cart.getCreatedDate());
			ps.setTimestamp(2, new Timestamp(new Date().getTime()));
						ps.setString(3, cart.getSessionId());			ps.setLong(4, cart.getGoodId());			ps.setInt(5, cart.getGoodNum());			ps.setLong(6, cart.getUserId());			ps.setLong(7, cart.getPrimaryKey());
			
			update=ps.executeUpdate();		
			log.debug("DML:" + sql + " affect " + sql + " row.");
		} catch (SQLException e) {
			log.error("error when update.", e);
		}finally{
			DButil.close(conn, ps);
		}
		
		return update;
	}
	
	public Cart fetchByPrimaryKey(long primaryKey){
		Cart cart = null;
		Connection conn = DButil.getConnection();
		PreparedStatement ps = null;
		String sql = "SELECT * FROM ec_Cart WHERE id = ?";
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setLong(1, primaryKey);
			rs = ps.executeQuery();
			while(rs.next()) {
				cart = new CartImpl();
								cart.setPrimaryKey(rs.getLong(1));				cart.setCreatedDate(rs.getTimestamp(2));				cart.setModifiedDate(rs.getTimestamp(3));				cart.setSessionId(rs.getString(4));				cart.setGoodId(rs.getLong(5));				cart.setGoodNum(rs.getInt(6));				cart.setUserId(rs.getLong(7));
			}
		} catch (SQLException e) {
			log.error("error when get ${User} by primaryKey: " + primaryKey, e);
		}
		
		return cart;
	}
	
	public int delete(long primaryKey){
		int update = 0;
		Connection conn = DButil.getConnection();
		PreparedStatement ps = null;
		String sql = "DELETE FROM ec_Cart WHERE id = ?";
		
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
	
	private static Logger log = Logger.getLogger(CartDaoImpl.class.getName());
}
