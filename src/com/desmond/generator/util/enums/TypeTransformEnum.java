package com.desmond.generator.util.enums;

import com.desmond.generator.util.constant.DMConstants;

public enum TypeTransformEnum {
	INVALID(DMConstants.DB_TYPE_INVAILD, "", ""),
	LONG(DMConstants.DB_TYPE_MYSQL, "long", "BIGINT(25)"),
	STRING(DMConstants.DB_TYPE_MYSQL, "String", "VARCHAR(75)"),
	TIME(DMConstants.DB_TYPE_MYSQL, "Time", "TIMESTAMP");
	
	private int dbType;
	private String typeInJava;
	private String TypeInDB;

	private TypeTransformEnum(int dbType, String typeInJava, String typeInDB) {
		this.dbType = dbType;
		this.typeInJava = typeInJava;
		TypeInDB = typeInDB;
	}
	
	public static TypeTransformEnum getTypeByTypeInDB(int db, String typeInDB) {
		for(TypeTransformEnum type : TypeTransformEnum.values()) {
			if(db == type.getDbType() && typeInDB.equals(type.getTypeInDB())) {
				return type;
			}
		}
		
		return TypeTransformEnum.INVALID;
	}
	
	public static TypeTransformEnum getTypeByTypeInJava(int db, String typeInJava) {
		for(TypeTransformEnum type : TypeTransformEnum.values()) {
			if(db == type.getDbType() && typeInJava.equals(type.getTypeInJava())) {
				return type;
			}
		}
		
		return TypeTransformEnum.INVALID;
	}

	/**
	 * Returns the dbType of this TypeTransformEnum.
	 * @return the dbType
	 */
	public int getDbType() {
		return dbType;
	}

	/**
	 * Sets the dbType of this TypeTransformEnum.
	 * @param dbType the dbType to set
	 */
	public void setDbType(int dbType) {
		this.dbType = dbType;
	}

	/**
	 * Returns the typeInJava of this TypeTransformEnum.
	 * @return the typeInJava
	 */
	public String getTypeInJava() {
		return typeInJava;
	}

	/**
	 * Sets the typeInJava of this TypeTransformEnum.
	 * @param typeInJava the typeInJava to set
	 */
	public void setTypeInJava(String typeInJava) {
		this.typeInJava = typeInJava;
	}

	/**
	 * Returns the typeInDB of this TypeTransformEnum.
	 * @return the typeInDB
	 */
	public String getTypeInDB() {
		return TypeInDB;
	}

	
	/**
	 * Sets the typeInDB of this TypeTransformEnum.
	 * @param typeInDB the typeInDB to set
	 */
	public void setTypeInDB(String typeInDB) {
		TypeInDB = typeInDB;
	}

}
