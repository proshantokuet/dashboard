package org.opensrp.dashboard.etl.transmission.listener;

import java.util.List;

import org.ektorp.ViewResult;
import org.ektorp.ViewResult.Row;
import org.json.JSONException;
import org.opensrp.dashboard.etl.repository.SourceDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@EnableScheduling
public class TransmissionListener {
	
	@Autowired
	private SourceDBRepository sourceDBRepository;
	
	@Scheduled(fixedDelay = 5000)
	public void dataListener() throws JSONException {
		ViewResult vr = sourceDBRepository.allData(0);
		List<Row> rows = vr.getRows();
		
		/*for (Row row : rows) {
			JSONObject jsonData = new JSONObject(row.getValue());
			TransmissionServiceFactory.getTransmissionType(jsonData.getString("type")).sentDataToConvert(jsonData);
			
		}*/
		
		System.out.println("IIIIIIIIIIIIIIIIIIIIIIIIII:");
	}
	
}
