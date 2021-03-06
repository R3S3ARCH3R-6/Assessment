package inherit;

import inherit.Address;
import inherit.Project;

public class Employee extends Person{
	private String designation;
	private double salary;
	private Address permanentAddress;
	private Address presentAddress;
	private Project employeeProject;
			//add has-A relationship Project-pid, name, clientname, cost
	//need to use presentAddress for 2 things
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, String designation, double salary) {
		super(id, name);
		this.salary = salary;
		this.designation = designation;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public Address getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	
	public Address getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(Address presentAddress) {
		this.presentAddress = presentAddress;
	}

	public Project getEmployeeProject() {
		return employeeProject;
	}

	public void setEmployeeProject(Project employeeProject) {
		this.employeeProject = employeeProject;
	}

	@Override
	//insert missing info for project and address
	public String toString() {
		return "Employee [designation=" + designation + ", salary=" + salary + ", getDesignation()=" + getDesignation()
				+ ", getSalary()=" + getSalary() + ", permanent address = " + permanentAddress + ", present address = " 
				+ presentAddress + ", getPresentAddress() = " + getPresentAddress() + ", getPermanentAddress() = " + 
				getPermanentAddress() + ", project = " + employeeProject + ", getEmployeeProject() = " + getEmployeeProject() + "]";
	}
}
