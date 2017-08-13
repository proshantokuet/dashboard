package org.opensrp.dashboard.etl.entity;

import java.util.List;

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
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "household_id_seq")
	@SequenceGenerator(name = "household_id_seq", sequenceName = "household_id_seq", allocationSize = 1)
	private int id;
	
	private String FWGOBHHID;
	
	private String GOBHHID;
	
	private String FWNHHMBRNUM;
	
	private int FWNHHMWRA;
	
	private int ELCO;
	
	@OneToMany(targetEntity = ElcoEntity.class, mappedBy = "id", fetch = FetchType.EAGER)
	private List<ElcoEntity> students;
	
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
	
	public int getFWNHHMWRA() {
		return FWNHHMWRA;
	}
	
	public void setFWNHHMWRA(int fWNHHMWRA) {
		FWNHHMWRA = fWNHHMWRA;
	}
	
	public int getELCO() {
		return ELCO;
	}
	
	public void setELCO(int eLCO) {
		ELCO = eLCO;
	}
	
}
