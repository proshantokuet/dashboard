package org.opensrp.dashboard.etl.service;



import org.opensrp.dashboard.etl.entity.HouseholdEntity;
import org.opensrp.dashboard.etl.repository.HouseholdRepository;
import org.springframework.transaction.annotation.Transactional;


public class HouseholdService {
	
	private HouseholdRepository householdRepository;
	
	public HouseholdService() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void setHouseholdRepository(HouseholdRepository householdRepository) {
		this.householdRepository = householdRepository;
	}

	@Transactional
	public void save(HouseholdEntity entity) {
		System.err.println("householdRepository;"+householdRepository);
		householdRepository.addHousehold(entity);
		
	}
	@Transactional
	public void delete(HouseholdEntity entity) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	public void update(HouseholdEntity entity) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	public HouseholdEntity findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
