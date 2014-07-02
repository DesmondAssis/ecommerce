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
import com.desmond.ec.user.intf.Administrator;

public class AdministratorDaoImpl{
	
	public int add(Administrator administrator) {
		int update = 0;
		Connection conn = DButil.getConnection();
		long nextPrimaryKey = Counter.getPrimaryKey(Administrator.class.getName(), conn);
		
		PreparedStatement ps = null;
		String sql = "INSERT INTO ec_Administrator VALUES(?, ?, ?, ?, ?)";
		try {
			ps=conn.prepareStatement(sql);
			ps.setLong(1, nextPrimaryKey);
			ps.setTimestamp(2, new Timestamp(new Date().getTime()));
			ps.setTimestamp(3, new Timestamp(new Date().getTime()));
						ps.setLong(4, administrator.getUserId());			ps.setInt(5, administrator.getAuthority());
			
			update = ps.executeUpdate();
			log.debug("count= " + update);
		} catch(SQLException e) {
			log.error("error when insert", e);
		} finally {
			DButil.close(conn, ps);
		}
		
		return update;
	}
	
	public int update(Administrator administrator){
		int update=0;
		Connection conn = DButil.getConnection();
		PreparedStatement ps=null;
		String sql = "UPDATE ec_Administrator set createdDate = ?, modifiedDate = ?,"				+ "userId = ?,"				+ "authority = ?" 				+" where id = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setTimestamp(1, administrator.getCreatedDate());
			ps.setTimestamp(2, new Timestamp(new Date().getTime()));
						ps.setLong(3, administrator.getUserId());			ps.setInt(4, administrator.getAuthority());			ps.setLong(5, administrator.getPrimaryKey());
			
			update=ps.executeUpdate();		
			log.debug("DML:" + sql + " affect " + sql + " row.");
		} catch (SQLException e) {
			log.error("error when update.", e);
		}finally{
			DButil.close(conn, ps);
		}
		
		return update;
	}
	
	public Administrator fetchByPrimaryKey(long primaryKey){
		Administrator administrator = null;
		Connection conn = DButil.getConnection();
		PreparedStatement ps = null;
		String sql = "SELECT * FROM ec_Administrator WHERE id = ?";
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setLong(1, primaryKey);
			rs = ps.executeQuery();
			while(rs.next()) {
				administrator = new AdministratorImpl();
								administrator.setPrimaryKey(rs.getLong(1));				administrator.setCreatedDate(rs.getTimestamp(2));				administrator.setModifiedDate(rs.getTimestamp(3));				administrator.setUserId(rs.getLong(4));				administrator.setAuthority(rs.getInt(5));
			}
		} catch (SQLException e) {
			log.error("error when get ${User} by primaryKey: " + primaryKey, e);
		}
		
		return administrator;
	}
	
	
	
	public int delete(long primaryKey){
		int update = 0;
		Connection conn = DButil.getConnection();
		PreparedStatement ps = null;
		String sql = "DELETE FROM ec_Administrator WHERE id = ?";
		
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
	
	private static Logger log = Logger.getLogger(AdministratorDaoImpl.class.getName());
}
