package org.opensrp.dashboard.etl.transmission.service;

import org.json.JSONObject;
import org.opensrp.dashboard.etl.interfaces.TransmissionService;

public class ElcoTransmissionService implements TransmissionService {
	
	private ElcoTransmissionService() {
		// TODO Auto-generated constructor stub
	}
	
	private static final ElcoTransmissionService INSTANCE = new ElcoTransmissionService();
	
	public static ElcoTransmissionService getInstance() {
		return INSTANCE;
	}
	
	@Override
	public void sentDataToConvert(JSONObject t) {
		// TODO Auto-generated method stub
		
	}
	
}
