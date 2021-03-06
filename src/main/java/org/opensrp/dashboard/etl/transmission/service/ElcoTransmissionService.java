package org.opensrp.dashboard.etl.transmission.service;

import org.json.JSONException;
import org.json.JSONObject;
import org.opensrp.dashboard.etl.data.converter.ElcoDataConverterService;
import org.opensrp.dashboard.etl.interfaces.TransmissionServices;
import org.springframework.beans.factory.annotation.Autowired;

public class ElcoTransmissionService implements TransmissionServices {
	
	@Autowired
	private ElcoDataConverterService elcoDataConverterService;
	
	public ElcoTransmissionService() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void convertDataJsonToEntity(JSONObject doc) throws JSONException {
		elcoDataConverterService.convertToEntityAndSave(doc);
		
	}
	
}
