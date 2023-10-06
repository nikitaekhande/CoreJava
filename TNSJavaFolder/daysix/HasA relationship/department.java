package com.tnsif.daysix.hasarelationship;

public class department {
	
	private int deptNo;
	private String deptName;
	private int noofEmployees;
	
	public department() {
		
		super();
	}

	public department(int deptNo, String deptName, int noofEmployees) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.noofEmployees = noofEmployees;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getNoofEmployees() {
		return noofEmployees;
	}

	public void setNoofEmployees(int noofEmployees) {
		this.noofEmployees = noofEmployees;
	}

	@Override
	public String toString() {
		return "department [deptNo=" + deptNo + ", deptName=" + deptName + ", noofEmployees=" + noofEmployees
				+ ", getDeptNo()=" + getDeptNo() + ", getDeptName()=" + getDeptName() + ", getNoofEmployees()="
				+ getNoofEmployees() + "]";
	}
        
	
}