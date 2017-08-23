package org.opensrp.dashboard.etl.service;

import javax.transaction.Transactional;

import org.opensrp.dashboard.etl.entity.MotherEntity;
import org.opensrp.dashboard.etl.interfaces.RegisterService;
import org.opensrp.dashboard.etl.repository.MotherRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class MotherService implements RegisterService<MotherEntity> {
	
	@Autowired
	private MotherRepository motherRepository;
	
	public MotherService() {
		
	}
	
	@Transactional
	@Override
	public void save(MotherEntity motherEntity) {
		System.out.println("Class:MotherService, Method:save");
		motherRepository.save(motherEntity);
		
	}
	
	@Override
	public void delete(MotherEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(MotherEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public MotherEntity findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public MotherEntity findByCaseId(String caseId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
