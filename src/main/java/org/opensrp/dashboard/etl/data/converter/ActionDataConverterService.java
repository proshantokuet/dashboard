package org.opensrp.dashboard.etl.data.converter;

import org.json.JSONException;
import org.json.JSONObject;
import org.opensrp.dashboard.etl.entity.ActionEntity;
import org.opensrp.dashboard.etl.interfaces.DataConverterService;
import org.springframework.beans.factory.annotation.Autowired;

public class ActionDataConverterService implements DataConverterService<JSONObject, ActionEntity> {
	
	private ActionEntity actionEntity;
	
	@Autowired
	public void setActionEntity(ActionEntity actionEntity) {
		
		this.actionEntity = actionEntity;
	}
	
	private ActionDataConverterService() {
		
	}
	
	private static final ActionDataConverterService INSTANCE = new ActionDataConverterService();
	
	public ActionDataConverterService getInstance() {
		
		return INSTANCE;
		
	}
	
	@Override
	public ActionEntity convertData(JSONObject doc) throws JSONException {
		
		JSONObject data = new JSONObject(doc.getString("data"));
		
		actionEntity.setActionTarget(doc.getString("actionTarget"));
		
		actionEntity.setProvider(doc.getString("anmIdentifier"));
		
		actionEntity.setCaseID(doc.getString("caseID"));
		
		actionEntity.setTimeStamp(Long.parseLong(doc.getString("timeStamp")));
		
		actionEntity.setIsActionActive(Boolean.parseBoolean(doc.getString("isActionActive")));
		
		actionEntity.setAlertStatus(data.getString("alertStatus"));
		
		actionEntity.setVisitCode(data.getString("visitCode"));
		
		actionEntity.setExpiryDate(data.getString("expiryDate"));
		
		actionEntity.setScheduleName(data.getString("scheduleName"));
		
		actionEntity.setBeneficiaryType(data.getString("beneficiaryType"));
		
		actionEntity.setStartDate(data.getString("startDate"));
		
		return null;
	}
	
	@Override
	public void sendData(ActionEntity v) {
		
	}
	
}
