package org.opensrp.dashboard.etl.interfaces;

import org.json.JSONException;

public interface DataConverterService<T, V> {
	
	public V convertData(T t) throws JSONException;
	
	public void sendData(V v);
}
