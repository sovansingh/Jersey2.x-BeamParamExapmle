package org.emudhra.com.Jersey2_BeanParamExample;

import javax.ws.rs.QueryParam;

public class Employee {

	private @QueryParam("empId")int id;
	private @QueryParam("empName")String eName;
	private @QueryParam("empSal")double empSal;
	
	
	public Employee() {
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", eName=" + eName + ", empSal=" + empSal + "]";
	}
}
