package org.opensrp.dashboard.etl.service;

import org.opensrp.dashboard.etl.entity.BNFEntity;
import org.opensrp.dashboard.etl.interfaces.RegisterService;
import org.opensrp.dashboard.etl.repository.BNFRepository;

public class BNFService implements RegisterService<BNFEntity, BNFRepository> {
	
	private BNFRepository bnfRepository;
	
	public BNFService() {
		// TODO Auto-generated constructor stub
	}
	
	public void setBnfRepository(BNFRepository bnfRepository) {
		this.bnfRepository = bnfRepository;
	}
	
	@Override
	public void save(BNFEntity t, BNFRepository x) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete(BNFEntity t, BNFRepository x) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(BNFEntity t, BNFRepository x) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public BNFEntity findById(int id, BNFRepository x) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public BNFEntity findByCaseId(String caseId, BNFRepository x) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
