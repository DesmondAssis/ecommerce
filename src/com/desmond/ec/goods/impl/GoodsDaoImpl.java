package com.desmond.ec.goods.impl;

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
import com.desmond.ec.goods.intf.Goods;

public class GoodsDaoImpl{
	
	public int add(Goods goods) {
		int update = 0;
		Connection conn = DButil.getConnection();
		long nextPrimaryKey = Counter.getPrimaryKey(Goods.class.getName(), conn);
		
		PreparedStatement ps = null;
		String sql = "INSERT INTO ec_Goods VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			ps=conn.prepareStatement(sql);
			ps.setLong(1, nextPrimaryKey);
			ps.setTimestamp(2, new Timestamp(new Date().getTime()));
			ps.setTimestamp(3, new Timestamp(new Date().getTime()));
						ps.setLong(4, goods.getName());			ps.setString(5, goods.getMainClass());			ps.setString(6, goods.getSubClass());			ps.setDouble(7, goods.getPrice());			ps.setInt(8, goods.getRemain());			ps.setString(9, goods.getImage());			ps.setString(10, goods.getUnit());			ps.setBoolean(11, goods.getIsRecommend());
			
			update = ps.executeUpdate();
			log.debug("count= " + update);
		} catch(SQLException e) {
			log.error("error when insert", e);
		} finally {
			DButil.close(conn, ps);
		}
		
		return update;
	}
	
	public int update(Goods goods){
		int update=0;
		Connection conn = DButil.getConnection();
		PreparedStatement ps=null;
		String sql = "UPDATE ec_Goods set createdDate = ?, modifiedDate = ?,"				+ "name = ?,"				+ "mainClass = ?,"				+ "subClass = ?,"				+ "price = ?,"				+ "remain = ?,"				+ "image = ?,"				+ "unit = ?,"				+ "isRecommend = ?" 				+" where id = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setTimestamp(1, goods.getCreatedDate());
			ps.setTimestamp(2, new Timestamp(new Date().getTime()));
						ps.setLong(3, goods.getName());			ps.setString(4, goods.getMainClass());			ps.setString(5, goods.getSubClass());			ps.setDouble(6, goods.getPrice());			ps.setInt(7, goods.getRemain());			ps.setString(8, goods.getImage());			ps.setString(9, goods.getUnit());			ps.setBoolean(10, goods.getIsRecommend());			ps.setLong(11, goods.getPrimaryKey());
			
			update=ps.executeUpdate();		
			log.debug("DML:" + sql + " affect " + sql + " row.");
		} catch (SQLException e) {
			log.error("error when update.", e);
		}finally{
			DButil.close(conn, ps);
		}
		
		return update;
	}
	
	public Goods fetchByPrimaryKey(long primaryKey){
		Goods goods = null;
		Connection conn = DButil.getConnection();
		PreparedStatement ps = null;
		String sql = "SELECT * FROM ec_Goods WHERE id = ?";
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setLong(1, primaryKey);
			rs = ps.executeQuery();
			while(rs.next()) {
				goods = new GoodsImpl();
								goods.setPrimaryKey(rs.getLong(1));				goods.setCreatedDate(rs.getTimestamp(2));				goods.setModifiedDate(rs.getTimestamp(3));				goods.setName(rs.getLong(4));				goods.setMainClass(rs.getString(5));				goods.setSubClass(rs.getString(6));				goods.setPrice(rs.getDouble(7));				goods.setRemain(rs.getInt(8));				goods.setImage(rs.getString(9));				goods.setUnit(rs.getString(10));				goods.setIsRecommend(rs.getBoolean(11));
			}
		} catch (SQLException e) {
			log.error("error when get ${User} by primaryKey: " + primaryKey, e);
		}
		
		return goods;
	}
	
	
	
	public int delete(long primaryKey){
		int update = 0;
		Connection conn = DButil.getConnection();
		PreparedStatement ps = null;
		String sql = "DELETE FROM ec_Goods WHERE id = ?";
		
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
	
	private static Logger log = Logger.getLogger(GoodsDaoImpl.class.getName());
}
