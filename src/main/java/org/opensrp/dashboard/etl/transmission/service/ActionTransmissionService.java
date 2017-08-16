package org.opensrp.dashboard.etl.transmission.service;

import org.json.JSONObject;
import org.opensrp.dashboard.etl.entity.ActionEntity;
import org.opensrp.dashboard.etl.interfaces.TransmissionService;
import org.opensrp.dashboard.etl.repository.ActionRepository;
import org.opensrp.dashboard.etl.service.ActionService;

public class ActionTransmissionService implements TransmissionService<ActionEntity, ActionRepository, ActionService> {
	
	private ActionTransmissionService() {
		// TODO Auto-generated constructor stub
	}
	
	private static final ActionTransmissionService INSTANCE = new ActionTransmissionService();
	
	public static ActionTransmissionService getInstance() {
		return INSTANCE;
	}
	
	@Override
	public ActionEntity sentDataToConvert(JSONObject t, ActionRepository actionRepository, ActionService actionService) {
		System.err.println("Action" + t.toString());
		return null;
		
	}
	
}
