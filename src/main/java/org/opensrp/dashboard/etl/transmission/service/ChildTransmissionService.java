package org.opensrp.dashboard.etl.transmission.service;

import org.json.JSONObject;
import org.opensrp.dashboard.etl.interfaces.TransmissionService;

public class ChildTransmissionService implements TransmissionService {
	
	private ChildTransmissionService() {
		// TODO Auto-generated constructor stub
	}
	
	private static final ChildTransmissionService INSTANCE = new ChildTransmissionService();
	
	public static ChildTransmissionService getInstance() {
		return INSTANCE;
	}
	
	@Override
	public void sentDataToConvert(JSONObject t) {
		// TODO Auto-generated method stub
		
	}
	
}
