package com.coforge.model;

public class Project {
	private String proj_id;
	private String proj_name;
	public String getProj_id() {
		return proj_id;
	}
	public void setProj_id(String proj_id) {
		this.proj_id = proj_id;
	}
	public String getProj_name() {
		return proj_name;
	}
	public void setProj_name(String proj_name) {
		this.proj_name = proj_name;
	}
	public Project(String proj_id, String proj_name) {
		super();
		this.proj_id = proj_id;
		this.proj_name = proj_name;
	}
	@Override
	public String toString() {
		return "Project [proj_id=" + proj_id + ", proj_name=" + proj_name + "]";
	}
	
	

}
