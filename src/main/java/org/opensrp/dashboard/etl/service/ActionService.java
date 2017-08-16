package org.opensrp.dashboard.etl.service;

import org.opensrp.dashboard.etl.entity.ActionEntity;
import org.opensrp.dashboard.etl.interfaces.RegisterService;
import org.opensrp.dashboard.etl.repository.ActionRepository;

public class ActionService implements RegisterService<ActionEntity, ActionRepository> {
	
	private ActionRepository actionRepository;
	
	public ActionService() {
		// TODO Auto-generated constructor stub
	}
	
	public void setActionRepository(ActionRepository actionRepository) {
		this.actionRepository = actionRepository;
	}
	
	@Override
	public void save(ActionEntity t, ActionRepository x) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete(ActionEntity t, ActionRepository x) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(ActionEntity t, ActionRepository x) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public ActionEntity findById(int id, ActionRepository x) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public ActionEntity findByCaseId(String caseId, ActionRepository x) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
