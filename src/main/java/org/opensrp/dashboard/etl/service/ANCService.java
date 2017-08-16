package org.opensrp.dashboard.etl.service;

import org.opensrp.dashboard.etl.entity.ANCEntity;
import org.opensrp.dashboard.etl.interfaces.RegisterService;
import org.opensrp.dashboard.etl.repository.ANCRepository;

public class ANCService implements RegisterService<ANCEntity, ANCRepository> {
	
	private ANCRepository ancRepository;
	
	public ANCService() {
		// TODO Auto-generated constructor stub
	}
	
	public void setAncRepository(ANCRepository ancRepository) {
		this.ancRepository = ancRepository;
	}
	
	@Override
	public void save(ANCEntity t, ANCRepository x) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete(ANCEntity t, ANCRepository x) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(ANCEntity t, ANCRepository x) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public ANCEntity findById(int id, ANCRepository x) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public ANCEntity findByCaseId(String caseId, ANCRepository x) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
