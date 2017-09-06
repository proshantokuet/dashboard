/**
 * 
 */
package org.opensrp.dashboard.etl.data.converter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;
import org.opensrp.dashboard.etl.entity.PNCEntity;
import org.opensrp.dashboard.etl.service.PNCService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author sohel
 */
public class MotherToPNCConverter {
	
	private static final String PNC = "PNC";
	
	private static final String PNC_Visit_One = "pncVisitOne";
	
	private static final String PNC_Visit_Two = "pncVisitTwo";
	
	private static final String PNC_Visit_Three = "pncVisitThree";
	
	private ArrayList<String> pncKeys = new ArrayList<String>();
	
	private Map<String, String> pncVisitKeyMap = new HashMap<String, String>();
	
	@Autowired
	private PNCEntity pncEntity;
	
	@Autowired
	private PNCService pncService;
	
	private void setPNCKeys() {
		pncKeys.add("pncName");
		
		pncKeys.add("FWPNCDATE");
		
		pncKeys.add("pnc_current_formStatus");
		
		pncKeys.add("FWCONFIRMATION");
		
		pncKeys.add("FWPNCREMSTS");
		
		pncKeys.add("FWPNCINT");
		
		pncKeys.add("user_type");
		
		pncKeys.add("external_user_ID");
		
		pncKeys.add("relationalid");
		
		pncKeys.add("GOBHHID");
		
		pncKeys.add("FW_JiVitAHHID");
		
		pncKeys.add("FW_WOMBID");
		
		pncKeys.add("FW_WOMNID");
		
		pncKeys.add("FW_WOMFNAME");
		
		pncKeys.add("FW_HUSNAME");
		pncKeys.add("FWBNFDTOO");
		pncKeys.add("FWBNFSTS");
		pncKeys.add("REFERENCE_DATE");
		pncKeys.add("start");
		pncKeys.add("end");
		
		pncKeys.add("clientVersion");
		
		pncKeys.add("received_time");
		
		pncKeys.add("timeStamp");
	}
	
	private Map<String, String> getpncVisitKeys(String visitNo) {
		for (String pncKey : pncKeys) {
			if (pncKey.toUpperCase().contains(PNC)) {
				String pnc = pncKey.substring(pncKey.toUpperCase().indexOf(PNC), pncKey.toUpperCase().indexOf(PNC) + 3);
				pncVisitKeyMap.put(pncKey, pncKey.replaceFirst(pnc, pnc.concat(visitNo)));
			} else {
				pncVisitKeyMap.put(pncKey, pncKey);
			}
		}
		return pncVisitKeyMap;
	}
	
	public void pncVisitSave(JSONObject mdoc) throws JSONException {
		setPNCKeys();
		try {
			if (mdoc.has(PNC_Visit_One) && mdoc.isNull(PNC_Visit_One) || mdoc.getJSONObject(PNC_Visit_One).length() == 0) {
				System.out.println("pncVisitOne does not exist caseId:" + mdoc.getString("caseId"));
			} else {
				System.out.println("pncVisitOne  exist caseId:" + mdoc.getString("caseId"));
				JSONObject pncVisitOne = new JSONObject(mdoc.getString(PNC_Visit_One));
				Map<String, String> pncVisitKeyMap = new HashMap<String, String>();
				pncVisitKeyMap = getpncVisitKeys("1");
				pncEntity.setPncName(PNC_Visit_One);
				pncService.save(convertTopncEntity(pncVisitOne, pncVisitKeyMap));
				System.out.println("pncVisitOne saved successfully entity: " + pncEntity.toString());
			}
			
			if (mdoc.has(PNC_Visit_Two) && mdoc.isNull(PNC_Visit_Two) || mdoc.getJSONObject(PNC_Visit_Two).length() == 0) {
				System.out.println("pncVisitTwo does not exist caseId:" + mdoc.getString("caseId"));
			} else {
				System.out.println("pncVisitTwo  exist caseId:" + mdoc.getString("caseId"));
				JSONObject pncVisitOne = new JSONObject(mdoc.getString(PNC_Visit_Two));
				Map<String, String> pncVisitKeyMap = new HashMap<String, String>();
				pncVisitKeyMap = getpncVisitKeys("2");
				pncEntity.setPncName(PNC_Visit_Two);
				pncService.save(convertTopncEntity(pncVisitOne, pncVisitKeyMap));
				System.out.println("pncVisitTwo saved successfully entity: " + pncEntity.toString());
			}
			
			if (mdoc.has(PNC_Visit_Three) && mdoc.isNull(PNC_Visit_Three)
			        || mdoc.getJSONObject(PNC_Visit_Three).length() == 0) {
				System.out.println("pncVisitThree does not exist caseId:" + mdoc.getString("caseId"));
			} else {
				System.out.println("pncVisitThree  exist caseId:" + mdoc.getString("caseId"));
				JSONObject pncVisit = new JSONObject(mdoc.getString(PNC_Visit_Three));
				Map<String, String> pncVisitKeyMap = new HashMap<String, String>();
				pncVisitKeyMap = getpncVisitKeys("3");
				pncEntity.setPncName(PNC_Visit_Three);
				pncService.save(convertTopncEntity(pncVisit, pncVisitKeyMap));
				System.out.println("pncVisitThree saved successfully entity: " + pncEntity.toString());
			}
			
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(mdoc.getString("caseId"));
			e.printStackTrace();
		}
		
	}
	
	private PNCEntity convertTopncEntity(JSONObject pncVisit, Map<String, String> pncVisitKeyMap) {
		try {
			pncEntity.setFWPNCDATE(pncVisit.getString(pncVisitKeyMap.get("FWPNCDATE")));
			pncEntity.setPnc_current_formStatus(pncVisit.getString(pncVisitKeyMap.get("pnc_current_formStatus")));
			//pncEntity.setFWCONFIRMATION(pncVisit.getString(pncVisitKeyMap.get("FWCONFIRMATION")));
			pncEntity.setFWPNCREMSTS(pncVisit.getString(pncVisitKeyMap.get("FWPNCREMSTS")));
			//pncEntity.setFWPNCINT(pncVisit.getString(pncVisitKeyMap.get("FWPNCINT")));
			pncEntity.setUser_type(pncVisit.getString(pncVisitKeyMap.get("user_type")));
			pncEntity.setExternal_user_ID(pncVisit.getString(pncVisitKeyMap.get("external_user_ID")));
			pncEntity.setRelationalid(pncVisit.getString(pncVisitKeyMap.get("relationalid")));
			pncEntity.setFW_GOBHHID(pncVisit.getString(pncVisitKeyMap.get("GOBHHID")));
			//pncEntity.setFW_JiVitAHHID(pncVisit.getString(pncVisitKeyMap.get("FW_JiVitAHHID")));
			//pncEntity.setFW_WOMBID(pncVisit.getString(pncVisitKeyMap.get("FW_WOMBID")));
			//pncEntity.setFW_WOMNID(pncVisit.getString(pncVisitKeyMap.get("FW_WOMNID")));
			//pncEntity.setFW_WOMFNAME(pncVisit.getString(pncVisitKeyMap.get("FW_WOMFNAME")));
			//pncEntity.setFW_HUSNAME(pncVisit.getString(pncVisitKeyMap.get("FW_HUSNAME")));
			//pncEntity.setFWBNFDTOO(pncVisit.getString(pncVisitKeyMap.get("FWBNFDTOO")));
			//pncEntity.setFWBNFSTS(pncVisit.getString(pncVisitKeyMap.get("FWBNFSTS")));
			//pncEntity.setREFERENCE_DATE(pncVisit.getString(pncVisitKeyMap.get("REFERENCE_DATE")));
			pncEntity.setSTART_DATE(pncVisit.getString(pncVisitKeyMap.get("start")));
			//pncEntity.setEND_DATE(pncVisit.getString(pncVisitKeyMap.get("end")));
			pncEntity.setClientVersion(Long.parseLong(pncVisit.getString(pncVisitKeyMap.get("clientVersion"))));
			pncEntity.setReceived_time(pncVisit.getString(pncVisitKeyMap.get("received_time")));
			pncEntity.setTimeStamp(Long.parseLong(pncVisit.getString(pncVisitKeyMap.get("timeStamp"))));
		}
		catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pncEntity;
		
	}
	
}
