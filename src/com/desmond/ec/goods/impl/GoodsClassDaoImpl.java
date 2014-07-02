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
import com.desmond.ec.goods.intf.GoodsClass;

public class GoodsClassDaoImpl{
	
	public int add(GoodsClass goodsClass) {
		int update = 0;
		Connection conn = DButil.getConnection();
		long nextPrimaryKey = Counter.getPrimaryKey(GoodsClass.class.getName(), conn);
		
		PreparedStatement ps = null;
		String sql = "INSERT INTO ec_GoodsClass VALUES(?, ?, ?, ?, ?)";
		try {
			ps=conn.prepareStatement(sql);
			ps.setLong(1, nextPrimaryKey);
			ps.setTimestamp(2, new Timestamp(new Date().getTime()));
			ps.setTimestamp(3, new Timestamp(new Date().getTime()));
						ps.setString(4, goodsClass.getName());			ps.setLong(5, goodsClass.getParentClass());
			
			update = ps.executeUpdate();
			log.debug("count= " + update);
		} catch(SQLException e) {
			log.error("error when insert", e);
		} finally {
			DButil.close(conn, ps);
		}
		
		return update;
	}
	
	public int update(GoodsClass goodsClass){
		int update=0;
		Connection conn = DButil.getConnection();
		PreparedStatement ps=null;
		String sql = "UPDATE ec_GoodsClass set createdDate = ?, modifiedDate = ?,"				+ "name = ?,"				+ "parentClass = ?" 				+" where id = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setTimestamp(1, goodsClass.getCreatedDate());
			ps.setTimestamp(2, new Timestamp(new Date().getTime()));
						ps.setString(3, goodsClass.getName());			ps.setLong(4, goodsClass.getParentClass());			ps.setLong(5, goodsClass.getPrimaryKey());
			
			update=ps.executeUpdate();		
			log.debug("DML:" + sql + " affect " + sql + " row.");
		} catch (SQLException e) {
			log.error("error when update.", e);
		}finally{
			DButil.close(conn, ps);
		}
		
		return update;
	}
	
	public GoodsClass fetchByPrimaryKey(long primaryKey){
		GoodsClass goodsClass = null;
		Connection conn = DButil.getConnection();
		PreparedStatement ps = null;
		String sql = "SELECT * FROM ec_GoodsClass WHERE id = ?";
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setLong(1, primaryKey);
			rs = ps.executeQuery();
			while(rs.next()) {
				goodsClass = new GoodsClassImpl();
								goodsClass.setPrimaryKey(rs.getLong(1));				goodsClass.setCreatedDate(rs.getTimestamp(2));				goodsClass.setModifiedDate(rs.getTimestamp(3));				goodsClass.setName(rs.getString(4));				goodsClass.setParentClass(rs.getLong(5));
			}
		} catch (SQLException e) {
			log.error("error when get ${User} by primaryKey: " + primaryKey, e);
		}
		
		return goodsClass;
	}
	
	
	
	public int delete(long primaryKey){
		int update = 0;
		Connection conn = DButil.getConnection();
		PreparedStatement ps = null;
		String sql = "DELETE FROM ec_GoodsClass WHERE id = ?";
		
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
	
	private static Logger log = Logger.getLogger(GoodsClassDaoImpl.class.getName());
}
