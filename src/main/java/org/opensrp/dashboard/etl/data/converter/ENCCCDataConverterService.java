package org.opensrp.dashboard.etl.data.converter;

import org.json.JSONObject;
import org.opensrp.dashboard.etl.entity.ENCCEntity;
import org.opensrp.dashboard.etl.interfaces.DataConverterService;

public class ENCCCDataConverterService implements DataConverterService<JSONObject, ENCCEntity> {
	
	private ENCCCDataConverterService() {
		// TODO Auto-generated constructor stub
	}
	
	private static final ENCCCDataConverterService INSTANCE = new ENCCCDataConverterService();
	
	public ENCCCDataConverterService getInstance() {
		return INSTANCE;
		
	}
	
	@Override
	public ENCCEntity convertData(JSONObject t) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void sendData(ENCCEntity v) {
		// TODO Auto-generated method stub
		
	}
	
}
