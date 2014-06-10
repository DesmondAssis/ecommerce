package com.desmond.ec.sale.impl;

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
import com.desmond.ec.sale.intf.SaleStatics;

public class SaleStaticsDaoImpl{
	
	public int add(SaleStatics saleStatics) {
		int update = 0;
		Connection conn = DButil.getConnection();
		long nextPrimaryKey = Counter.getPrimaryKey(SaleStatics.class.getName(), conn);
		
		PreparedStatement ps = null;
		String sql = "INSERT INTO ec_SaleStatics VALUES(?, ?, ?, ?, ?, ?, ?)";
		try {
			ps=conn.prepareStatement(sql);
			ps.setLong(1, nextPrimaryKey);
			ps.setTimestamp(2, new Timestamp(new Date().getTime()));
			ps.setTimestamp(3, new Timestamp(new Date().getTime()));
						ps.setLong(4, saleStatics.getGoodId());			ps.setLong(5, saleStatics.getGoodsClass());			ps.setInt(6, saleStatics.getSaleNumber());			ps.setInt(7, saleStatics.getSaleNumAmount());
			
			update = ps.executeUpdate();
			log.debug("count= " + update);
		} catch(SQLException e) {
			log.error("error when insert", e);
		} finally {
			DButil.close(conn, ps);
		}
		
		return update;
	}
	
	public int update(SaleStatics saleStatics){
		int update=0;
		Connection conn = DButil.getConnection();
		PreparedStatement ps=null;
		String sql = "UPDATE ec_SaleStatics set createdDate = ?, modifiedDate = ?,"				+ "goodId = ?,"				+ "goodsClass = ?,"				+ "saleNumber = ?,"				+ "saleNumAmount = ?" 				+" where id = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setTimestamp(1, saleStatics.getCreatedDate());
			ps.setTimestamp(2, new Timestamp(new Date().getTime()));
						ps.setLong(3, saleStatics.getGoodId());			ps.setLong(4, saleStatics.getGoodsClass());			ps.setInt(5, saleStatics.getSaleNumber());			ps.setInt(6, saleStatics.getSaleNumAmount());			ps.setLong(7, saleStatics.getPrimaryKey());
			
			update=ps.executeUpdate();		
			log.debug("DML:" + sql + " affect " + sql + " row.");
		} catch (SQLException e) {
			log.error("error when update.", e);
		}finally{
			DButil.close(conn, ps);
		}
		
		return update;
	}
	
	public SaleStatics fetchByPrimaryKey(long primaryKey){
		SaleStatics saleStatics = null;
		Connection conn = DButil.getConnection();
		PreparedStatement ps = null;
		String sql = "SELECT * FROM ec_SaleStatics WHERE id = ?";
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setLong(1, primaryKey);
			rs = ps.executeQuery();
			while(rs.next()) {
				saleStatics = new SaleStaticsImpl();
								saleStatics.setPrimaryKey(rs.getLong(1));				saleStatics.setCreatedDate(rs.getTimestamp(2));				saleStatics.setModifiedDate(rs.getTimestamp(3));				saleStatics.setGoodId(rs.getLong(4));				saleStatics.setGoodsClass(rs.getLong(5));				saleStatics.setSaleNumber(rs.getInt(6));				saleStatics.setSaleNumAmount(rs.getInt(7));
			}
		} catch (SQLException e) {
			log.error("error when get ${User} by primaryKey: " + primaryKey, e);
		}
		
		return saleStatics;
	}
	
	public int delete(long primaryKey){
		int update = 0;
		Connection conn = DButil.getConnection();
		PreparedStatement ps = null;
		String sql = "DELETE FROM ec_SaleStatics WHERE id = ?";
		
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
	
	private static Logger log = Logger.getLogger(SaleStaticsDaoImpl.class.getName());
}
