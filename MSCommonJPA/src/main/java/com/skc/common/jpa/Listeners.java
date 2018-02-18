package com.skc.common.jpa;


import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

public interface Listeners<T> {
	
	@PrePersist
	void beforeSave(T t);
	
	@PostPersist
	void afterSave(T t);
	
	@PostLoad
	void afterFetch(T t);
	
	@PreUpdate
	void beforeUpdate(T t);
	
	@PostUpdate
	void afterUpdate(T t);
	
	@PreRemove
	void beforeRemove(T t);
	
	@PostRemove
	void afterRemove(T t);
	
}
