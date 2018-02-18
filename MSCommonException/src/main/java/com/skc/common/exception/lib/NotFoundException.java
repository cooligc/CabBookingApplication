/**
 * 
 */
package com.skc.common.exception.lib;

/**
 * @author sitakant
 *
 */
public class NotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String statusCode;
	private String errorMessage;
	private String entityName;
	private String entityId;
	
	
	public NotFoundException(){
		
	}
	
	/**
	 * TODO This needs to be improved
	 * @param statusCode
	 * @param errorMessage
	 * @param entityName
	 * @param entityId
	 */
	public NotFoundException(String statusCode, String errorMessage, String entityName, String entityId) {
		super();
		this.statusCode = statusCode;
		this.errorMessage = errorMessage;
		this.entityName = entityName;
		this.entityId = entityId;
	}
	/**
	 * @return the statusCode
	 */
	public String getStatusCode() {
		return statusCode;
	}
	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}
	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	/**
	 * @return the entityName
	 */
	public String getEntityName() {
		return entityName;
	}
	/**
	 * @param entityName the entityName to set
	 */
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
	/**
	 * @return the entityId
	 */
	public String getEntityId() {
		return entityId;
	}
	/**
	 * @param entityId the entityId to set
	 */
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}
	
	
}
