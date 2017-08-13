package org.opensrp.dashboard.etl.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "mother")
public class MotherEntity extends CommonEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mother_id_seq")
	@SequenceGenerator(name = "mother_id_seq", sequenceName = "mother_id_seq", allocationSize = 1)
	private int id;
	
}
