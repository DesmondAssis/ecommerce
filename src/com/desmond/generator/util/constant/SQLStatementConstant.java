package com.desmond.generator.util.constant;

public interface SQLStatementConstant {
	String CREATE_TABLE_PREFIX = "create table ${table-name} (\r\n";
	String CREATE_TABLE_SUFFIX = "\r) engine InnoDB;";
}
