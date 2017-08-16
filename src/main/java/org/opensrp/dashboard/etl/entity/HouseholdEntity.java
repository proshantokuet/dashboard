package org.opensrp.dashboard.etl.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "household")
public class HouseholdEntity extends CommonEntity {
	
	private HouseholdEntity() {
		// TODO Auto-generated constructor stub
	}
	
	private static final HouseholdEntity INSTANCE = new HouseholdEntity();
	
	public static HouseholdEntity getInstance() {
		return INSTANCE;
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "household_id_seq")
	@SequenceGenerator(name = "household_id_seq", sequenceName = "household_id_seq", allocationSize = 1)
	private int id;
	
	private String FWGOBHHID;
	
	private String GOBHHID;
	
	private String FWNHHMBRNUM;
	
	private String FWNHHMWRA;
	
	private String FWJIVHHID;
	
	@Column(name = "elco")
	private int ELCO;
	
	@OneToMany(targetEntity = ElcoEntity.class, mappedBy = "id", fetch = FetchType.EAGER)
	private List<ElcoEntity> elco;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFWGOBHHID() {
		return FWGOBHHID;
	}
	
	public void setFWGOBHHID(String fWGOBHHID) {
		FWGOBHHID = fWGOBHHID;
	}
	
	public String getGOBHHID() {
		return GOBHHID;
	}
	
	public void setGOBHHID(String gOBHHID) {
		GOBHHID = gOBHHID;
	}
	
	public String getFWNHHMBRNUM() {
		return FWNHHMBRNUM;
	}
	
	public void setFWNHHMBRNUM(String fWNHHMBRNUM) {
		FWNHHMBRNUM = fWNHHMBRNUM;
	}
	
	public String getFWNHHMWRA() {
		return FWNHHMWRA;
	}
	
	public void setFWNHHMWRA(String fWNHHMWRA) {
		FWNHHMWRA = fWNHHMWRA;
	}
	
	public int getELCO() {
		return ELCO;
	}
	
	public void setELCO(int eLCO) {
		ELCO = eLCO;
	}
	
	public String getFWJIVHHID() {
		return FWJIVHHID;
	}
	
	public void setFWJIVHHID(String fWJIVHHID) {
		FWJIVHHID = fWJIVHHID;
	}
	
	public List<ElcoEntity> getElco() {
		return elco;
	}
	
	public void setElco(List<ElcoEntity> elco) {
		this.elco = elco;
	}
	
	@Override
	public String toString() {
		return "HouseholdEntity [id=" + id + ", FWGOBHHID=" + FWGOBHHID + ", GOBHHID=" + GOBHHID + ", FWNHHMBRNUM="
		        + FWNHHMBRNUM + ", FWNHHMWRA=" + FWNHHMWRA + ", FWJIVHHID=" + FWJIVHHID + ", ELCO=" + ELCO + ", elco="
		        + elco + "]";
	}
	
}
