package org.opensrp.dashboard.etl.service;

import org.opensrp.dashboard.etl.entity.ENCCEntity;
import org.opensrp.dashboard.etl.interfaces.RegisterService;
import org.opensrp.dashboard.etl.repository.ENCCRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ENCCService implements RegisterService<ENCCEntity> {
	
	@Autowired
	private ENCCRepository enccRepository;
	
	public ENCCService() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void save(ENCCEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete(ENCCEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(ENCCEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public ENCCEntity findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public ENCCEntity findByCaseId(String caseId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
