package org.opensrp.dashboard.etl.data.converter;

import org.json.JSONException;
import org.json.JSONObject;
import org.opensrp.dashboard.etl.entity.MotherEntity;
import org.opensrp.dashboard.etl.interfaces.DataConverterService;
import org.springframework.beans.factory.annotation.Autowired;

public class MotherDataConverterService implements DataConverterService<JSONObject, MotherEntity> {
	
	private MotherEntity motherEntity;
	
	@Autowired
	public void setMotherEntity(MotherEntity motherEntity) {
		this.motherEntity = motherEntity;
	}
	
	private MotherDataConverterService() {
		// TODO Auto-generated constructor stub
	}
	
	private static final MotherDataConverterService INSTANCE = new MotherDataConverterService();
	
	public MotherDataConverterService getInstance() {
		return INSTANCE;
		
	}
	
	@Override
	public MotherEntity convertData(JSONObject doc) throws JSONException {
		
		motherEntity.setBirthDate(doc.getString("FWBIRTHDATE"));
		
		motherEntity.setCaseId(doc.getString("caseId"));
		motherEntity.setClientVersion(doc.getLong("clientVersion"));
		//motherEntity.setCountry(doc.getString("FWWOMCOUNTRY"));
		//motherEntity.setDistrict(doc.getString("FWWOMDISTRICT"));
		//motherEntity.setDivision(doc.getString("FWWOMDIVISION"));
		
		motherEntity.setEnd(doc.getString("END"));
		//motherEntity.setExternalUserId(doc.getString("external_user_ID"));
		motherEntity.setFirstName(doc.getString("mother_first_name"));
		//motherEntity.setFormName(doc.getString("form_name"));
		
		motherEntity.setInstantId(doc.getString("INSTANCEID"));
		
		motherEntity.setLocationId(doc.getString("LOCATIONID"));
		motherEntity.setMauzaPara(doc.getString("FWWOMMAUZA_PARA"));
		
		motherEntity.setProvider(doc.getString("PROVIDERID"));
		
		motherEntity.setStart(doc.getString("START"));
		motherEntity.setSubmissionTime(doc.getLong("SUBMISSIONDATE"));
		motherEntity.setSubunit(doc.getString("FWWOMSUBUNIT"));
		motherEntity.setToday(doc.getString("TODAY"));
		motherEntity.setUnion(doc.getString("FWWOMUNION"));
		motherEntity.setUpazila(doc.getString("FWWOMUPAZILLA"));
		
		motherEntity.setWard(doc.getString("FWWOMWARD"));
		motherEntity.setMotherGOBHHID(doc.getString("mother_gobhhid"));
		motherEntity.setMotherJIVIHID(doc.getString("mother_jivhhid"));
		motherEntity.setMotherHusname(doc.getString("mother_husname"));
		motherEntity.setMotherWomNID(doc.getString("mother_wom_nid"));
		motherEntity.setMotherWomBID(doc.getString("mother_wom_bid"));
		motherEntity.setMotherWomAge(doc.getString("mother_wom_age"));
		
		JSONObject details = new JSONObject(doc.getString("details"));
		motherEntity.setMotherValid(details.getString("mother_valid"));
		motherEntity.setFWVG(doc.getString("FWVG"));
		motherEntity.setFWHRP(doc.getString("FWHRP"));
		motherEntity.setFWHR_PSR(doc.getString("FWHR_PSR"));
		motherEntity.setFWFLAGVALUE(doc.getString("FWFLAGVALUE"));
		motherEntity.setFWSORTVALUE(doc.getString("FWSORTVALUE"));
		motherEntity.setMotherWomLMP(doc.getString("mother_wom_lmp"));
		motherEntity.setRelationalId(doc.getString("relationalid"));
		motherEntity.setIsClosed(doc.getString("isClosed"));
		return null;
	}
	
	@Override
	public void sendData(MotherEntity v) {
		// TODO Auto-generated method stub
		
	}
	
}
