/**
 * 
 */
package com.skc.common.stream.lib;

import java.io.Serializable;

import com.skc.common.util.ObjectUtils;

/**
 * @author sitakant
 *
 */
public class MicroserviceMessageReceiver<T extends Serializable> implements MessageReciever<T>{

	private MessageDetail<T> messageDetails;
	
	@Override
	public MessageDetail<T> onMessageRecieve(String message) {
		System.out.println("Recieved Message \n"+message+"\n\n");
		this.messageDetails = ObjectUtils.convertToJava(message, MessageDetail.class);
		return messageDetails;
	}

	@Override
	public Exception onException(Exception ex) {
		return ex;
	}
	
	public MessageDetail<T> getMessageDetail(){
		return this.messageDetails;
	}
	
}
