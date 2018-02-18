/**
 * 
 */
package com.skc.common.stream.lib;

import java.io.Serializable;

/**
 * @author sitakant
 *
 */
public class MessageDetail<T extends Serializable> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private T entity;
	private String coRelationId;
	private String from;
	private String type;
	/**
	 * @return the t
	 */
	public T getEntity() {
		return entity;
	}
	/**
	 * @param t the t to set
	 */
	public void setEntity(T entity) {
		this.entity = entity;
	}
	/**
	 * @return the coRelationId
	 */
	public String getCoRelationId() {
		return coRelationId;
	}
	/**
	 * @param coRelationId the coRelationId to set
	 */
	public void setCoRelationId(String coRelationId) {
		this.coRelationId = coRelationId;
	}
	/**
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}
	/**
	 * @param from the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	
}
