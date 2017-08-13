package org.opensrp.dashboard.etl.transmission.service;

import org.json.JSONObject;
import org.opensrp.dashboard.etl.interfaces.TransmissionService;

public class HouseholdTransmissionService implements TransmissionService {
	
	private HouseholdTransmissionService() {
		// TODO Auto-generated constructor stub
	}
	
	private static final HouseholdTransmissionService INSTANCE = new HouseholdTransmissionService();
	
	public static HouseholdTransmissionService getInstance() {
		return INSTANCE;
	}
	
	@Override
	public void sentDataToConvert(JSONObject t) {
		System.err.println("Household:" + t.toString());
		
	}
	
}
