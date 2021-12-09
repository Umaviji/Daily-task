package org.empl;

public class Employee {
	private String empfirstname;
	private String emplastname;
	private int empid;
	private double empmonthlysalary;
	
	public String getEmpfirstname() {
		return empfirstname;
	}
	public void setEmpfirstname(String empfirstname) {
		this.empfirstname = empfirstname;
	}
	public String getEmplastname() {
		return emplastname;
	}
	public void setEmplastname(String emplastname) {
		this.emplastname = emplastname;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getEmpsalary() {
		return empmonthlysalary;
	}
	public void setEmpsalary(double empsalary) {
		this.empmonthlysalary = empsalary;
	if (empmonthlysalary !=0.0) {
		System.out.println(empmonthlysalary);
		
	} else {
		System.out.println();

	}
	}
		

}
