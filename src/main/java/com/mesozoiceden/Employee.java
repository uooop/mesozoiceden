package com.mesozoiceden;

public class Employee {
	private String employeeName; 
	private int employeeAge; 
	private int employeeYearsOfExperience; 
    
   
    public Employee(String employeeName, int employeeAge, int employeeYearsOfExperience) {
    	this.employeeName = employeeName;
    	this.employeeAge = employeeAge;
    	this.employeeYearsOfExperience = employeeYearsOfExperience;
    }

    
    public String getEmployeeName() {
        return employeeName;
    }
    
    public int getEmployeeAge() {
        return employeeAge;
    }
  
    public int getEmployeeYearsOfExperience() {
        return employeeYearsOfExperience;
    }
	
}

class ParkManager extends Employee{

	public ParkManager(String employeeName, int employeeAge, int employeeYearsOfExperience) {
		super(employeeName, employeeAge, employeeYearsOfExperience);
	}
	
	public String getJobTitle() {
		return "관리자";
	}
}

class SecurityOfficer extends Employee{

	public SecurityOfficer(String employeeName, int employeeAge, int employeeYearsOfExperience) {
		super(employeeName, employeeAge, employeeYearsOfExperience);
	}
	
	public String getJobTitle() {
		return "보안팀";
	}
}

class Veterinarian extends Employee{

	public Veterinarian(String employeeName, int employeeAge, int employeeYearsOfExperience) {
		super(employeeName, employeeAge, employeeYearsOfExperience);
	}
	
	public String getJobTitle() {
		return "수의사";
	}
}

class Guide extends Employee{

	public Guide(String employeeName, int employeeAge, int employeeYearsOfExperience) {
		super(employeeName, employeeAge, employeeYearsOfExperience);
	}
	
	public String getJobTitle() {
		return "가이드";
	}
}

class Zookeeper extends Employee{

	public Zookeeper(String employeeName, int employeeAge, int employeeYearsOfExperience) {
		super(employeeName, employeeAge, employeeYearsOfExperience);
	}
	
	
	public String getJobTitle() {
		return "사육사";
	}
}
