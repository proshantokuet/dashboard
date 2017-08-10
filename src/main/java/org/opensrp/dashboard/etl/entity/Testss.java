package org.opensrp.dashboard.etl.entity;

import org.ektorp.support.CouchDbDocument;
import org.ektorp.support.TypeDiscriminator;

public class Testss extends CouchDbDocument{
	
	public Testss() {
		// TODO Auto-generated constructor stub
	}
	
	@TypeDiscriminator
	private String id;
	private String body;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	

}
