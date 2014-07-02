package com.desmond.ec.comment.impl;

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
import com.desmond.ec.comment.intf.Comment;

public class CommentDaoImpl{
	
	public int add(Comment comment) {
		int update = 0;
		Connection conn = DButil.getConnection();
		long nextPrimaryKey = Counter.getPrimaryKey(Comment.class.getName(), conn);
		
		PreparedStatement ps = null;
		String sql = "INSERT INTO ec_Comment VALUES(?, ?, ?, ?, ?, ?)";
		try {
			ps=conn.prepareStatement(sql);
			ps.setLong(1, nextPrimaryKey);
			ps.setTimestamp(2, new Timestamp(new Date().getTime()));
			ps.setTimestamp(3, new Timestamp(new Date().getTime()));
						ps.setLong(4, comment.getUserId());			ps.setString(5, comment.getContent());			ps.setLong(6, comment.getGoodId());
			
			update = ps.executeUpdate();
			log.debug("count= " + update);
		} catch(SQLException e) {
			log.error("error when insert", e);
		} finally {
			DButil.close(conn, ps);
		}
		
		return update;
	}
	
	public int update(Comment comment){
		int update=0;
		Connection conn = DButil.getConnection();
		PreparedStatement ps=null;
		String sql = "UPDATE ec_Comment set createdDate = ?, modifiedDate = ?,"				+ "userId = ?,"				+ "content = ?,"				+ "goodId = ?" 				+" where id = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setTimestamp(1, comment.getCreatedDate());
			ps.setTimestamp(2, new Timestamp(new Date().getTime()));
						ps.setLong(3, comment.getUserId());			ps.setString(4, comment.getContent());			ps.setLong(5, comment.getGoodId());			ps.setLong(6, comment.getPrimaryKey());
			
			update=ps.executeUpdate();		
			log.debug("DML:" + sql + " affect " + sql + " row.");
		} catch (SQLException e) {
			log.error("error when update.", e);
		}finally{
			DButil.close(conn, ps);
		}
		
		return update;
	}
	
	public Comment fetchByPrimaryKey(long primaryKey){
		Comment comment = null;
		Connection conn = DButil.getConnection();
		PreparedStatement ps = null;
		String sql = "SELECT * FROM ec_Comment WHERE id = ?";
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setLong(1, primaryKey);
			rs = ps.executeQuery();
			while(rs.next()) {
				comment = new CommentImpl();
								comment.setPrimaryKey(rs.getLong(1));				comment.setCreatedDate(rs.getTimestamp(2));				comment.setModifiedDate(rs.getTimestamp(3));				comment.setUserId(rs.getLong(4));				comment.setContent(rs.getString(5));				comment.setGoodId(rs.getLong(6));
			}
		} catch (SQLException e) {
			log.error("error when get ${User} by primaryKey: " + primaryKey, e);
		}
		
		return comment;
	}
	
	
	
	public int delete(long primaryKey){
		int update = 0;
		Connection conn = DButil.getConnection();
		PreparedStatement ps = null;
		String sql = "DELETE FROM ec_Comment WHERE id = ?";
		
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
	
	private static Logger log = Logger.getLogger(CommentDaoImpl.class.getName());
}
