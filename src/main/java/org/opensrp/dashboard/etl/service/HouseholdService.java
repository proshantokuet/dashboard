package org.opensrp.dashboard.etl.service;

import org.json.JSONObject;
import org.opensrp.dashboard.etl.interfaces.RegisterService;
import org.opensrp.dashboard.etl.repository.HouseholdRepository;

public class HouseholdService implements RegisterService<JSONObject> {
	
	private HouseholdRepository householdRepository;
	
	public HouseholdService() {
		// TODO Auto-generated constructor stub
	}
	
	public void setHouseholdRepository(HouseholdRepository householdRepository) {
		this.householdRepository = householdRepository;
	}
	
	@Override
	public void save(JSONObject t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete(JSONObject t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(JSONObject t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public JSONObject findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
