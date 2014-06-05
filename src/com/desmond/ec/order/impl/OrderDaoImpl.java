package com.desmond.ec.order.impl;

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
import com.desmond.ec.order.intf.Order;

public class OrderDaoImpl{
	
	public int add(Order order) {
		int update = 0;
		Connection conn = DButil.getConnection();
		long nextPrimaryKey = Counter.getPrimaryKey(Order.class.getName(), conn);
		
		PreparedStatement ps = null;
		String sql = "INSERT INTO ec_order VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			ps=conn.prepareStatement(sql);
			ps.setLong(1, nextPrimaryKey);
			ps.setTimestamp(2, new Timestamp(new Date().getTime()));
			ps.setTimestamp(3, new Timestamp(new Date().getTime()));
						ps.setInt(4, order.getStatus());			ps.setLong(5, order.getUserId());			ps.setString(6, order.getName());			ps.setString(7, order.getAddress());			ps.setString(8, order.getPostCode());			ps.setString(9, order.getTelephone());			ps.setString(10, order.getPhone());			ps.setInt(11, order.getPost());			ps.setString(12, order.getPay());			ps.setString(13, order.getNotes());
			
			update = ps.executeUpdate();
			log.debug("count= " + update);
		} catch(SQLException e) {
			log.error("error when insert", e);
		} finally {
			DButil.close(conn, ps);
		}
		
		return update;
	}
	
	public int update(Order order){
		int update=0;
		Connection conn = DButil.getConnection();
		PreparedStatement ps=null;
		String sql = "UPDATE ec_order set createdDate = ?, modifiedDate = ?,"				+ "status = ?,"				+ "userId = ?,"				+ "name = ?,"				+ "address = ?,"				+ "postCode = ?,"				+ "telephone = ?,"				+ "phone = ?,"				+ "post = ?,"				+ "pay = ?,"				+ "notes = ?" 				+" where id = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setTimestamp(1, order.getCreatedDate());
			ps.setTimestamp(2, new Timestamp(new Date().getTime()));
						ps.setInt(3, order.getStatus());			ps.setLong(4, order.getUserId());			ps.setString(5, order.getName());			ps.setString(6, order.getAddress());			ps.setString(7, order.getPostCode());			ps.setString(8, order.getTelephone());			ps.setString(9, order.getPhone());			ps.setInt(10, order.getPost());			ps.setString(11, order.getPay());			ps.setString(12, order.getNotes());			ps.setLong(13, order.getPrimaryKey());
			
			update=ps.executeUpdate();		
			log.debug("DML:" + sql + " affect " + sql + " row.");
		} catch (SQLException e) {
			log.error("error when update.", e);
		}finally{
			DButil.close(conn, ps);
		}
		
		return update;
	}
	
	public Order fetchByPrimaryKey(long primaryKey){
		Order order = null;
		Connection conn = DButil.getConnection();
		PreparedStatement ps = null;
		String sql = "SELECT * FROM ec_order WHERE id = ?";
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setLong(1, primaryKey);
			rs = ps.executeQuery();
			while(rs.next()) {
				order = new OrderImpl();
								order.setPrimaryKey(rs.getLong(1));				order.setCreatedDate(rs.getTimestamp(2));				order.setModifiedDate(rs.getTimestamp(3));				order.setStatus(rs.getInt(4));				order.setUserId(rs.getLong(5));				order.setName(rs.getString(6));				order.setAddress(rs.getString(7));				order.setPostCode(rs.getString(8));				order.setTelephone(rs.getString(9));				order.setPhone(rs.getString(10));				order.setPost(rs.getInt(11));				order.setPay(rs.getString(12));				order.setNotes(rs.getString(13));
			}
		} catch (SQLException e) {
			log.error("error when get ${User} by primaryKey: " + primaryKey, e);
		}
		
		return order;
	}
	
	public int delete(long primaryKey){
		int update = 0;
		Connection conn = DButil.getConnection();
		PreparedStatement ps = null;
		String sql = "DELETE FROM ec_order WHERE id = ?";
		
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
	
	private static Logger log = Logger.getLogger(OrderDaoImpl.class.getName());
}
