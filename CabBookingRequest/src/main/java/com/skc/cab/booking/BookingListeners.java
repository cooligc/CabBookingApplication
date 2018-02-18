/**
 * 
 */
package com.skc.cab.booking;

import java.util.UUID;

import javax.persistence.PostPersist;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.skc.common.jpa.AbstractJPAListenerCallBack;
import com.skc.common.stream.lib.MessageDetail;
import com.skc.common.util.ObjectUtils;

/**
 * @author sitakant
 */
 @Component
public class BookingListeners extends AbstractJPAListenerCallBack<BookingRequest> {
	
	@Autowired
	RabbitTemplate rt; 
	
	@Override
	@PostPersist
	public void afterSave(BookingRequest t) {
		MessageDetail<BookingRequest> md = new MessageDetail<BookingRequest>();
		md.setCoRelationId(UUID.randomUUID().toString());
		md.setFrom("BookingRequest");
		md.setType("imme-book");
		md.setEntity(t);
		rt.convertAndSend(ObjectUtils.convertToJsonString(md));
		System.out.println("Message sent successfully");
		super.afterSave(t);
	}
	 
}
