package org.opensrp.dashboard.etl.service;

import org.opensrp.dashboard.etl.entity.MarkerEntity;
import org.opensrp.dashboard.etl.interfaces.RegisterService;
import org.opensrp.dashboard.etl.repository.MarkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MarkerService implements RegisterService<MarkerEntity> {
	
	private MarkerRepository markerRepository;
	
	public MarkerService() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	@Qualifier
	public void setMarkerRepository(MarkerRepository markerRepository) {
		this.markerRepository = markerRepository;
	}
	
	@Override
	public void save(MarkerEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete(MarkerEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(MarkerEntity t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public MarkerEntity findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
