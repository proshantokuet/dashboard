package org.opensrp.dashboard.etl.controller;

import org.opensrp.dashboard.etl.entity.HouseholdEntity;
import org.opensrp.dashboard.etl.repository.SourceDBRepository;
import org.opensrp.dashboard.etl.service.HouseholdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@Autowired
	private SourceDBRepository sourceDBRepository;
	
	public HouseholdService householdService;
	
	public HomeController() {
		// TODO Auto-generated constructor stub
	}
	
	public void setHouseholdService(HouseholdService householdService) {
		this.householdService = householdService;
	}
	
	@RequestMapping("/")
	public String showHome() {
		//logger.debug("This is home page");
		HouseholdEntity householdEntity = HouseholdEntity.getInstance();
		householdEntity.setCaseId("jjj");
		//householdService.save(householdEntity);
		
		/*SourceDBEntity test = new SourceDBEntity();
		//test.setBody("voduu");
		test.setId("idi");
		sourceDBRepository.add(test);
		ViewResult vr = sourceDBRepository.allData(0);
		System.err.println("" + vr.getSize());*/
		return "home";
	}
	
}
