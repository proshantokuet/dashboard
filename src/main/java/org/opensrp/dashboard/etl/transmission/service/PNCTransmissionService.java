/**
 * 
 */
package org.opensrp.dashboard.etl.transmission.service;

import org.json.JSONException;
import org.json.JSONObject;
import org.opensrp.dashboard.etl.data.converter.PNCDataConverterService;
import org.opensrp.dashboard.etl.interfaces.TransmissionServices;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author sohel
 */
public class PNCTransmissionService implements TransmissionServices {
	
	@Autowired
	private PNCDataConverterService pncDataConverterService;
	
	public PNCTransmissionService() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void convertDataJsonToEntity(JSONObject doc) throws JSONException {
		System.out.println("Class:PNCTransmissionService, method:sentDataToConvert");
		pncDataConverterService.convertToEntityAndSave(doc);
		
	}
	
}
