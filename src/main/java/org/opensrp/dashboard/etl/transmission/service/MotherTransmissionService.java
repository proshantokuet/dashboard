package org.opensrp.dashboard.etl.transmission.service;

import org.json.JSONObject;
import org.opensrp.dashboard.etl.interfaces.TransmissionService;

public class MotherTransmissionService implements TransmissionService {
	
	private MotherTransmissionService() {
		// TODO Auto-generated constructor stub
	}
	
	private static final MotherTransmissionService INSTANCE = new MotherTransmissionService();
	
	public static MotherTransmissionService getInstance() {
		return INSTANCE;
	}
	
	@Override
	public void sentDataToConvert(JSONObject t) {
		// TODO Auto-generated method stub
		
	}
	
}
