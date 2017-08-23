package org.opensrp.dashboard.etl.transmission.service;

import org.json.JSONException;
import org.json.JSONObject;
import org.opensrp.dashboard.etl.data.converter.BNFDataConverterService;
import org.opensrp.dashboard.etl.interfaces.TransmissionServices;
import org.springframework.beans.factory.annotation.Autowired;

public class BNFTransmissionService implements TransmissionServices {
	
	@Autowired
	private BNFDataConverterService bnfDataConverterService;
	
	@Override
	public void convertDataJsonToEntity(JSONObject doc) throws JSONException {
		System.out.println("Class:BNFTransmissionService, method:sentDataToConvert");
		bnfDataConverterService.convertToEntityAndSave(doc);
	}
	
}
