/**
 * 
 */
package org.opensrp.dashboard.etl.transmission.service;

import org.json.JSONException;
import org.json.JSONObject;
import org.opensrp.dashboard.etl.data.converter.ENCCDataConverterService;
import org.opensrp.dashboard.etl.interfaces.TransmissionServices;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author sohel
 */
public class ENCCTransmissionService implements TransmissionServices {
	
	@Autowired
	private ENCCDataConverterService enccDataConverterService;
	
	public ENCCTransmissionService() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void convertDataJsonToEntity(JSONObject doc) throws JSONException {
		enccDataConverterService.convertToEntityAndSave(doc);
		
	}
	
}
