package org.opensrp.dashboard.etl.service;

import org.opensrp.dashboard.etl.entity.PNCEntity;
import org.opensrp.dashboard.etl.interfaces.RegisterService;
import org.opensrp.dashboard.etl.repository.PNCRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PNCService implements RegisterService<PNCEntity, PNCRepository> {
	
	private PNCRepository pncRepository;
	
	public PNCService() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public void setPncRepository(PNCRepository pncRepository) {
		this.pncRepository = pncRepository;
	}
	
	@Override
	public void save(PNCEntity t, PNCRepository x) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete(PNCEntity t, PNCRepository x) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(PNCEntity t, PNCRepository x) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public PNCEntity findById(int id, PNCRepository x) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public PNCEntity findByCaseId(String caseId, PNCRepository x) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
