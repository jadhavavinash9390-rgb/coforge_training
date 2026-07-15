package com.coforge.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private int sId;
	private String sName;
	private Address address;
	private List<String> subjects;
	private Set<String> skills;
	private Map<String,Integer> marks;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sId, String sName, Address address, List<String> subjects, Set<String> skills,
			Map<String, Integer> marks) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.address = address;
		this.subjects = subjects;
		this.skills = skills;
		this.marks = marks;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public Set<String> getSkills() {
		return skills;
	}

	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}

	public Map<String, Integer> getMarks() {
		return marks;
	}

	public void setMarks(Map<String, Integer> marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", address=" + address + ", subjects=" + subjects
				+ ", skills=" + skills + ", marks=" + marks + "]";
	}
	
	
}
