/**
 * 
 */
package com.skc.common.exception.proecssor;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.skc.common.exception.lib.NotFoundException;
import com.skc.common.exception.lib.ResponseException;

/**
 * @author sitakant
 *
 */
@RestControllerAdvice
public class CommonExceptionProcessor {
	
	@ExceptionHandler(NotFoundException.class)
	public ResponseException landNotFoundException(NotFoundException nfe){
		nfe.printStackTrace();
		return new ResponseException(nfe.getStatusCode(), nfe.getErrorMessage());
	}
	
	@ExceptionHandler(RuntimeException.class)
	public ResponseException landRuntimeException(RuntimeException re){
		re.printStackTrace();
		return new ResponseException("ERR500", re.getMessage());
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseException landAllException(Exception e){
		e.printStackTrace();
		return new ResponseException("ERR000", e.getMessage());
	}

}
