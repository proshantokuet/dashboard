package org.opensrp.dashboard.etl.transmission.service;

import org.json.JSONException;
import org.json.JSONObject;
import org.opensrp.dashboard.etl.entity.ElcoEntity;
import org.opensrp.dashboard.etl.interfaces.TransmissionService;
import org.opensrp.dashboard.etl.repository.ElcoRepository;
import org.opensrp.dashboard.etl.service.ElcoService;

public class ElcoTransmissionService implements TransmissionService<ElcoEntity, ElcoRepository, ElcoService> {
	
	private ElcoTransmissionService() {
		// TODO Auto-generated constructor stub
	}
	
	private static final ElcoTransmissionService INSTANCE = new ElcoTransmissionService();
	
	public static ElcoTransmissionService getInstance() {
		return INSTANCE;
	}
	
	@Override
	public ElcoEntity sentDataToConvert(JSONObject doc, ElcoRepository elcoRepository, ElcoService elcoService)
	    throws JSONException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
