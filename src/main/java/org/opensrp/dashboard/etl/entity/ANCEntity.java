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
@Table(name = "anc")
public class ANCEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "anc_id_seq")
	@SequenceGenerator(name = "anc_id_seq", sequenceName = "anc_id_seq", allocationSize = 1)
	private int id;
	
	private String ancName;
	
	private String FWANCDATE;
	
	private String anc_current_formStatus;
	
	private String FWCONFIRMATION;
	
	private String FWGESTATIONALAGE;
	
	private String FWEDD;
	
	private String FWANCREMSTS;
	
	private String FWANCINT;
	
	private String FWANCKNWPRVDR;
	
	private String FWANCANM;
	
	private String FWANCHBP;
	
	private String FWANCDBT;
	
	private String FWANCTHY;
	
	private String FWANCPROB;
	
	private String FWANCHEAD;
	
	private String FWBPCLOCOFDEL;
	
	private String FWBPCASSTLAB;
	
	private String FWBPCTRNSPRT;
	
	private String FWBPCBLDGRP;
	
	private String FWBPCBLDDNR;
	
	private String FWBPC1FINARGMT;
	
	private String mauza;
	
	private String FWVG;
	
	private String FWHR_PSR;
	
	private String FWHRP;
	
	private String existing_ELCO;
	
	private String FWANC1BLRVIS;
	
	private String FWANCSWLNG;
	
	private String FWANCCONVL;
	
	private String FWANCBLD;
	
	private String FWANCDS1;
	
	private String FWANCDS2;
	
	private String FWANCDS3;
	
	private String FWANCDS4;
	
	private String FWANCDS5;
	
	private String FWANCDS6;
	
	private String FWDANGERVALUE;
	
	private String FWNOTELIGIBLE;
	
	private String ELCO;
	
	private String FWHR_ANC1;
	
	private String FWFLAGVALUE;
	
	private String FWSORTVALUE;
	
	private String user_type;
	
	private String external_user_ID;
	
	private String relationalid;
	
	private String FW_GOBHHID;
	
	private String FW_JiVitAHHID;
	
	private String FW_WOMBID;
	
	private String FW_WOMNID;
	
	private String FW_WOMFNAME;
	
	private String FW_HUSNAME;
	
	private String MOTHER_REFERENCE_DATE;
	
	private String REFERENCE_DATE;
	
	private String START_DATE;
	
	private String END_DATE;
	
	private long clientVersion;
	
	private String received_time;
	
	private long timeStamp;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mother_id", referencedColumnName = "id")
	private MotherEntity mother;
	
}
