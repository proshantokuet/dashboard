package org.opensrp.dashboard.etl.repository;

import org.hibernate.SessionFactory;
import org.opensrp.dashboard.etl.entity.BNFEntity;
import org.opensrp.dashboard.etl.interfaces.RegisterRepository;

public class BNFRepository implements RegisterRepository<BNFEntity> {
	
	public BNFRepository() {
		// TODO Auto-generated constructor stub
	}
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	@Override
	public void save(BNFEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete(BNFEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(BNFEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public BNFEntity findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
