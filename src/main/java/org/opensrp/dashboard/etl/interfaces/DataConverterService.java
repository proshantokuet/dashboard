package org.opensrp.dashboard.etl.interfaces;

public interface DataConverterService<T, V> {
	
	public V convertData(T t);
	
	public void sendData(V v);
}
