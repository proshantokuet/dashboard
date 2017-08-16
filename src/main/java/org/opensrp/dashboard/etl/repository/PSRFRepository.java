package org.opensrp.dashboard.etl.repository;

import org.hibernate.SessionFactory;
import org.opensrp.dashboard.etl.entity.PSRFEntity;
import org.opensrp.dashboard.etl.interfaces.RegisterRepository;

public class PSRFRepository implements RegisterRepository<PSRFEntity> {
	
	public PSRFRepository() {
		// TODO Auto-generated constructor stub
	}
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	@Override
	public void save(PSRFEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete(PSRFEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(PSRFEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public PSRFEntity findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
