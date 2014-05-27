package com.desmond.generator.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.desmond.generator.exception.NoSuchDBTypeException;
import com.desmond.generator.run.model.Builder;
import com.desmond.generator.run.model.Column;
import com.desmond.generator.run.model.Entity;
import com.desmond.generator.util.constant.DMConstants;
import com.desmond.generator.util.constant.SQLStatementConstant;
import com.desmond.generator.util.enums.TypeTransformEnum;

public class SQLGeneratorHelper {
	 private static Logger log = Logger.getLogger(SQLGeneratorHelper.class.getName());
	
	public static void creteTable(Builder builder) throws NoSuchDBTypeException{
    	List<Entity> entityList = builder.getEntities();
    	if(entityList != null && entityList.size() > 0) {
    		for(Entity entity : entityList) {
    			List<Column> columnList = entity.getColumns();
    			StringBuilder tableSb = new StringBuilder();
    			StringBuilder rowsSb = new StringBuilder();
    			tableSb.append(SQLStatementConstant.CREATE_TABLE_PREFIX.replace("${table-name}", entity.getTableName()));
    			
    			if(columnList != null && columnList.size() > 0) {
    				for(Column c : columnList) {
    					createIndividualRow(c, rowsSb);
    				} // end: for:column
    				String rows =  rowsSb.toString();
    				rows = rows.lastIndexOf(",") != -1 
    						? rows.substring(0, rows.lastIndexOf(","))
    								: rows;
    				tableSb.append(rows);
    			} // end: if:columnList
    			
    			tableSb.append(SQLStatementConstant.CREATE_TABLE_SUFFIX);
    			
    			log.debug("sql: " + tableSb);
        	} // end: for:entity
    	} // end: if:entityList
    	
    }
    
    private static void createIndividualRow(Column column, StringBuilder rowsSb) throws NoSuchDBTypeException{
    	if(column != null) {
    		rowsSb.append("\r\t");
    		String columnName = StringUtils.uncapitalize(column.getName());
    		rowsSb.append(columnName).append(" ");
    		TypeTransformEnum type
    			= TypeTransformEnum.getTypeByTypeInJava(DMConstants.DB_TYPE_MYSQL, column.getType());
    		
    		if(type.getDbType() == DMConstants.DB_TYPE_INVAILD) {
    			throw new NoSuchDBTypeException("No Such field type: " + type.getTypeInDB()
    						+ " for type in Java: " + type.getTypeInJava()
    						+ " in DB: " + type.getDbType());
    		}
    		
    		rowsSb.append(type.getTypeInDB()).append(" ");
    		
    		if(column.isNotNull()) {
    			rowsSb.append("NOT NULL").append(" ");
    		}
    		
    		if(column.isPrimary()) {
    			rowsSb.append("PRIMARY KEY").append(" ");
    		}
    		
    		if(column.isUnique()) {
    			rowsSb.append("UNIQUE").append(" ");
    		}
    		
    		if(column.isAutoIncrement()) {
    			rowsSb.append("AUTO_INCREMENT");
    		}
    		
    		rowsSb.append(",");
    	}
    }
}
