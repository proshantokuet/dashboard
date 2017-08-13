package org.opensrp.dashboard.etl.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "child")
public class ChildEntity extends CommonEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "child_id_seq")
	@SequenceGenerator(name = "child_id_seq", sequenceName = "child_id_seq", allocationSize = 1)
	private int id;
	
}
