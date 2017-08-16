package org.opensrp.dashboard.etl.data.converter;

import org.json.JSONException;
import org.json.JSONObject;
import org.opensrp.dashboard.etl.entity.PSRFEntity;
import org.opensrp.dashboard.etl.interfaces.DataConverterService;
import org.springframework.beans.factory.annotation.Autowired;

public class PSRFDataConverterService implements DataConverterService<JSONObject, PSRFEntity> {
	
	private PSRFEntity psrfEntity;
	
	@Autowired
	public void setPsrfEntity(PSRFEntity psrfEntity) {
		this.psrfEntity = psrfEntity;
	}
	
	private PSRFDataConverterService() {
		// TODO Auto-generated constructor stub
	}
	
	private static final PSRFDataConverterService INSTANCE = new PSRFDataConverterService();
	
	public PSRFDataConverterService getInstance() {
		return INSTANCE;
		
	}
	
	@Override
	public PSRFEntity convertData(JSONObject doc) throws JSONException {
		
		psrfEntity.setFWPSRSTS(doc.getString("FWPSRSTS"));
		
		psrfEntity.setFWPSRDATE(doc.getString("FWPSRDATE"));
		
		psrfEntity.setFWCONFIRMATION(doc.getString("FWCONFIRMATION"));
		
		psrfEntity.setFWPSRPREGSTS(doc.getString("FWPSRPREGSTS"));
		
		psrfEntity.setFWPSRPREGWTD(doc.getString("FWPSRPREGWTD"));
		
		psrfEntity.setFWPSREVRPREG(doc.getString("FWPSREVRPREG"));
		
		psrfEntity.setFWPSRTOTBIRTH(doc.getString("FWPSRTOTBIRTH"));
		
		psrfEntity.setFWPSRNBDTH(doc.getString("FWPSRNBDTH"));
		
		psrfEntity.setFWPSRPRSB(doc.getString("FWPSRPRSB"));
		
		psrfEntity.setFWPSRPRMC(doc.getString("FWPSRPRMC"));
		
		psrfEntity.setFWPSRPREGTWYRS(doc.getString("FWPSRPREGTWYRS"));
		
		psrfEntity.setFWPSRPRVPREGCOMP(doc.getString("FWPSRPRVPREGCOMP"));
		
		psrfEntity.setFWPSRPRCHECKS(doc.getString("FWPSRPRCHECKS"));
		
		psrfEntity.setFWPSRVDGMEM(doc.getString("FWPSRVDGMEM"));
		
		psrfEntity.setFWPSRWOMEDU(doc.getString("FWPSRWOMEDU"));
		
		psrfEntity.setFWPSRHHLAT(doc.getString("FWPSRHHLAT"));
		
		psrfEntity.setFWPSRHHRICE(doc.getString("FWPSRHHRICE"));
		
		psrfEntity.setFWPSRANM(doc.getString("FWPSRANM"));
		
		psrfEntity.setFWPSRHBP(doc.getString("FWPSRHBP"));
		
		psrfEntity.setFWPSRDBT(doc.getString("FWPSRDBT"));
		
		psrfEntity.setFWPSRTHY(doc.getString("FWPSRTHY"));
		
		psrfEntity.setFWPSRHGT(doc.getString("FWPSRHGT"));
		
		psrfEntity.setFWPSRMUAC(doc.getString("FWPSRMUAC"));
		
		psrfEntity.setFWPSRPHONE(doc.getString("FWPSRPHONE"));
		
		psrfEntity.setFWPSRPHONENUM(doc.getString("FWPSRPHONENUM"));
		
		psrfEntity.setFWVG(doc.getString("FWVG"));
		
		psrfEntity.setFWHRP(doc.getString("FWHRP"));
		
		psrfEntity.setFWHRPSR(doc.getString("FWHRPSR"));
		
		psrfEntity.setFWFLAGVALUE(doc.getString("FWFLAGVALUE"));
		
		psrfEntity.setFWSORTVALUE(doc.getString("FWSORTVALUE"));
		
		psrfEntity.setStart(doc.getString("start"));
		
		psrfEntity.setEnd(doc.getString("end"));
		
		psrfEntity.setExisting_ELCO(doc.getString("existing_ELCO"));
		
		psrfEntity.setFWNOTELIGIBLE(doc.getString("FWNOTELIGIBLE"));
		
		psrfEntity.setELCO(doc.getString("ELCO"));
		
		psrfEntity.setFWELIGIBLE(doc.getString("FWELIGIBLE"));
		
		psrfEntity.setCurrent_formStatus(doc.getString("current_formStatus"));
		
		psrfEntity.setClientVersion(Long.parseLong(doc.getString("clientVersion")));
		
		psrfEntity.setReceived_time(doc.getString("received_time"));
		
		psrfEntity.setTimeStamp(Long.parseLong(doc.getString("timeStamp")));
		
		return null;
	}
	
	@Override
	public void sendData(PSRFEntity v) {
		// TODO Auto-generated method stub
		
	}
	
}
