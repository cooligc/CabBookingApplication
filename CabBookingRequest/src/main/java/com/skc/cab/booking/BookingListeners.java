/**
 * 
 */
package com.skc.cab.booking;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.skc.common.jpa.AbstractJPAListenerCallBack;
import com.skc.common.stream.lib.MessageDetail;

/**
 * @author sitakant
 */
 @Component
public class BookingListeners extends AbstractJPAListenerCallBack<BookingRequest> {
	
	@Autowired
	RabbitTemplate rt; 
	
	@Override
	public void afterSave(BookingRequest t) {
		MessageDetail<BookingRequest> md = new MessageDetail<BookingRequest>();
		md.setCoRelationId(UUID.randomUUID().toString());
		md.setFrom("BookingRequest");
		md.setType("imme-book");
		md.setEntity(t);
		//rt.sendAndReceive(SerializationUtils.serialize(t))
		super.afterSave(t);
	}
	 
}
