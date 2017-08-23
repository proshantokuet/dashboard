package org.opensrp.dashboard.etl.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "psrf")
public class PSRFEntity {
	
	private static final PSRFEntity INSTANCE = new PSRFEntity();
	
	private PSRFEntity() {
		
	}
	
	public static PSRFEntity getInstance() {
		return INSTANCE;
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "psrf_id_seq")
	@SequenceGenerator(name = "psrf_id_seq", sequenceName = "psrf_id_seq", allocationSize = 1)
	private int id;
	
	private String FWPSRSTS;
	
	private String FWPSRDATE;
	
	private String FWCONFIRMATION;
	
	private String FWPSRPREGSTS;
	
	private String FWPSRPREGWTD;
	
	private String FWPSREVRPREG;
	
	private String FWPSRTOTBIRTH;
	
	private String FWPSRNBDTH;
	
	private String FWPSRPRSB;
	
	private String FWPSRPRMC;
	
	private String FWPSRPREGTWYRS;
	
	private String FWPSRPRVPREGCOMP;
	
	private String FWPSRPRCHECKS;
	
	private String FWPSRVDGMEM;
	
	private String FWPSRWOMEDU;
	
	private String FWPSRHHLAT;
	
	private String FWPSRHHRICE;
	
	private String FWPSRANM;
	
	private String FWPSRHBP;
	
	private String FWPSRDBT;
	
	private String FWPSRTHY;
	
	private String FWPSRHGT;
	
	private String FWPSRMUAC;
	
	private String FWPSRPHONE;
	
	private String FWPSRPHONENUM;
	
	private String FWVG;
	
	private String FWHRP;
	
	private String FWHRPSR;
	
	private String FWFLAGVALUE;
	
	private String FWSORTVALUE;
	
	private String start;
	
	private String end;
	
	private String existing_ELCO;
	
	private String FWNOTELIGIBLE;
	
	private String ELCO;
	
	private String FWELIGIBLE;
	
	private String current_formStatus;
	
	private long clientVersion;
	
	private String received_time;
	
	private long timeStamp;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "elco_id", referencedColumnName = "id")
	private ElcoEntity elco;
	
	private String relationalId;//getting from elco
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFWPSRSTS() {
		return FWPSRSTS;
	}
	
	public void setFWPSRSTS(String fWPSRSTS) {
		FWPSRSTS = fWPSRSTS;
	}
	
	public String getFWPSRDATE() {
		return FWPSRDATE;
	}
	
	public void setFWPSRDATE(String fWPSRDATE) {
		FWPSRDATE = fWPSRDATE;
	}
	
	public String getFWCONFIRMATION() {
		return FWCONFIRMATION;
	}
	
	public void setFWCONFIRMATION(String fWCONFIRMATION) {
		FWCONFIRMATION = fWCONFIRMATION;
	}
	
	public String getFWPSRPREGSTS() {
		return FWPSRPREGSTS;
	}
	
	public void setFWPSRPREGSTS(String fWPSRPREGSTS) {
		FWPSRPREGSTS = fWPSRPREGSTS;
	}
	
	public String getFWPSRPREGWTD() {
		return FWPSRPREGWTD;
	}
	
	public void setFWPSRPREGWTD(String fWPSRPREGWTD) {
		FWPSRPREGWTD = fWPSRPREGWTD;
	}
	
	public String getFWPSREVRPREG() {
		return FWPSREVRPREG;
	}
	
	public void setFWPSREVRPREG(String fWPSREVRPREG) {
		FWPSREVRPREG = fWPSREVRPREG;
	}
	
	public String getFWPSRTOTBIRTH() {
		return FWPSRTOTBIRTH;
	}
	
	public void setFWPSRTOTBIRTH(String fWPSRTOTBIRTH) {
		FWPSRTOTBIRTH = fWPSRTOTBIRTH;
	}
	
	public String getFWPSRNBDTH() {
		return FWPSRNBDTH;
	}
	
	public void setFWPSRNBDTH(String fWPSRNBDTH) {
		FWPSRNBDTH = fWPSRNBDTH;
	}
	
	public String getFWPSRPRSB() {
		return FWPSRPRSB;
	}
	
	public void setFWPSRPRSB(String fWPSRPRSB) {
		FWPSRPRSB = fWPSRPRSB;
	}
	
	public String getFWPSRPRMC() {
		return FWPSRPRMC;
	}
	
	public void setFWPSRPRMC(String fWPSRPRMC) {
		FWPSRPRMC = fWPSRPRMC;
	}
	
	public String getFWPSRPREGTWYRS() {
		return FWPSRPREGTWYRS;
	}
	
	public void setFWPSRPREGTWYRS(String fWPSRPREGTWYRS) {
		FWPSRPREGTWYRS = fWPSRPREGTWYRS;
	}
	
	public String getFWPSRPRVPREGCOMP() {
		return FWPSRPRVPREGCOMP;
	}
	
	public void setFWPSRPRVPREGCOMP(String fWPSRPRVPREGCOMP) {
		FWPSRPRVPREGCOMP = fWPSRPRVPREGCOMP;
	}
	
	public String getFWPSRPRCHECKS() {
		return FWPSRPRCHECKS;
	}
	
	public void setFWPSRPRCHECKS(String fWPSRPRCHECKS) {
		FWPSRPRCHECKS = fWPSRPRCHECKS;
	}
	
	public String getFWPSRVDGMEM() {
		return FWPSRVDGMEM;
	}
	
	public void setFWPSRVDGMEM(String fWPSRVDGMEM) {
		FWPSRVDGMEM = fWPSRVDGMEM;
	}
	
	public String getFWPSRWOMEDU() {
		return FWPSRWOMEDU;
	}
	
	public void setFWPSRWOMEDU(String fWPSRWOMEDU) {
		FWPSRWOMEDU = fWPSRWOMEDU;
	}
	
	public String getFWPSRHHLAT() {
		return FWPSRHHLAT;
	}
	
	public void setFWPSRHHLAT(String fWPSRHHLAT) {
		FWPSRHHLAT = fWPSRHHLAT;
	}
	
	public String getFWPSRHHRICE() {
		return FWPSRHHRICE;
	}
	
	public void setFWPSRHHRICE(String fWPSRHHRICE) {
		FWPSRHHRICE = fWPSRHHRICE;
	}
	
	public String getFWPSRANM() {
		return FWPSRANM;
	}
	
	public void setFWPSRANM(String fWPSRANM) {
		FWPSRANM = fWPSRANM;
	}
	
	public String getFWPSRHBP() {
		return FWPSRHBP;
	}
	
	public void setFWPSRHBP(String fWPSRHBP) {
		FWPSRHBP = fWPSRHBP;
	}
	
	public String getFWPSRDBT() {
		return FWPSRDBT;
	}
	
	public void setFWPSRDBT(String fWPSRDBT) {
		FWPSRDBT = fWPSRDBT;
	}
	
	public String getFWPSRTHY() {
		return FWPSRTHY;
	}
	
	public void setFWPSRTHY(String fWPSRTHY) {
		FWPSRTHY = fWPSRTHY;
	}
	
	public String getFWPSRHGT() {
		return FWPSRHGT;
	}
	
	public void setFWPSRHGT(String fWPSRHGT) {
		FWPSRHGT = fWPSRHGT;
	}
	
	public String getFWPSRMUAC() {
		return FWPSRMUAC;
	}
	
	public void setFWPSRMUAC(String fWPSRMUAC) {
		FWPSRMUAC = fWPSRMUAC;
	}
	
	public String getFWPSRPHONE() {
		return FWPSRPHONE;
	}
	
	public void setFWPSRPHONE(String fWPSRPHONE) {
		FWPSRPHONE = fWPSRPHONE;
	}
	
	public String getFWPSRPHONENUM() {
		return FWPSRPHONENUM;
	}
	
	public void setFWPSRPHONENUM(String fWPSRPHONENUM) {
		FWPSRPHONENUM = fWPSRPHONENUM;
	}
	
	public String getFWVG() {
		return FWVG;
	}
	
	public void setFWVG(String fWVG) {
		FWVG = fWVG;
	}
	
	public String getFWHRP() {
		return FWHRP;
	}
	
	public void setFWHRP(String fWHRP) {
		FWHRP = fWHRP;
	}
	
	public String getFWHRPSR() {
		return FWHRPSR;
	}
	
	public void setFWHRPSR(String fWHRPSR) {
		FWHRPSR = fWHRPSR;
	}
	
	public String getFWFLAGVALUE() {
		return FWFLAGVALUE;
	}
	
	public void setFWFLAGVALUE(String fWFLAGVALUE) {
		FWFLAGVALUE = fWFLAGVALUE;
	}
	
	public String getFWSORTVALUE() {
		return FWSORTVALUE;
	}
	
	public void setFWSORTVALUE(String fWSORTVALUE) {
		FWSORTVALUE = fWSORTVALUE;
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
	
	public String getExisting_ELCO() {
		return existing_ELCO;
	}
	
	public void setExisting_ELCO(String existing_ELCO) {
		this.existing_ELCO = existing_ELCO;
	}
	
	public String getFWNOTELIGIBLE() {
		return FWNOTELIGIBLE;
	}
	
	public void setFWNOTELIGIBLE(String fWNOTELIGIBLE) {
		FWNOTELIGIBLE = fWNOTELIGIBLE;
	}
	
	public String getELCO() {
		return ELCO;
	}
	
	public void setELCO(String eLCO) {
		ELCO = eLCO;
	}
	
	public String getFWELIGIBLE() {
		return FWELIGIBLE;
	}
	
	public void setFWELIGIBLE(String fWELIGIBLE) {
		FWELIGIBLE = fWELIGIBLE;
	}
	
	public String getCurrent_formStatus() {
		return current_formStatus;
	}
	
	public void setCurrent_formStatus(String current_formStatus) {
		this.current_formStatus = current_formStatus;
	}
	
	public long getClientVersion() {
		return clientVersion;
	}
	
	public void setClientVersion(long clientVersion) {
		this.clientVersion = clientVersion;
	}
	
	public String getReceived_time() {
		return received_time;
	}
	
	public void setReceived_time(String received_time) {
		this.received_time = received_time;
	}
	
	public long getTimeStamp() {
		return timeStamp;
	}
	
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	public ElcoEntity getElco() {
		return elco;
	}
	
	public void setElco(ElcoEntity elco) {
		this.elco = elco;
	}
	
	public String getRelationalId() {
		return relationalId;
	}
	
	public void setRelationalId(String relationalId) {
		this.relationalId = relationalId;
	}
	
}
