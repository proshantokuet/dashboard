package org.opensrp.dashboard.etl.transmission.service;

import org.opensrp.dashboard.etl.interfaces.TransmissionServices;
import org.springframework.beans.factory.annotation.Autowired;

public class TransmissionServiceFactory {
	
	@Autowired
	private MotherTransmissionService motherTransmissionService;
	
	@Autowired
	private ChildTransmissionService childTransmissionService;
	
	private TransmissionServices transmissionServices;
	
	private TransmissionServices getTransmissionService(String transmissionServiceType) {
		if (transmissionServiceType.equals("HouseHold"))
			transmissionServices = childTransmissionService;
		else if (transmissionServiceType.equals("Elco"))
			transmissionServices = childTransmissionService;
		else if (transmissionServiceType.equals("Mother"))
			transmissionServices = motherTransmissionService;
		else if (transmissionServiceType.equals("Child"))
			transmissionServices = childTransmissionService;
		return transmissionServices;
		
	}
	
	public TransmissionServices getTransmissionType(String transmissionType) {
		return getTransmissionService(transmissionType);
	}
	
}
