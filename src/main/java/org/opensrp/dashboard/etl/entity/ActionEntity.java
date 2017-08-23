package org.opensrp.dashboard.etl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "action")
public class ActionEntity {
	
	public ActionEntity() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "action_id_seq")
	@SequenceGenerator(name = "action_id_seq", sequenceName = "action_id_seq", allocationSize = 1)
	private int id;
	
	@Column(name = "provider")
	private String provider;
	
	@Column(name = "case_id")
	private String caseID;
	
	@Column(name = "start_date")
	private String startDate;
	
	@Column(name = "beneficiary_type")
	private String beneficiaryType;
	
	@Column(name = "schedule_name")
	private String scheduleName;
	
	@Column(name = "expiry_date")
	private String expiryDate;
	
	@Column(name = "visit_code")
	private String visitCode;
	
	@Column(name = "alert_status")
	private String alertStatus;
	
	@Column(name = "action_target")
	private String actionTarget;
	
	@Column(name = "action_type")
	private String actionType;
	
	@Column(name = "is_action_active")
	private Boolean isActionActive;
	
	@Column(name = "time_stamp")
	private long timeStamp;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getProvider() {
		return provider;
	}
	
	public void setProvider(String provider) {
		this.provider = provider;
	}
	
	public String getCaseID() {
		return caseID;
	}
	
	public void setCaseID(String caseID) {
		this.caseID = caseID;
	}
	
	public String getStartDate() {
		return startDate;
	}
	
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	public String getBeneficiaryType() {
		return beneficiaryType;
	}
	
	public void setBeneficiaryType(String beneficiaryType) {
		this.beneficiaryType = beneficiaryType;
	}
	
	public String getScheduleName() {
		return scheduleName;
	}
	
	public void setScheduleName(String scheduleName) {
		this.scheduleName = scheduleName;
	}
	
	public String getExpiryDate() {
		return expiryDate;
	}
	
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	public String getVisitCode() {
		return visitCode;
	}
	
	public void setVisitCode(String visitCode) {
		this.visitCode = visitCode;
	}
	
	public String getAlertStatus() {
		return alertStatus;
	}
	
	public void setAlertStatus(String alertStatus) {
		this.alertStatus = alertStatus;
	}
	
	public String getActionTarget() {
		return actionTarget;
	}
	
	public void setActionTarget(String actionTarget) {
		this.actionTarget = actionTarget;
	}
	
	public String getActionType() {
		return actionType;
	}
	
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
	
	public Boolean getIsActionActive() {
		return isActionActive;
	}
	
	public void setIsActionActive(Boolean isActionActive) {
		this.isActionActive = isActionActive;
	}
	
	public long getTimeStamp() {
		return timeStamp;
	}
	
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
}
