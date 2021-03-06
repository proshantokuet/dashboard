package org.opensrp.dashboard.etl.data.converter;

import org.json.JSONException;
import org.json.JSONObject;
import org.opensrp.dashboard.etl.entity.PNCEntity;
import org.opensrp.dashboard.etl.interfaces.DataConverterService;
import org.opensrp.dashboard.etl.service.PNCService;
import org.springframework.beans.factory.annotation.Autowired;

public class PNCDataConverterService implements DataConverterService {
	
	@Autowired
	private PNCEntity pncEntity;
	
	@Autowired
	private PNCService pncService;
	
	public PNCDataConverterService() {
		
	}
	
	@Autowired
	public void setPNCEntity(PNCEntity pncEntity) {
		this.pncEntity = pncEntity;
	}
	
	@Override
	public void convertToEntityAndSave(JSONObject doc) throws JSONException {
		
		try {
			JSONObject data = new JSONObject(doc.getString("data"));
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Class: PNCDataConverterService, method: convertData");
		pncService.save(pncEntity);
	}
	
}
