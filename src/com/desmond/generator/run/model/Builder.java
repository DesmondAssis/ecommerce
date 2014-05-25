package com.desmond.generator.run.model;

import java.util.List;

public class Builder {
	private String packateName;
	private String author;
	private String nameSpace;
	private List<Entity> entities;

	public Builder(String packateName, String author, String nameSpace, List<Entity> entities) {
		super();
		this.packateName = packateName;
		this.author = author;
		this.nameSpace = nameSpace;
		this.entities = entities;
	}

	/**
	 * Returns the packateName of this Builder.
	 * 
	 * @return the packateName
	 */
	public String getPackateName() {
		return packateName;
	}

	/**
	 * Sets the packateName of this Builder.
	 * 
	 * @param packateName
	 *            the packateName to set
	 */
	public void setPackateName(String packateName) {
		this.packateName = packateName;
	}

	/**
	 * Returns the author of this Builder.
	 * 
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets the author of this Builder.
	 * 
	 * @param author
	 *            the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * Returns the nameSpace of this Builder.
	 * 
	 * @return the nameSpace
	 */
	public String getNameSpace() {
		return nameSpace;
	}

	/**
	 * Sets the nameSpace of this Builder.
	 * 
	 * @param nameSpace
	 *            the nameSpace to set
	 */
	public void setNameSpace(String nameSpace) {
		this.nameSpace = nameSpace;
	}

	/**
	 * Returns the entities of this Builder.
	 * @return the entities
	 */
	public List<Entity> getEntities() {
		return entities;
	}

	/**
	 * Sets the entities of this Builder.
	 * @param entities the entities to set
	 */
	public void setEntities(List<Entity> entities) {
		this.entities = entities;
	}
}
