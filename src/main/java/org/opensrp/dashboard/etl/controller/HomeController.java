package org.opensrp.dashboard.etl.controller;

import org.opensrp.dashboard.etl.entity.HouseholdEntity;
import org.opensrp.dashboard.etl.service.HouseholdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class HomeController {	

	
		
	public HouseholdService householdService ;
	
	public HomeController() {
		// TODO Auto-generated constructor stub
	}

	
	public void setHouseholdService(HouseholdService householdService) {
		this.householdService = householdService;
	}



	@RequestMapping("/")
	public String showHome(){
		//logger.debug("This is home page");
		HouseholdEntity householdEntity = new HouseholdEntity();
		householdEntity.setName("jsss");
		householdService.save(householdEntity);
		return "home";
	}
	
	
	
}
