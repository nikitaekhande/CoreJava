package com.tnsif.daysix.hasarelationship;

public class employee {
	
	private int empID;
	private String empName;
	private float salary;
	
	private department dept;
	
	public employee() {
		super();
	}

	public employee(int empID, String empName, float salary, department dept) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
		this.dept = dept;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public department getDept() {
		return dept;
	}

	public void setDept(department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "employee [empID=" + empID + ", empName=" + empName + ", salary=" + salary + ", dept=" + dept
				+ ", getEmpID()=" + getEmpID() + ", getEmpName()=" + getEmpName() + ", getSalary()=" + getSalary()
				+ ", getDept()=" + getDept() + "]";
	}
	
	

}