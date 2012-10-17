package com.contestframework.model;

public class Contest {
	String name;
	String staffName;

	protected String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	protected String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

}
