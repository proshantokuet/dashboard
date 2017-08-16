package org.opensrp.dashboard.etl.transmission.service;

import org.json.JSONException;
import org.json.JSONObject;
import org.opensrp.dashboard.etl.entity.MotherEntity;
import org.opensrp.dashboard.etl.interfaces.TransmissionService;
import org.opensrp.dashboard.etl.repository.MotherRepository;
import org.opensrp.dashboard.etl.service.MotherService;

public class MotherTransmissionService implements TransmissionService<MotherEntity, MotherRepository, MotherService> {
	
	private MotherTransmissionService() {
		// TODO Auto-generated constructor stub
	}
	
	private static final MotherTransmissionService INSTANCE = new MotherTransmissionService();
	
	public static MotherTransmissionService getInstance() {
		return INSTANCE;
	}
	
	@Override
	public MotherEntity sentDataToConvert(JSONObject doc, MotherRepository motherRepository, MotherService motherService)
	    throws JSONException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
