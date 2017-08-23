package org.opensrp.dashboard.etl.transmission.service;

import org.json.JSONException;
import org.json.JSONObject;
import org.opensrp.dashboard.etl.data.converter.MotherDataConverterService;
import org.opensrp.dashboard.etl.interfaces.TransmissionServices;
import org.springframework.beans.factory.annotation.Autowired;

public class MotherTransmissionService implements TransmissionServices {
	
	@Autowired
	private MotherDataConverterService motherDataConverterService;
	
	@Override
	public void convertDataJsonToEntity(JSONObject doc) throws JSONException {
		System.out.println("Class:MotherTransmissionService, method:sentDataToConvert");
		motherDataConverterService.convertToEntityAndSave(doc);
	}
	
}
