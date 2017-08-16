package org.opensrp.dashboard.etl.service;

import javax.transaction.Transactional;

import org.opensrp.dashboard.etl.entity.HouseholdEntity;
import org.opensrp.dashboard.etl.interfaces.RegisterService;
import org.opensrp.dashboard.etl.repository.HouseholdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseholdService implements RegisterService<HouseholdEntity, HouseholdRepository> {
	
	private HouseholdRepository householdRepository;
	
	public HouseholdService() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public void setHouseholdRepository(HouseholdRepository householdRepository) {
		this.householdRepository = householdRepository;
	}
	
	@Transactional
	@Override
	public void save(HouseholdEntity entity, HouseholdRepository householdRepository) {
		
		householdRepository.save(entity);
		
	}
	
	private static final HouseholdService INSTANCE = new HouseholdService();
	
	public static HouseholdService getInstance() {
		return INSTANCE;
		
	}
	
	@Override
	public void delete(HouseholdEntity t, HouseholdRepository x) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(HouseholdEntity t, HouseholdRepository x) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public HouseholdEntity findById(int id, HouseholdRepository x) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public HouseholdEntity findByCaseId(String caseId, HouseholdRepository x) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
