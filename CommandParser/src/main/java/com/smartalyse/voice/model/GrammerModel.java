package com.smartalyse.voice.model;

public class GrammerModel {
	String type;
	String group;
	String entity;
	String extra;
	

	public GrammerModel(String group, String entity, String extra, String type) {
		
		this.group = group;
		this.entity = entity;
		this.extra = extra;
			
	}

	

	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getGroup() {
		return group;
	}


	public void setGroup(String group) {
		this.group = group;
	}


	public String getEntity() {
		return entity;
	}


	public void setEntity(String entity) {
		this.entity = entity;
	}


	public String getExtra() {
		return extra;
	}


	public void setExtra(String extra) {
		this.extra = extra;
	}
	
	
	
	
}
