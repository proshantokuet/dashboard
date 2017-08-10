package org.opensrp.dashboard.etl.service;


public interface RegisterService<T> {
	public void save(T t);
	public void delete(T t);
	public void update(T t);
	public T findById(int id);
	
}