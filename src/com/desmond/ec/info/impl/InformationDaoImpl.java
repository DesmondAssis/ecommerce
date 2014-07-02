package com.desmond.ec.info.impl;

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
import com.desmond.ec.info.intf.Information;

public class InformationDaoImpl{
	
	public int add(Information information) {
		int update = 0;
		Connection conn = DButil.getConnection();
		long nextPrimaryKey = Counter.getPrimaryKey(Information.class.getName(), conn);
		
		PreparedStatement ps = null;
		String sql = "INSERT INTO ec_Information VALUES(?, ?, ?, ?, ?, ?, ?)";
		try {
			ps=conn.prepareStatement(sql);
			ps.setLong(1, nextPrimaryKey);
			ps.setTimestamp(2, new Timestamp(new Date().getTime()));
			ps.setTimestamp(3, new Timestamp(new Date().getTime()));
						ps.setString(4, information.getTitle());			ps.setString(5, information.getContent());			ps.setInt(6, information.getStatus());			ps.setInt(7, information.getType());
			
			update = ps.executeUpdate();
			log.debug("count= " + update);
		} catch(SQLException e) {
			log.error("error when insert", e);
		} finally {
			DButil.close(conn, ps);
		}
		
		return update;
	}
	
	public int update(Information information){
		int update=0;
		Connection conn = DButil.getConnection();
		PreparedStatement ps=null;
		String sql = "UPDATE ec_Information set createdDate = ?, modifiedDate = ?,"				+ "title = ?,"				+ "content = ?,"				+ "status = ?,"				+ "type = ?" 				+" where id = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setTimestamp(1, information.getCreatedDate());
			ps.setTimestamp(2, new Timestamp(new Date().getTime()));
						ps.setString(3, information.getTitle());			ps.setString(4, information.getContent());			ps.setInt(5, information.getStatus());			ps.setInt(6, information.getType());			ps.setLong(7, information.getPrimaryKey());
			
			update=ps.executeUpdate();		
			log.debug("DML:" + sql + " affect " + sql + " row.");
		} catch (SQLException e) {
			log.error("error when update.", e);
		}finally{
			DButil.close(conn, ps);
		}
		
		return update;
	}
	
	public Information fetchByPrimaryKey(long primaryKey){
		Information information = null;
		Connection conn = DButil.getConnection();
		PreparedStatement ps = null;
		String sql = "SELECT * FROM ec_Information WHERE id = ?";
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setLong(1, primaryKey);
			rs = ps.executeQuery();
			while(rs.next()) {
				information = new InformationImpl();
								information.setPrimaryKey(rs.getLong(1));				information.setCreatedDate(rs.getTimestamp(2));				information.setModifiedDate(rs.getTimestamp(3));				information.setTitle(rs.getString(4));				information.setContent(rs.getString(5));				information.setStatus(rs.getInt(6));				information.setType(rs.getInt(7));
			}
		} catch (SQLException e) {
			log.error("error when get ${User} by primaryKey: " + primaryKey, e);
		}
		
		return information;
	}
	
	
	
	public int delete(long primaryKey){
		int update = 0;
		Connection conn = DButil.getConnection();
		PreparedStatement ps = null;
		String sql = "DELETE FROM ec_Information WHERE id = ?";
		
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
	
	private static Logger log = Logger.getLogger(InformationDaoImpl.class.getName());
}
