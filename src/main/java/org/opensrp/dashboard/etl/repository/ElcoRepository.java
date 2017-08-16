package org.opensrp.dashboard.etl.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.opensrp.dashboard.etl.entity.ElcoEntity;
import org.opensrp.dashboard.etl.interfaces.RegisterRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("elcoRepository")
public class ElcoRepository implements RegisterRepository<ElcoEntity> {
	
	public ElcoRepository() {
		// TODO Auto-generated constructor stub
	}
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	public void addElco(ElcoEntity p) {
		Session session = this.sessionFactory.getCurrentSession();
		
		try {
			session.save(p);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Phone saved successfully, Phone Details=" + p);
	}
	
	@Override
	public void save(ElcoEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete(ElcoEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(ElcoEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public ElcoEntity findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
