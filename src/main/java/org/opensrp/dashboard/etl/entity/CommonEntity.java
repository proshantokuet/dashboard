package org.opensrp.dashboard.etl.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class CommonEntity {
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "birth_date")
	private String birthDate;
	
	private String gender;
	
	@Column(name = "case_id")
	public String caseId;
	
	@Column(name = "instant_id")
	private String instantId;
	
	private String provider;
	
	@Column(name = "location_id")
	private String locationId;
	
	private String today;
	
	private String start;
	
	@Column(name = "end_time")
	private String end;
	
	@Column(name = "registration_date")
	private String registrationDate;
	
	private String country;
	
	private String division;
	
	private String district;
	
	private String upazila;
	
	@Column(name = "unions")
	private String union;
	
	private String ward;
	
	private String subunit;
	
	@Column(name = "mauza_para")
	private String mauzaPara;
	
	private String gps;
	
	@Column(name = "form_name")
	private String formName;
	
	@Column(name = "user_type")
	private String userType;
	
	@Column(name = "external_user_id")
	private String externalUserId;
	
	@Column(name = "current_form_status")
	private String currentFormStatus;
	
	@Column(name = "submission_time")
	private long submissionTime;
	
	@Column(name = "client_version")
	private long clientVersion;
	
	@Column(name = "time_stamp")
	private long timeStamp;
	
	private Date created;
	
	private Date updated;
	
	@Column(name = "received_time")
	private String receivedTime;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getCaseId() {
		return caseId;
	}
	
	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}
	
	public String getInstantId() {
		return instantId;
	}
	
	public void setInstantId(String instantId) {
		this.instantId = instantId;
	}
	
	public String getProvider() {
		return provider;
	}
	
	public void setProvider(String provider) {
		this.provider = provider;
	}
	
	public String getLocationId() {
		return locationId;
	}
	
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}
	
	public String getToday() {
		return today;
	}
	
	public void setToday(String today) {
		this.today = today;
	}
	
	public String getStart() {
		return start;
	}
	
	public void setStart(String start) {
		this.start = start;
	}
	
	public String getEnd() {
		return end;
	}
	
	public void setEnd(String end) {
		this.end = end;
	}
	
	public String getRegistrationDate() {
		return registrationDate;
	}
	
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getDivision() {
		return division;
	}
	
	public void setDivision(String division) {
		this.division = division;
	}
	
	public String getDistrict() {
		return district;
	}
	
	public void setDistrict(String district) {
		this.district = district;
	}
	
	public String getUpazila() {
		return upazila;
	}
	
	public void setUpazila(String upazila) {
		this.upazila = upazila;
	}
	
	public String getUnion() {
		return union;
	}
	
	public void setUnion(String union) {
		this.union = union;
	}
	
	public String getWard() {
		return ward;
	}
	
	public void setWard(String ward) {
		this.ward = ward;
	}
	
	public String getSubunit() {
		return subunit;
	}
	
	public void setSubunit(String subunit) {
		this.subunit = subunit;
	}
	
	public String getMauzaPara() {
		return mauzaPara;
	}
	
	public void setMauzaPara(String mauzaPara) {
		this.mauzaPara = mauzaPara;
	}
	
	public String getGps() {
		return gps;
	}
	
	public void setGps(String gps) {
		this.gps = gps;
	}
	
	public String getFormName() {
		return formName;
	}
	
	public void setFormName(String formName) {
		this.formName = formName;
	}
	
	public String getUserType() {
		return userType;
	}
	
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	public String getExternalUserId() {
		return externalUserId;
	}
	
	public void setExternalUserId(String externalUserId) {
		this.externalUserId = externalUserId;
	}
	
	public String getCurrentFormStatus() {
		return currentFormStatus;
	}
	
	public void setCurrentFormStatus(String currentFormStatus) {
		this.currentFormStatus = currentFormStatus;
	}
	
	public long getSubmissionTime() {
		return submissionTime;
	}
	
	public void setSubmissionTime(long submissionTime) {
		this.submissionTime = submissionTime;
	}
	
	public long getClientVersion() {
		return clientVersion;
	}
	
	public void setClientVersion(long clientVersion) {
		this.clientVersion = clientVersion;
	}
	
	public long getTimeStamp() {
		return timeStamp;
	}
	
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	public Date getCreated() {
		return created;
	}
	
	public void setCreated(Date created) {
		this.created = created;
	}
	
	public Date getUpdated() {
		return updated;
	}
	
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	
	public String getReceivedTime() {
		return receivedTime;
	}
	
	public void setReceivedTime(String receivedTime) {
		this.receivedTime = receivedTime;
	}
	
	@Override
	public String toString() {
		return "CommonEntity [firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate + ", gender="
		        + gender + ", caseId=" + caseId + ", instantId=" + instantId + ", provider=" + provider + ", locationId="
		        + locationId + ", today=" + today + ", start=" + start + ", end=" + end + ", registrationDate="
		        + registrationDate + ", country=" + country + ", division=" + division + ", district=" + district
		        + ", upazila=" + upazila + ", union=" + union + ", ward=" + ward + ", subunit=" + subunit + ", mauzaPara="
		        + mauzaPara + ", gps=" + gps + ", formName=" + formName + ", userType=" + userType + ", externalUserId="
		        + externalUserId + ", currentFormStatus=" + currentFormStatus + ", submissionTime=" + submissionTime
		        + ", clientVersion=" + clientVersion + ", timeStamp=" + timeStamp + ", created=" + created + ", updated="
		        + updated + ", receivedTime=" + receivedTime + "]";
	}
	
}
