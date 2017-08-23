/**
 * 
 */
package org.opensrp.dashboard.etl.transmission.service;

import org.json.JSONException;
import org.json.JSONObject;
import org.opensrp.dashboard.etl.data.converter.PSRFDataConverterService;
import org.opensrp.dashboard.etl.interfaces.TransmissionServices;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author sohel
 */
public class PSRFTransmissionService implements TransmissionServices {
	
	@Autowired
	private PSRFDataConverterService psrfDataConverterService;
	
	public PSRFTransmissionService() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void convertDataJsonToEntity(JSONObject doc) throws JSONException {
		psrfDataConverterService.convertToEntityAndSave(doc);
		
	}
	
}
