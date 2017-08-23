package org.opensrp.dashboard.etl.service;

import org.opensrp.dashboard.etl.entity.ANCEntity;
import org.opensrp.dashboard.etl.interfaces.RegisterService;
import org.opensrp.dashboard.etl.repository.ANCRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ANCService implements RegisterService<ANCEntity> {
	
	@Autowired
	private ANCRepository ancRepository;
	
	public ANCService() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void save(ANCEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete(ANCEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(ANCEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public ANCEntity findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public ANCEntity findByCaseId(String caseId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
