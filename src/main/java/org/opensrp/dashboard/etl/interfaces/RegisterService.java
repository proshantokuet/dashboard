package org.opensrp.dashboard.etl.interfaces;

public interface RegisterService<T, X> {
	
	public void save(T t, X x);
	
	public void delete(T t, X x);
	
	public void update(T t, X x);
	
	public T findById(int id, X x);
	
	public T findByCaseId(String caseId, X x);
	
}
