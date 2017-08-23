package org.opensrp.dashboard.etl.transmission.service;

import org.json.JSONException;
import org.json.JSONObject;
import org.opensrp.dashboard.etl.data.converter.HouseholdDataConverterService;
import org.opensrp.dashboard.etl.interfaces.TransmissionServices;
import org.springframework.beans.factory.annotation.Autowired;

public class HouseholdTransmissionService implements TransmissionServices {
	
	@Autowired
	private HouseholdDataConverterService householdDataConverterService;
	
	public HouseholdTransmissionService() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void convertDataJsonToEntity(JSONObject doc) throws JSONException {
		householdDataConverterService.convertToEntityAndSave(doc);
		
	}
	
}
