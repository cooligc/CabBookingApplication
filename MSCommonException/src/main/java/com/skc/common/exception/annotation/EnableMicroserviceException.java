/**
 * 
 */
package com.skc.common.exception.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

/**
 * @author sitakant
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value={ElementType.TYPE})
@Import(ExceptionConfig.class)
public @interface EnableMicroserviceException {

}
