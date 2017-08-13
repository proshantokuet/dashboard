package org.opensrp.dashboard.etl.transmission.service;

import java.util.HashMap;
import java.util.Map;

import org.opensrp.dashboard.etl.interfaces.TransmissionService;

public class TransmissionServiceFactory {
	
	private static final Map<String, Object> transmissionServiceMap = new HashMap<String, Object>();
	static {
		transmissionServiceMap.put("HouseHold", HouseholdTransmissionService.getInstance());
		transmissionServiceMap.put("Elco", ElcoTransmissionService.getInstance());
		transmissionServiceMap.put("Action", ActionTransmissionService.getInstance());
		transmissionServiceMap.put("Child", ChildTransmissionService.getInstance());
		transmissionServiceMap.put("Mother", MotherTransmissionService.getInstance());
	};
	
	public static TransmissionService getTransmissionType(String transmissionType) {
		
		return (TransmissionService) transmissionServiceMap.get(transmissionType);
		
	}
	
}
