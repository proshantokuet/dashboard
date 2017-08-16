package org.opensrp.dashboard.etl.transmission.service;

import org.json.JSONException;
import org.json.JSONObject;
import org.opensrp.dashboard.etl.entity.ChildEntity;
import org.opensrp.dashboard.etl.interfaces.TransmissionService;
import org.opensrp.dashboard.etl.repository.ChildRepository;
import org.opensrp.dashboard.etl.service.ChildService;

public class ChildTransmissionService implements TransmissionService<ChildEntity, ChildRepository, ChildService> {
	
	private ChildTransmissionService() {
		// TODO Auto-generated constructor stub
	}
	
	private static final ChildTransmissionService INSTANCE = new ChildTransmissionService();
	
	public static ChildTransmissionService getInstance() {
		return INSTANCE;
	}
	
	@Override
	public ChildEntity sentDataToConvert(JSONObject doc, ChildRepository childRepository, ChildService childService)
	    throws JSONException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
