/**
 * 
 */
package com.skc.common.stream.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

/**
 * @author sitakant
 *
 */
@Documented
@Retention(RUNTIME)
@Target(TYPE)
@Import(RabbitMQConfiguration.class)
public @interface EnableMicroserviceRabbitMQ {

}
