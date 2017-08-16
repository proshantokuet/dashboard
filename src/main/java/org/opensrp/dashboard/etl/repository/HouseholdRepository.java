package org.opensrp.dashboard.etl.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.opensrp.dashboard.etl.entity.HouseholdEntity;
import org.springframework.stereotype.Repository;

@Repository
public class HouseholdRepository {
	
	public HouseholdRepository() {
		// TODO Auto-generated constructor stub
	}
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	public void save(HouseholdEntity entity) {
		
		Session session = this.sessionFactory.getCurrentSession();
		System.err.println("dd: " + session + "+ entity:" + entity.toString());
		System.err.println("okkkkkkkkkkkkkkkkkk");
		try {
			session.save(entity);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void delete(HouseholdEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	public void update(HouseholdEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	public HouseholdEntity findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
