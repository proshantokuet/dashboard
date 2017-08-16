package org.opensrp.dashboard.etl.repository;

import org.hibernate.SessionFactory;
import org.opensrp.dashboard.etl.entity.ENCCEntity;
import org.opensrp.dashboard.etl.interfaces.RegisterRepository;

public class ENCCRepository implements RegisterRepository<ENCCEntity> {
	
	public ENCCRepository() {
		// TODO Auto-generated constructor stub
	}
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
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
	
}
