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
@Table(name = "pnc")
public class PNCEntity {
	
	private static final PNCEntity INSTANCE = new PNCEntity();
	
	private PNCEntity() {
		
	}
	
	public static PNCEntity getInstance() {
		return INSTANCE;
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pnc_id_seq")
	@SequenceGenerator(name = "pnc_id_seq", sequenceName = "pnc_id_seq", allocationSize = 1)
	private int id;
	
	private String FWPNCDATE;
	
	private String FWCONFIRMATION;
	
	private String FWPNCREMSTS;
	
	private String FWPNCINT;
	
	private String FWPNCKNWPRVDR;
	
	private String FWPNCFVR;
	
	private String FWPNCTEMP;
	
	private String FWPNCDNGRSIGN;
	
	private String FWPNCDELTYPE;
	
	private String FWPNCDELCOMP;
	
	private String FW_GOBHHID;
	
	private String FW_JiVitAHHID;
	
	private String FW_WOMBID;
	
	private String FW_WOMNID;
	
	private String FW_WOMFNAME;
	
	private String FW_HUSNAME;
	
	private String FWBNFDTOO;
	
	private String FWBNFSTS;
	
	private String REFERENCE_DATE;
	
	private String START_DATE;
	
	private String END_DATE;
	
	private String pnc_current_formStatus;
	
	private String relationalid;
	
	private String user_type;
	
	private String external_user_ID;
	
	private String pncName;
	
	private long clientVersion;
	
	private String received_time;
	
	private long timeStamp;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mother_id", referencedColumnName = "id")
	private MotherEntity mother;
}
