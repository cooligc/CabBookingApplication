/**
 * 
 */
package com.skc.common.stream.lib;

import java.io.Serializable;

/**
 * @author sitakant
 *
 */
public interface MessageReciever<T extends Serializable> {
	MessageDetail<T> onMessageRecieve(MessageDetail<T> md);
	Exception onException(Exception ex);
}
