package org.opensrp.dashboard.etl.transmission.listener;

import java.util.List;

import org.ektorp.ViewResult;
import org.ektorp.ViewResult.Row;
import org.json.JSONException;
import org.json.JSONObject;
import org.opensrp.dashboard.etl.entity.HouseholdEntity;
import org.opensrp.dashboard.etl.repository.HouseholdRepository;
import org.opensrp.dashboard.etl.repository.SourceDBRepository;
import org.opensrp.dashboard.etl.service.HouseholdService;
import org.opensrp.dashboard.etl.transmission.service.TransmissionServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

@Service
@EnableScheduling
@Configuration
@EnableAsync
public class TransmissionListener {
	
	@Autowired
	private SourceDBRepository sourceDBRepository;
	
	@Autowired
	private HouseholdRepository householdRepository;
	
	private HouseholdService householdService;
	
	@Autowired
	public void setHouseholdService(HouseholdService householdService) {
		this.householdService = householdService;
	}
	
	@SuppressWarnings("unchecked")
    public void dataListener() throws JSONException {
		System.out.println("IIIIIIIIIIIIIIIIIIIIIIIIII:" + householdService);
		
		HouseholdEntity householdEntity = HouseholdEntity.getInstance();
		householdEntity.setCaseId("jjj");
		//householdService.save(householdEntity);
		ViewResult vr = sourceDBRepository.allData(0);
		List<Row> rows = vr.getRows();
		
		for (Row row : rows) {
			JSONObject jsonData = new JSONObject(row.getValue());
			
			TransmissionServiceFactory.getTransmissionType(jsonData.getString("type")).sentDataToConvert(jsonData,
			    householdRepository, householdService);
			
		}
		
	}
}
