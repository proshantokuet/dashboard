package org.opensrp.dashboard.etl.service;

import org.opensrp.dashboard.etl.entity.ElcoEntity;
import org.opensrp.dashboard.etl.interfaces.RegisterService;
import org.opensrp.dashboard.etl.repository.ElcoRepository;

public class ElcoService implements RegisterService<ElcoEntity> {
	
	private ElcoRepository elcoRepository;
	
	public ElcoService() {
		// TODO Auto-generated constructor stub
	}
	
	public void setElcoRepository(ElcoRepository elcoRepository) {
		this.elcoRepository = elcoRepository;
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
