package org.opensrp.dashboard.etl.service;

import javax.transaction.Transactional;

import org.opensrp.dashboard.etl.entity.HouseholdEntity;
import org.opensrp.dashboard.etl.interfaces.RegisterService;
import org.opensrp.dashboard.etl.repository.HouseholdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseholdService implements RegisterService<HouseholdEntity> {
	
	@Autowired
	private HouseholdRepository householdRepository;
	
	public HouseholdService() {
		// TODO Auto-generated constructor stub
	}
	
	@Transactional
	@Override
	public void save(HouseholdEntity entity) {
		
		// TODO if document already transfered then update with document information
		householdRepository.save(entity);
		
	}
	
	@Override
	public void delete(HouseholdEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(HouseholdEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public HouseholdEntity findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public HouseholdEntity findByCaseId(String caseId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
