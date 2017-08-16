/*package org.opensrp.dashboard.etl.transmission.service;

import java.io.File;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.opensrp.dashboard.etl.repository.HouseholdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-application-context.xml",
        "classpath:org/opensrp/dashboard/config/entity-context.xml"

})
@Ignore
public class HouseholdTransferServiceTest {
	
	private HouseholdTransmissionService householdTransmissionService = HouseholdTransmissionService.getInstance();
	
	@Autowired
	private HouseholdRepository householdRepository;
	
	@Before
	public void setUp() throws Exception {
		System.err.println("householdRepository;" + householdRepository);
	}
	
	@Test
	public void testShouldCreateUser() throws JsonParseException, JsonMappingException, IOException, JSONException {
		JsonNode file = null;
		ObjectMapper mapper = new ObjectMapper();
		String filePath = "assets/test/household.json";
		
		System.err.println("trtr:" + householdTransmissionService);
		file = mapper.readValue(new File(filePath), JsonNode.class);
		//String data = file.toString().replace("\"", "\\\"");
		System.err.println("DD:" + file.toString());
		householdTransmissionService.sentDataToConvert(new JSONObject(file.toString()));
		//System.err.println("Data:" + file.toString());
	}
}
*/
