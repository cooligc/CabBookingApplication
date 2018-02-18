/**
 * 
 */
package com.skc.common.stream.lib;

import java.io.Serializable;

/**
 * @author sitakant
 *
 */
public class MicroserviceMessageReceiver<T extends Serializable> implements MessageReciever<T>{

	private MessageDetail<T> messageDetails;
	
	@Override
	public MessageDetail<T> onMessageRecieve(MessageDetail<T> md) {
		this.messageDetails = md;
		return md;
	}

	@Override
	public Exception onException(Exception ex) {
		return ex;
	}
	
	public MessageDetail<T> getMessageDetail(){
		return this.messageDetails;
	}
	
}
