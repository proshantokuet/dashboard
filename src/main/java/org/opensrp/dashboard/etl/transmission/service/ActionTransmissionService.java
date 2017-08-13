package org.opensrp.dashboard.etl.transmission.service;

import org.json.JSONObject;
import org.opensrp.dashboard.etl.interfaces.TransmissionService;

public class ActionTransmissionService implements TransmissionService {
	
	private ActionTransmissionService() {
		// TODO Auto-generated constructor stub
	}
	
	private static final ActionTransmissionService INSTANCE = new ActionTransmissionService();
	
	public static ActionTransmissionService getInstance() {
		return INSTANCE;
	}
	
	@Override
	public void sentDataToConvert(JSONObject t) {
		System.err.println("Action" + t.toString());
		
	}
	
}
