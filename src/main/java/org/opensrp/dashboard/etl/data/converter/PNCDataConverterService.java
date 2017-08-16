package org.opensrp.dashboard.etl.data.converter;

import org.json.JSONObject;
import org.opensrp.dashboard.etl.entity.PNCEntity;
import org.opensrp.dashboard.etl.interfaces.DataConverterService;

public class PNCDataConverterService implements DataConverterService<JSONObject, PNCEntity> {
	
	private PNCDataConverterService() {
		// TODO Auto-generated constructor stub
	}
	
	private static final PNCDataConverterService INSTANCE = new PNCDataConverterService();
	
	public PNCDataConverterService getInstance() {
		return INSTANCE;
		
	}
	
	@Override
	public PNCEntity convertData(JSONObject t) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void sendData(PNCEntity v) {
		// TODO Auto-generated method stub
		
	}
	
}
