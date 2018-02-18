/**
 * 
 */
package com.skc.common.jpa;

import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

/**
 * @author sitakant
 *
 */
public abstract class AbstractJPAListenerCallBack<T> implements Listeners<T>{
	
	@PrePersist
	@Override
	public void beforeSave(T t){
		
	}
	
	@PostPersist
	@Override
	public void afterSave(T t){
		
	}
	
	@PostLoad
	@Override
	public void afterFetch(T t){
		
	}
	
	@PreUpdate
	@Override
	public void beforeUpdate(T t){
		
	}
	
	@PostUpdate
	@Override
	public void afterUpdate(T t){
		
	}
	
	@PreRemove
	@Override
	public void beforeRemove(T t){
		
	}
	
	@PostRemove
	@Override
	public void afterRemove(T t){
		
	}
}
