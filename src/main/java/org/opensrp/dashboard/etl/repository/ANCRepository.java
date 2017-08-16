package org.opensrp.dashboard.etl.repository;

import org.hibernate.SessionFactory;
import org.opensrp.dashboard.etl.entity.ANCEntity;
import org.opensrp.dashboard.etl.interfaces.RegisterRepository;

public class ANCRepository implements RegisterRepository<ANCEntity> {
	
	public ANCRepository() {
		// TODO Auto-generated constructor stub
	}
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
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
	
}
