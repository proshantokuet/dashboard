package org.opensrp.dashboard.etl.repository;

import org.hibernate.SessionFactory;
import org.opensrp.dashboard.etl.entity.ActionEntity;
import org.opensrp.dashboard.etl.interfaces.RegisterRepository;

public class ActionRepository implements RegisterRepository<ActionEntity> {
	
	public ActionRepository() {
		// TODO Auto-generated constructor stub
	}
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	@Override
	public void save(ActionEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete(ActionEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(ActionEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public ActionEntity findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
