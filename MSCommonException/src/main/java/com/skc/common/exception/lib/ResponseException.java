/**
 * 
 */
package com.skc.common.exception.lib;

import java.io.Serializable;

/**
 * @author sitakant
 *
 */
public class ResponseException implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorCode;
	private String message;
	/**
	 * @param errorCode
	 * @param message
	 */
	public ResponseException(String errorCode, String message) {
		super();
		this.errorCode = errorCode;
		this.message = message;
	}
	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}
	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
