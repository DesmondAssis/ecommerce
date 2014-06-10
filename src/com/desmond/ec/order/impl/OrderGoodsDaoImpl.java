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
import com.desmond.ec.order.intf.OrderGoods;

public class OrderGoodsDaoImpl{
	
	public int add(OrderGoods orderGoods) {
		int update = 0;
		Connection conn = DButil.getConnection();
		long nextPrimaryKey = Counter.getPrimaryKey(OrderGoods.class.getName(), conn);
		
		PreparedStatement ps = null;
		String sql = "INSERT INTO ec_OrderGoods VALUES(?, ?, ?, ?, ?, ?, ?)";
		try {
			ps=conn.prepareStatement(sql);
			ps.setLong(1, nextPrimaryKey);
			ps.setTimestamp(2, new Timestamp(new Date().getTime()));
			ps.setTimestamp(3, new Timestamp(new Date().getTime()));
						ps.setLong(4, orderGoods.getOrderId());			ps.setLong(5, orderGoods.getOrderGoodId());			ps.setInt(6, orderGoods.getOrderGoodNum());			ps.setDouble(7, orderGoods.getOrderGoodPrice());
			
			update = ps.executeUpdate();
			log.debug("count= " + update);
		} catch(SQLException e) {
			log.error("error when insert", e);
		} finally {
			DButil.close(conn, ps);
		}
		
		return update;
	}
	
	public int update(OrderGoods orderGoods){
		int update=0;
		Connection conn = DButil.getConnection();
		PreparedStatement ps=null;
		String sql = "UPDATE ec_OrderGoods set createdDate = ?, modifiedDate = ?,"				+ "orderId = ?,"				+ "orderGoodId = ?,"				+ "orderGoodNum = ?,"				+ "orderGoodPrice = ?" 				+" where id = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setTimestamp(1, orderGoods.getCreatedDate());
			ps.setTimestamp(2, new Timestamp(new Date().getTime()));
						ps.setLong(3, orderGoods.getOrderId());			ps.setLong(4, orderGoods.getOrderGoodId());			ps.setInt(5, orderGoods.getOrderGoodNum());			ps.setDouble(6, orderGoods.getOrderGoodPrice());			ps.setLong(7, orderGoods.getPrimaryKey());
			
			update=ps.executeUpdate();		
			log.debug("DML:" + sql + " affect " + sql + " row.");
		} catch (SQLException e) {
			log.error("error when update.", e);
		}finally{
			DButil.close(conn, ps);
		}
		
		return update;
	}
	
	public OrderGoods fetchByPrimaryKey(long primaryKey){
		OrderGoods orderGoods = null;
		Connection conn = DButil.getConnection();
		PreparedStatement ps = null;
		String sql = "SELECT * FROM ec_OrderGoods WHERE id = ?";
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setLong(1, primaryKey);
			rs = ps.executeQuery();
			while(rs.next()) {
				orderGoods = new OrderGoodsImpl();
								orderGoods.setPrimaryKey(rs.getLong(1));				orderGoods.setCreatedDate(rs.getTimestamp(2));				orderGoods.setModifiedDate(rs.getTimestamp(3));				orderGoods.setOrderId(rs.getLong(4));				orderGoods.setOrderGoodId(rs.getLong(5));				orderGoods.setOrderGoodNum(rs.getInt(6));				orderGoods.setOrderGoodPrice(rs.getDouble(7));
			}
		} catch (SQLException e) {
			log.error("error when get ${User} by primaryKey: " + primaryKey, e);
		}
		
		return orderGoods;
	}
	
	public int delete(long primaryKey){
		int update = 0;
		Connection conn = DButil.getConnection();
		PreparedStatement ps = null;
		String sql = "DELETE FROM ec_OrderGoods WHERE id = ?";
		
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
	
	private static Logger log = Logger.getLogger(OrderGoodsDaoImpl.class.getName());
}
