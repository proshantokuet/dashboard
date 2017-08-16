package org.opensrp.dashboard.etl.service;

import org.opensrp.dashboard.etl.entity.PSRFEntity;
import org.opensrp.dashboard.etl.interfaces.RegisterService;
import org.opensrp.dashboard.etl.repository.PSRFRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PSRFService implements RegisterService<PSRFEntity, PSRFRepository> {
	
	private PSRFRepository psrfRepository;
	
	public PSRFService() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public void setPsrfRepository(PSRFRepository psrfRepository) {
		this.psrfRepository = psrfRepository;
	}
	
	@Override
	public void save(PSRFEntity t, PSRFRepository x) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete(PSRFEntity t, PSRFRepository x) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(PSRFEntity t, PSRFRepository x) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public PSRFEntity findById(int id, PSRFRepository x) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public PSRFEntity findByCaseId(String caseId, PSRFRepository x) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
