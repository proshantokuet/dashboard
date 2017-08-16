package org.opensrp.dashboard.etl.service;

import org.opensrp.dashboard.etl.entity.MotherEntity;
import org.opensrp.dashboard.etl.interfaces.RegisterService;
import org.opensrp.dashboard.etl.repository.MotherRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class MotherService implements RegisterService<MotherEntity, MotherRepository> {
	
	private MotherRepository motherRepository;
	
	public MotherService() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public void setMotherRepository(MotherRepository motherRepository) {
		this.motherRepository = motherRepository;
	}
	
	@Override
	public void save(MotherEntity t, MotherRepository x) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete(MotherEntity t, MotherRepository x) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(MotherEntity t, MotherRepository x) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public MotherEntity findById(int id, MotherRepository x) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public MotherEntity findByCaseId(String caseId, MotherRepository x) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
