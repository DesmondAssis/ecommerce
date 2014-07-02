package com.desmond.ec.order.impl;

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
import com.desmond.ec.order.intf.OrderHistory;

public class OrderHistoryDaoImpl{
	
	public int add(OrderHistory orderHistory) {
		int update = 0;
		Connection conn = DButil.getConnection();
		long nextPrimaryKey = Counter.getPrimaryKey(OrderHistory.class.getName(), conn);
		
		PreparedStatement ps = null;
		String sql = "INSERT INTO ec_OrderHistory VALUES(?, ?, ?, ?, ?, ?)";
		try {
			ps=conn.prepareStatement(sql);
			ps.setLong(1, nextPrimaryKey);
			ps.setTimestamp(2, new Timestamp(new Date().getTime()));
			ps.setTimestamp(3, new Timestamp(new Date().getTime()));
						ps.setLong(4, orderHistory.getOrderId());			ps.setString(5, orderHistory.getModifiedReason());			ps.setLong(6, orderHistory.getUserId());
			
			update = ps.executeUpdate();
			log.debug("count= " + update);
		} catch(SQLException e) {
			log.error("error when insert", e);
		} finally {
			DButil.close(conn, ps);
		}
		
		return update;
	}
	
	public int update(OrderHistory orderHistory){
		int update=0;
		Connection conn = DButil.getConnection();
		PreparedStatement ps=null;
		String sql = "UPDATE ec_OrderHistory set createdDate = ?, modifiedDate = ?,"				+ "orderId = ?,"				+ "modifiedReason = ?,"				+ "userId = ?" 				+" where id = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setTimestamp(1, orderHistory.getCreatedDate());
			ps.setTimestamp(2, new Timestamp(new Date().getTime()));
						ps.setLong(3, orderHistory.getOrderId());			ps.setString(4, orderHistory.getModifiedReason());			ps.setLong(5, orderHistory.getUserId());			ps.setLong(6, orderHistory.getPrimaryKey());
			
			update=ps.executeUpdate();		
			log.debug("DML:" + sql + " affect " + sql + " row.");
		} catch (SQLException e) {
			log.error("error when update.", e);
		}finally{
			DButil.close(conn, ps);
		}
		
		return update;
	}
	
	public OrderHistory fetchByPrimaryKey(long primaryKey){
		OrderHistory orderHistory = null;
		Connection conn = DButil.getConnection();
		PreparedStatement ps = null;
		String sql = "SELECT * FROM ec_OrderHistory WHERE id = ?";
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setLong(1, primaryKey);
			rs = ps.executeQuery();
			while(rs.next()) {
				orderHistory = new OrderHistoryImpl();
								orderHistory.setPrimaryKey(rs.getLong(1));				orderHistory.setCreatedDate(rs.getTimestamp(2));				orderHistory.setModifiedDate(rs.getTimestamp(3));				orderHistory.setOrderId(rs.getLong(4));				orderHistory.setModifiedReason(rs.getString(5));				orderHistory.setUserId(rs.getLong(6));
			}
		} catch (SQLException e) {
			log.error("error when get ${User} by primaryKey: " + primaryKey, e);
		}
		
		return orderHistory;
	}
	
	
	
	public int delete(long primaryKey){
		int update = 0;
		Connection conn = DButil.getConnection();
		PreparedStatement ps = null;
		String sql = "DELETE FROM ec_OrderHistory WHERE id = ?";
		
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
	
	private static Logger log = Logger.getLogger(OrderHistoryDaoImpl.class.getName());
}
