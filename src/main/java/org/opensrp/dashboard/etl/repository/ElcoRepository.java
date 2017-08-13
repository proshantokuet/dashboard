package org.opensrp.dashboard.etl.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.opensrp.dashboard.etl.entity.ElcoEntity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("elcoRepository")
public class ElcoRepository {
	
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
}
