/**
 * 
 */
package org.opensrp.dashboard.etl.data.converter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;
import org.opensrp.dashboard.etl.entity.ANCEntity;
import org.opensrp.dashboard.etl.service.ANCService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author sohel
 */
public class MotherToANCConverter {
	
	private static final String ANC = "ANC";
	
	private static final String ANC_Visit_One = "ancVisitOne";
	
	private static final String ANC_Visit_Two = "ancVisitTwo";
	
	private static final String ANC_Visit_Three = "ancVisitThree";
	
	private static final String ANC_Visit_Four = "ancVisitFour";
	
	private ArrayList<String> ancKeys = new ArrayList<String>();
	
	private Map<String, String> ancVisitKeyMap = new HashMap<String, String>();
	
	@Autowired
	private ANCEntity ancEntity;
	
	@Autowired
	private ANCService ancService;
	
	private void setANCKeys() {
		ancKeys.add("ancName");
		
		ancKeys.add("FWANCDATE");
		
		ancKeys.add("anc_current_formStatus");
		
		ancKeys.add("FWCONFIRMATION");
		
		ancKeys.add("FWGESTATIONALAGE");
		
		ancKeys.add("FWEDD");
		
		ancKeys.add("FWANCREMSTS");
		
		ancKeys.add("FWANCINT");
		
		ancKeys.add("FWANCKNWPRVDR");
		
		ancKeys.add("FWANCANM");
		
		ancKeys.add("FWANCHBP");
		
		ancKeys.add("FWANCDBT");
		
		ancKeys.add("FWANCTHY");
		
		ancKeys.add("FWANCPROB");
		
		ancKeys.add("FWANCHEAD");
		
		ancKeys.add("FWBPC1LOCOFDEL");
		
		ancKeys.add("FWBPC1ASSTLAB");
		
		ancKeys.add("FWBPC1TRNSPRT");
		
		ancKeys.add("FWBPC1BLDGRP");
		
		ancKeys.add("FWBPC1BLDDNR");
		
		ancKeys.add("FWBPC1FINARGMT");
		
		ancKeys.add("mauza");
		
		ancKeys.add("FWVG");
		
		ancKeys.add("FWHR_PSR");
		
		ancKeys.add("FWHRP");
		
		ancKeys.add("existing_ELCO");
		
		ancKeys.add("FWANCBLRVIS");
		
		ancKeys.add("FWANCSWLNG");
		
		ancKeys.add("FWANCCONVL");
		
		ancKeys.add("FWANCBLD");
		
		ancKeys.add("FWANCDS1");
		
		ancKeys.add("FWANCDS2");
		
		ancKeys.add("FWANCDS3");
		
		ancKeys.add("FWANCDS4");
		
		ancKeys.add("FWANCDS5");
		
		ancKeys.add("FWANCDS6");
		
		ancKeys.add("FWDANGERVALUE");
		
		ancKeys.add("FWNOTELIGIBLE");
		
		ancKeys.add("ELCO");
		
		ancKeys.add("FWHR_ANC");
		
		ancKeys.add("FWFLAGVALUE");
		
		ancKeys.add("FWSORTVALUE");
		
		ancKeys.add("user_type");
		
		ancKeys.add("external_user_ID");
		
		ancKeys.add("relationalid");
		
		ancKeys.add("GOBHHID");
		
		ancKeys.add("FW_JiVitAHHID");
		
		ancKeys.add("FW_WOMBID");
		
		ancKeys.add("FW_WOMNID");
		
		ancKeys.add("FW_WOMFNAME");
		
		ancKeys.add("FW_HUSNAME");
		
		ancKeys.add("MOTHER_REFERENCE_DATE");
		
		ancKeys.add("REFERENCE_DATE");
		
		ancKeys.add("start");
		
		ancKeys.add("end");
		
		ancKeys.add("clientVersion");
		
		ancKeys.add("received_time");
		
		ancKeys.add("timeStamp");
	}
	
	private Map<String, String> getANCVisitKeys(String visitNo) {
		for (String ancKey : ancKeys) {
			if (ancKey.toUpperCase().contains(ANC)) {
				String anc = ancKey.substring(ancKey.toUpperCase().indexOf(ANC), ancKey.toUpperCase().indexOf(ANC) + 3);
				ancVisitKeyMap.put(ancKey, ancKey.replaceFirst(anc, anc.concat(visitNo)));
			} else {
				ancVisitKeyMap.put(ancKey, ancKey);
			}
		}
		return ancVisitKeyMap;
	}
	
	public void ancVisitSave(JSONObject mdoc) throws JSONException {
		setANCKeys();
		try {
			
			if (mdoc.has(ANC_Visit_One) && mdoc.isNull(ANC_Visit_One) || mdoc.getJSONObject(ANC_Visit_One).length() == 0) {
				System.out.println("ancVisitOne does not exist caseId:" + mdoc.getString("caseId"));
			} else {
				System.out.println("ancVisitOne  exist caseId:" + mdoc.getString("caseId"));
				JSONObject ancVisitOne = new JSONObject(mdoc.getString(ANC_Visit_One));
				Map<String, String> ancVisitKeyMap = new HashMap<String, String>();
				ancVisitKeyMap = getANCVisitKeys("1");
				ancEntity.setAncName(ANC_Visit_One);
				ancService.save(convertToAncEntity(ancVisitOne, ancVisitKeyMap));
				System.out.println("ancVisitOne saved successfully entity: " + ancEntity.toString());
			}
			
			if (mdoc.has(ANC_Visit_Two) && mdoc.isNull(ANC_Visit_Two) || mdoc.getJSONObject(ANC_Visit_Two).length() == 0) {
				System.out.println("ancVisitTwo does not exist caseId:" + mdoc.getString("caseId"));
			} else {
				System.out.println("ancVisitTwo  exist caseId:" + mdoc.getString("caseId"));
				JSONObject ancVisitOne = new JSONObject(mdoc.getString(ANC_Visit_Two));
				Map<String, String> ancVisitKeyMap = new HashMap<String, String>();
				ancVisitKeyMap = getANCVisitKeys("2");
				ancEntity.setAncName(ANC_Visit_Two);
				ancService.save(convertToAncEntity(ancVisitOne, ancVisitKeyMap));
				System.out.println("ancVisitTwo saved successfully entity: " + ancEntity.toString());
			}
			
			if (mdoc.has(ANC_Visit_Three) && mdoc.isNull(ANC_Visit_Three)
			        || mdoc.getJSONObject(ANC_Visit_Three).length() == 0) {
				System.out.println("ancVisitThree does not exist caseId:" + mdoc.getString("caseId"));
			} else {
				System.out.println("ancVisitThree  exist caseId:" + mdoc.getString("caseId"));
				JSONObject ancVisit = new JSONObject(mdoc.getString(ANC_Visit_Three));
				Map<String, String> ancVisitKeyMap = new HashMap<String, String>();
				ancVisitKeyMap = getANCVisitKeys("3");
				ancEntity.setAncName(ANC_Visit_Three);
				ancService.save(convertToAncEntity(ancVisit, ancVisitKeyMap));
				System.out.println("ancVisitThree saved successfully entity: " + ancEntity.toString());
			}
			
			if (mdoc.has(ANC_Visit_Four) && mdoc.isNull(ANC_Visit_Four)
			        || mdoc.getJSONObject(ANC_Visit_Four).length() == 0) {
				System.out.println("ancVisitFour does not exist caseId:" + mdoc.getString("caseId"));
			} else {
				System.out.println("ancVisitFour  exist caseId:" + mdoc.getString("caseId"));
				JSONObject ancVisit = new JSONObject(mdoc.getString(ANC_Visit_Four));
				Map<String, String> ancVisitKeyMap = new HashMap<String, String>();
				ancVisitKeyMap = getANCVisitKeys("4");
				ancEntity.setAncName(ANC_Visit_Four);
				ancService.save(convertToAncEntity(ancVisit, ancVisitKeyMap));
				System.out.println("ancVisitFour saved successfully entity: " + ancEntity.toString());
			}
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(mdoc.getString("caseId"));
			e.printStackTrace();
		}
		
	}
	
	private ANCEntity convertToAncEntity(JSONObject ancVisit, Map<String, String> ancVisitKeyMap) {
		try {
			ancEntity.setFWANCDATE(ancVisit.getString(ancVisitKeyMap.get("FWANCDATE")));
			ancEntity.setAnc_current_formStatus(ancVisit.getString(ancVisitKeyMap.get("anc_current_formStatus")));
			ancEntity.setFWCONFIRMATION(ancVisit.getString(ancVisitKeyMap.get("FWCONFIRMATION")));
			ancEntity.setFWGESTATIONALAGE(ancVisit.getString(ancVisitKeyMap.get("FWGESTATIONALAGE")));
			ancEntity.setFWEDD(ancVisit.getString(ancVisitKeyMap.get("FWEDD")));
			ancEntity.setFWANCREMSTS(ancVisit.getString(ancVisitKeyMap.get("FWANCREMSTS")));
			ancEntity.setFWANCINT(ancVisit.getString(ancVisitKeyMap.get("FWANCINT")));
			ancEntity.setFWANCANM(ancVisit.getString(ancVisitKeyMap.get("FWANCANM")));
			ancEntity.setFWANCHBP(ancVisit.getString(ancVisitKeyMap.get("FWANCHBP")));
			ancEntity.setFWANCDBT(ancVisit.getString(ancVisitKeyMap.get("FWANCDBT")));
			ancEntity.setFWANCTHY(ancVisit.getString(ancVisitKeyMap.get("FWANCTHY")));
			ancEntity.setFWANCPROB(ancVisit.getString(ancVisitKeyMap.get("FWANCPROB")));
			ancEntity.setFWANCHEAD(ancVisit.getString(ancVisitKeyMap.get("FWANCHEAD")));
			ancEntity.setFWBPCLOCOFDEL(ancVisit.getString(ancVisitKeyMap.get("FWBPC1LOCOFDEL")));
			ancEntity.setFWBPCASSTLAB(ancVisit.getString(ancVisitKeyMap.get("FWBPC1ASSTLAB")));
			ancEntity.setFWBPCTRNSPRT(ancVisit.getString(ancVisitKeyMap.get("FWBPC1TRNSPRT")));
			ancEntity.setFWBPCBLDGRP(ancVisit.getString(ancVisitKeyMap.get("FWBPC1BLDGRP")));
			ancEntity.setFWBPCBLDDNR(ancVisit.getString(ancVisitKeyMap.get("FWBPC1BLDDNR")));
			ancEntity.setFWBPC1FINARGMT(ancVisit.getString(ancVisitKeyMap.get("FWBPC1FINARGMT")));
			ancEntity.setMauza(ancVisit.getString(ancVisitKeyMap.get("mauza")));
			ancEntity.setFWVG(ancVisit.getString(ancVisitKeyMap.get("FWVG")));
			ancEntity.setFWHR_PSR(ancVisit.getString(ancVisitKeyMap.get("FWHR_PSR")));
			ancEntity.setFWHRP(ancVisit.getString(ancVisitKeyMap.get("FWHRP")));
			ancEntity.setExisting_ELCO(ancVisit.getString(ancVisitKeyMap.get("existing_ELCO")));
			ancEntity.setFWANCBLRVIS(ancVisit.getString(ancVisitKeyMap.get("FWANCBLRVIS")));
			ancEntity.setFWANCSWLNG(ancVisit.getString(ancVisitKeyMap.get("FWANCSWLNG")));
			ancEntity.setFWANCCONVL(ancVisit.getString(ancVisitKeyMap.get("FWANCCONVL")));
			ancEntity.setFWANCBLD(ancVisit.getString(ancVisitKeyMap.get("FWANCBLD")));
			ancEntity.setFWANCDS1(ancVisit.getString(ancVisitKeyMap.get("FWANCDS1")));
			ancEntity.setFWANCDS2(ancVisit.getString(ancVisitKeyMap.get("FWANCDS2")));
			ancEntity.setFWANCDS3(ancVisit.getString(ancVisitKeyMap.get("FWANCDS3")));
			ancEntity.setFWANCDS4(ancVisit.getString(ancVisitKeyMap.get("FWANCDS4")));
			ancEntity.setFWANCDS5(ancVisit.getString(ancVisitKeyMap.get("FWANCDS5")));
			ancEntity.setFWANCDS6(ancVisit.getString(ancVisitKeyMap.get("FWANCDS6")));
			ancEntity.setFWDANGERVALUE(ancVisit.getString(ancVisitKeyMap.get("FWDANGERVALUE")));
			ancEntity.setFWNOTELIGIBLE(ancVisit.getString(ancVisitKeyMap.get("FWNOTELIGIBLE")));
			ancEntity.setELCO(ancVisit.getString(ancVisitKeyMap.get("ELCO")));
			ancEntity.setFWHR_ANC(ancVisit.getString(ancVisitKeyMap.get("FWHR_ANC")));
			ancEntity.setFWFLAGVALUE(ancVisit.getString(ancVisitKeyMap.get("FWFLAGVALUE")));
			ancEntity.setFWSORTVALUE(ancVisit.getString(ancVisitKeyMap.get("FWSORTVALUE")));
			ancEntity.setUser_type(ancVisit.getString(ancVisitKeyMap.get("user_type")));
			ancEntity.setExternal_user_ID(ancVisit.getString(ancVisitKeyMap.get("external_user_ID")));
			ancEntity.setRelationalid(ancVisit.getString(ancVisitKeyMap.get("relationalid")));
			ancEntity.setFW_GOBHHID(ancVisit.getString(ancVisitKeyMap.get("GOBHHID")));
			ancEntity.setFW_JiVitAHHID(ancVisit.getString(ancVisitKeyMap.get("FW_JiVitAHHID")));
			ancEntity.setFW_WOMBID(ancVisit.getString(ancVisitKeyMap.get("FW_WOMBID")));
			ancEntity.setFW_WOMNID(ancVisit.getString(ancVisitKeyMap.get("FW_WOMNID")));
			ancEntity.setFW_WOMFNAME(ancVisit.getString(ancVisitKeyMap.get("FW_WOMFNAME")));
			ancEntity.setFW_HUSNAME(ancVisit.getString(ancVisitKeyMap.get("FW_HUSNAME")));
			ancEntity.setMOTHER_REFERENCE_DATE(ancVisit.getString(ancVisitKeyMap.get("MOTHER_REFERENCE_DATE")));
			ancEntity.setMOTHER_REFERENCE_DATE(ancVisit.getString(ancVisitKeyMap.get("REFERENCE_DATE")));
			ancEntity.setSTART_DATE(ancVisit.getString(ancVisitKeyMap.get("start")));
			ancEntity.setEND_DATE(ancVisit.getString(ancVisitKeyMap.get("end")));
			ancEntity.setClientVersion(Long.parseLong(ancVisit.getString(ancVisitKeyMap.get("clientVersion"))));
			ancEntity.setReceived_time(ancVisit.getString(ancVisitKeyMap.get("received_time")));
			ancEntity.setTimeStamp(Long.parseLong(ancVisit.getString(ancVisitKeyMap.get("timeStamp"))));
		}
		catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ancEntity;
		
	}
	
}
