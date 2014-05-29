package ${packageName};

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
import ${imports};

public class ${daoImpl}{
	
	public int add(${model} ${modelVariable}) {
		int update = 0;
		Connection conn = DButil.getConnection();
		long nextPrimaryKey = Counter.getPrimaryKey(${model}.class.getName(), conn);
		
		PreparedStatement ps = null;
		String sql = ${insertSql};
		try {
			ps=conn.prepareStatement(sql);
			ps.setLong(1, nextPrimaryKey);
			ps.setTime(2, new Time(new Date().getTime()));
			ps.setTime(3, new Time(new Date().getTime()));
			
			${insertSetStatement}
			
			update = ps.executeUpdate();
			log.debug("count= " + update);
		} catch(SQLException e) {
			log.error("error when insert", e);
		} finally {
			DButil.close(conn, ps);
		}
		
		return update;
	}
	
	public int update(${model} ${modelVariable}){
		int update=0;
		Connection conn = DButil.getConnection();
		PreparedStatement ps=null;
		String sql = ${updateStatementSql}
		try {
			ps = conn.prepareStatement(sql);
			ps.setTime(1, ${modelVariable}.getCreateDate());
			ps.setTime(2, new Time(new Date().getTime()));
			
			${updateStatementSetSql}
			
			update=ps.executeUpdate();		
			log.debug(String.format("DML: s%, affect %d row.", sql, update));
		} catch (SQLException e) {
			log.error("error when update.", e);
		}finally{
			DButil.close(conn, ps);
		}
		
		return update;
	}
	
	private static Logger log = Logger.getLogger(${daoImpl}.class.getName());
}
