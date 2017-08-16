package org.opensrp.dashboard.etl.repository;

import org.hibernate.SessionFactory;
import org.opensrp.dashboard.etl.entity.ChildEntity;
import org.opensrp.dashboard.etl.interfaces.RegisterRepository;

public class ChildRepository implements RegisterRepository<ChildEntity> {
	
	public ChildRepository() {
		// TODO Auto-generated constructor stub
	}
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	@Override
	public void save(ChildEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete(ChildEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(ChildEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public ChildEntity findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
