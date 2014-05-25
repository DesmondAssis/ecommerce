package com.desmond.generator.run.model;

import java.util.List;

public class Entity {
	private String name;
	private String tableName;
	List<Column> columns;

	public Entity(String name, String tableName, List<Column> columns) {
		super();
		this.name = name;
		this.tableName = tableName;
		this.columns = columns;
	}

	/**
	 * Returns the name of this Entity.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of this Entity.
	 * 
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the tableName of this Entity.
	 * 
	 * @return the tableName
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * Sets the tableName of this Entity.
	 * 
	 * @param tableName
	 *            the tableName to set
	 */
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	/**
	 * Returns the columns of this Entity.
	 * @return the columns
	 */
	public List<Column> getColumns() {
		return columns;
	}

	/**
	 * Sets the columns of this Entity.
	 * @param columns the columns to set
	 */
	public void setColumns(List<Column> columns) {
		this.columns = columns;
	}

}
