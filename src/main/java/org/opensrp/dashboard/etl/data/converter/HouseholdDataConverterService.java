package org.opensrp.dashboard.etl.data.converter;

import org.json.JSONException;
import org.json.JSONObject;
import org.opensrp.dashboard.etl.entity.HouseholdEntity;
import org.opensrp.dashboard.etl.repository.HouseholdRepository;
import org.opensrp.dashboard.etl.service.HouseholdService;
import org.springframework.stereotype.Service;

@Service
public class HouseholdDataConverterService {
	
	private HouseholdDataConverterService() {
		// TODO Auto-generated constructor stub
	}
	
	//public HouseholdService householdService = HouseholdService.getInstance();
	
	/*@Autowired
	private HouseholdRepository householdRepository;
	*/
	private HouseholdEntity householdEntity = HouseholdEntity.getInstance();
	
	private static final HouseholdDataConverterService INSTANCE = new HouseholdDataConverterService();
	
	public static HouseholdDataConverterService getInstance() {
		return INSTANCE;
		
	}
	
	public HouseholdEntity convertData(JSONObject doc, HouseholdRepository householdRepository,
	                                   HouseholdService householdService) throws JSONException {
		//System.err.println("householdEntity:" + householdEntity);
		householdEntity.setBirthDate(doc.getString("FWHOHBIRTHDATE"));
		householdEntity.setCaseId(doc.getString("caseId"));
		householdEntity.setClientVersion(doc.getLong("clientVersion"));
		householdEntity.setCountry(doc.getString("FWCOUNTRY"));
		householdEntity.setCurrentFormStatus(doc.getString("current_formStatus"));
		
		householdEntity.setDistrict(doc.getString("FWDISTRICT"));
		householdEntity.setDivision(doc.getString("FWDIVISION"));
		householdEntity.setELCO(Integer.parseInt(doc.getString("ELCO")));
		
		householdEntity.setEnd(doc.getString("END"));
		householdEntity.setExternalUserId(doc.getString("external_user_ID"));
		householdEntity.setFirstName(doc.getString("FWHOHFNAME"));
		householdEntity.setFormName(doc.getString("form_name"));
		householdEntity.setFWNHHMBRNUM(doc.getString("FWNHHMBRNUM"));
		householdEntity.setFWNHHMWRA(doc.getString("FWNHHMWRA"));
		householdEntity.setGender(doc.getString("FWHOHGENDER"));
		householdEntity.setGOBHHID(doc.getString("FWGOBHHID"));
		householdEntity.setGps(doc.getString("FWNHHHGPS"));
		householdEntity.setInstantId(doc.getString("INSTANCEID"));
		householdEntity.setFWJIVHHID(doc.getString("FWJIVHHID"));
		householdEntity.setLastName(doc.getString("FWHOHLNAME"));
		householdEntity.setLocationId(doc.getString("LOCATIONID"));
		householdEntity.setMauzaPara(doc.getString("FWMAUZA_PARA"));
		//householdEntity.setMultimediaAttachments(houseHold.multimediaAttachments());
		householdEntity.setProvider(doc.getString("PROVIDERID"));
		householdEntity.setRegistrationDate(doc.getString("FWNHREGDATE"));
		householdEntity.setStart(doc.getString("START"));
		householdEntity.setSubmissionTime(doc.getLong("SUBMISSIONDATE"));
		householdEntity.setSubunit(doc.getString("FWSUBUNIT"));
		householdEntity.setToday(doc.getString("TODAY"));
		householdEntity.setUnion(doc.getString("FWUNION"));
		householdEntity.setUpazila(doc.getString("FWUPAZILLA"));
		householdEntity.setUserType(doc.getString("user_type"));
		householdEntity.setWard(doc.getString("FWWARD"));
		
		sendData(householdEntity, householdRepository, householdService);
		return householdEntity;
	}
	
	public void sendData(HouseholdEntity entity, HouseholdRepository householdRepository, HouseholdService householdService) {
		//System.err.println("householdRepositoryDOv:" + householdRepository);
		householdService.save(entity, householdRepository);
		// TODO Auto-generated method stub
		
	}
	
}
