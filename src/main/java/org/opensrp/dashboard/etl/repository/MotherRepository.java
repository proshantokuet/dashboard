package org.opensrp.dashboard.etl.repository;

import org.hibernate.SessionFactory;
import org.opensrp.dashboard.etl.entity.MotherEntity;
import org.opensrp.dashboard.etl.interfaces.RegisterRepository;

public class MotherRepository implements RegisterRepository<MotherEntity> {
	
	public MotherRepository() {
		// TODO Auto-generated constructor stub
	}
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	@Override
	public void save(MotherEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete(MotherEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(MotherEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public MotherEntity findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
