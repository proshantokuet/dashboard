package org.opensrp.dashboard.etl.transmission.service;

import org.json.JSONException;
import org.json.JSONObject;
import org.opensrp.dashboard.etl.data.converter.HouseholdDataConverterService;
import org.opensrp.dashboard.etl.entity.HouseholdEntity;
import org.opensrp.dashboard.etl.interfaces.TransmissionService;
import org.opensrp.dashboard.etl.repository.HouseholdRepository;
import org.opensrp.dashboard.etl.service.HouseholdService;

public class HouseholdTransmissionService implements TransmissionService<HouseholdEntity, HouseholdRepository, HouseholdService> {
	
	private HouseholdTransmissionService() {
		// TODO Auto-generated constructor stub
	}
	
	private static final HouseholdTransmissionService INSTANCE = new HouseholdTransmissionService();
	
	public static HouseholdTransmissionService getInstance() {
		return INSTANCE;
	}
	
	@Override
	public HouseholdEntity sentDataToConvert(JSONObject doc, HouseholdRepository householdRepository,
	                                         HouseholdService householdService) throws JSONException {
		System.err.println("householdRepositoryff:" + householdRepository);
		return HouseholdDataConverterService.getInstance().convertData(doc, householdRepository, householdService);
		
	}
	
}
