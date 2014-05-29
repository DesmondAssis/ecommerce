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
import com.desmond.generator.util.enums.TemplateEnum;
import com.desmond.generator.util.enums.TypeTransformEnum;

public class DaoImplGeneratorHelper {
	private static Logger log = Logger.getLogger(DaoImplGeneratorHelper.class.getName());
	
	private static final String INSERT_STATEMENT = "INSERT INTO ${table_name} VALUES(${question_marks})";
	private static final String UPDATE_STATEMENT = "UPDATE ${table_name} set createdDate = ?, modifiedDate = ?,";
	
	private static String getInsertStatement(int numOfFields) {
		if(numOfFields <= 0) {
			return null;
		}
		StringBuilder questionMarksSb = new StringBuilder("?");
		for(int i = 0; i < numOfFields; i++) {
			if(i == numOfFields -1) {
				questionMarksSb.append(",?");
			} else {
				questionMarksSb.append(",?,");
			}
		}
		return INSERT_STATEMENT.replace("${question_marks}", questionMarksSb.toString());
	}
	
	
	private static String getInsertSetStatement(Entity entity, int numOfFields) {
		List<Column> fields = entity != null ? entity.getColumns() : null;
		if(fields == null || fields.isEmpty()) {
			return null;
		}
		
		StringBuilder setStatementSb = new StringBuilder();
		for(int i = 3; i < fields.size(); i++) {
			Column field = fields.get(i);
			setStatementSb.append("\r\t\t\t")
							.append("ps.set")
							.append(field.getType())
							.append("(")
							.append(i+1)
							.append(", ")
							.append(entity.getName().toLowerCase())
							.append(".get")
							.append(StringUtils.capitalize(field.getName()))
							.append("());");
		}
		
		return setStatementSb.toString();
	}
	
	private static String getUpatetStatement(Entity entity, int numOfFields) {
		List<Column> fields = entity != null ? entity.getColumns() : null;
		if(fields == null || fields.isEmpty()) {
			return null;
		}
		
		StringBuilder updateStatementSb = new StringBuilder(UPDATE_STATEMENT);
		for(int i = 3; i < fields.size(); i++) {
			Column field = fields.get(i);
			String comma = i != fields.size() - 1 ? "," : " \r\t\t\t\t+\" where " + fields.get(0).getName() + " = ?\"";
			updateStatementSb.append("\r\t\t\t\t")
							.append("+ \"")
							.append(field.getName())
							.append(" = ?")
							.append(comma);
		}
		
		return updateStatementSb.toString();
	}
	private static String getUpdateSetStatement(Entity entity, int numOfFields) {
		List<Column> fields = entity != null ? entity.getColumns() : null;
		if(fields == null || fields.isEmpty()) {
			return null;
		}
		
		StringBuilder setStatementSb = new StringBuilder();
		for(int i = 3; i < fields.size(); i++) {
			Column field = fields.get(i);
			setStatementSb.append("\r\t\t\t")
							.append("ps.set")
							.append(field.getType())
							.append("(")
							.append(i)
							.append(", ")
							.append(entity.getName().toLowerCase())
							.append(".get")
							.append(StringUtils.capitalize(field.getName()))
							.append("());");
		}
		setStatementSb.append("\r\t\t\t")
		.append("ps.set")
		.append(fields.get(0).getType())
		.append("(")
		.append(fields.size())
		.append(", ")
		.append(entity.getName().toLowerCase())
		.append(".getPrimaryKey());");
		return setStatementSb.toString();
	}
	
	public static void generateDaoImpl(Builder builder) {
		String template = GeneratorHelper.templateFileMap
				.get(TemplateEnum.DAO_IMPL.getType());
		
		List<Entity> entityList = builder.getEntities();
		if (entityList != null && entityList.size() > 0) {
			for (Entity entity : entityList) {
				String
			}
		}
	}
}