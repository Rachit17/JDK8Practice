package com.rk.java.model;

public class Employee {
	
	private Integer empId;
	private String  empName;
	private Double  empSalary;
	
	public Employee(Integer employeeId,String employeeName,Double employeeSalary) {
		this.empId=employeeId;
		this.empName=employeeName;
		this.empSalary=employeeSalary;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + ((empSalary == null) ? 0 : empSalary.hashCode());
		return result;
	}

	/**
	 * @return the empId
	 */
	public Integer getEmpId() {
		return empId;
	}

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @return the empSalary
	 */
	public Double getEmpSalary() {
		return empSalary;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId == null) {
			if (other.empId != null)
				return false;
		} else if (!empId.equals(other.empId))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empSalary == null) {
			if (other.empSalary != null)
				return false;
		} else if (!empSalary.equals(other.empSalary))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	
	
	

}
