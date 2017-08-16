package org.opensrp.dashboard.etl.service;

import org.opensrp.dashboard.etl.entity.ChildEntity;
import org.opensrp.dashboard.etl.interfaces.RegisterService;
import org.opensrp.dashboard.etl.repository.ChildRepository;

public class ChildService implements RegisterService<ChildEntity, ChildRepository> {
	
	private ChildRepository childRepository;
	
	public ChildService() {
		// TODO Auto-generated constructor stub
	}
	
	public void setChildRepository(ChildRepository childRepository) {
		this.childRepository = childRepository;
	}
	
	@Override
	public void save(ChildEntity t, ChildRepository x) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete(ChildEntity t, ChildRepository x) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(ChildEntity t, ChildRepository x) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public ChildEntity findById(int id, ChildRepository x) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public ChildEntity findByCaseId(String caseId, ChildRepository x) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
