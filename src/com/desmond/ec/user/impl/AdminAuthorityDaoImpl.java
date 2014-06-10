package com.desmond.ec.user.impl;

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
import com.desmond.ec.user.intf.AdminAuthority;

public class AdminAuthorityDaoImpl{
	
	public int add(AdminAuthority adminAuthority) {
		int update = 0;
		Connection conn = DButil.getConnection();
		long nextPrimaryKey = Counter.getPrimaryKey(AdminAuthority.class.getName(), conn);
		
		PreparedStatement ps = null;
		String sql = "INSERT INTO ec_AdminAuthority VALUES(?, ?, ?, ?)";
		try {
			ps=conn.prepareStatement(sql);
			ps.setLong(1, nextPrimaryKey);
			ps.setTimestamp(2, new Timestamp(new Date().getTime()));
			ps.setTimestamp(3, new Timestamp(new Date().getTime()));
						ps.setString(4, adminAuthority.getName());
			
			update = ps.executeUpdate();
			log.debug("count= " + update);
		} catch(SQLException e) {
			log.error("error when insert", e);
		} finally {
			DButil.close(conn, ps);
		}
		
		return update;
	}
	
	public int update(AdminAuthority adminAuthority){
		int update=0;
		Connection conn = DButil.getConnection();
		PreparedStatement ps=null;
		String sql = "UPDATE ec_AdminAuthority set createdDate = ?, modifiedDate = ?,"				+ "name = ?" 				+" where id = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setTimestamp(1, adminAuthority.getCreatedDate());
			ps.setTimestamp(2, new Timestamp(new Date().getTime()));
						ps.setString(3, adminAuthority.getName());			ps.setLong(4, adminAuthority.getPrimaryKey());
			
			update=ps.executeUpdate();		
			log.debug("DML:" + sql + " affect " + sql + " row.");
		} catch (SQLException e) {
			log.error("error when update.", e);
		}finally{
			DButil.close(conn, ps);
		}
		
		return update;
	}
	
	public AdminAuthority fetchByPrimaryKey(long primaryKey){
		AdminAuthority adminAuthority = null;
		Connection conn = DButil.getConnection();
		PreparedStatement ps = null;
		String sql = "SELECT * FROM ec_AdminAuthority WHERE id = ?";
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setLong(1, primaryKey);
			rs = ps.executeQuery();
			while(rs.next()) {
				adminAuthority = new AdminAuthorityImpl();
								adminAuthority.setPrimaryKey(rs.getLong(1));				adminAuthority.setCreatedDate(rs.getTimestamp(2));				adminAuthority.setModifiedDate(rs.getTimestamp(3));				adminAuthority.setName(rs.getString(4));
			}
		} catch (SQLException e) {
			log.error("error when get ${User} by primaryKey: " + primaryKey, e);
		}
		
		return adminAuthority;
	}
	
	public int delete(long primaryKey){
		int update = 0;
		Connection conn = DButil.getConnection();
		PreparedStatement ps = null;
		String sql = "DELETE FROM ec_AdminAuthority WHERE id = ?";
		
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
	
	private static Logger log = Logger.getLogger(AdminAuthorityDaoImpl.class.getName());
}
