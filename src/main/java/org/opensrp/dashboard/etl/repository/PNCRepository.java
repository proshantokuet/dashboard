package org.opensrp.dashboard.etl.repository;

import org.hibernate.SessionFactory;
import org.opensrp.dashboard.etl.entity.PNCEntity;
import org.opensrp.dashboard.etl.interfaces.RegisterRepository;

public class PNCRepository implements RegisterRepository<PNCEntity> {
	
	public PNCRepository() {
		// TODO Auto-generated constructor stub
	}
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	@Override
	public void save(PNCEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete(PNCEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(PNCEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public PNCEntity findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
