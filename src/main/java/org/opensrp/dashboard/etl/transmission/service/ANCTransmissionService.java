/**
 * 
 */
package org.opensrp.dashboard.etl.transmission.service;

import org.json.JSONException;
import org.json.JSONObject;
import org.opensrp.dashboard.etl.data.converter.ANCDataConverterService;
import org.opensrp.dashboard.etl.interfaces.TransmissionServices;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author sohel
 */
public class ANCTransmissionService implements TransmissionServices {
	
	@Autowired
	private ANCDataConverterService ancDataConverterService;
	
	public ANCTransmissionService() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void convertDataJsonToEntity(JSONObject doc) throws JSONException {
		System.out.println("Class:ANCTransmissionService, method:sentDataToConvert");
		ancDataConverterService.convertToEntityAndSave(doc);
		
	}
	
}
