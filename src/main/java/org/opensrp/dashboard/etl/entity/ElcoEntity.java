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
@Table(name = "elco")
public class ElcoEntity extends CommonEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "elco_id_seq")
	@SequenceGenerator(name = "elco_id_seq", sequenceName = "elco_id_seq", allocationSize = 1)
	private int id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "household_id", referencedColumnName = "id")
	private HouseholdEntity household;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public HouseholdEntity getHouseholdEntity() {
		return household;
	}
	
	public void setHouseholdEntity(HouseholdEntity householdEntity) {
		this.household = householdEntity;
	}
	
}
