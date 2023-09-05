package com.ey.emp;

public abstract class Employee {

	private int empNo;
	private String empName;
	private double salary;
	
	private static int counter = 101;
	
	static {
		
		System.out.println("Account class loaded...");
		counter = 901;
	}
	{
		
		System.out.println("employee object created...");
	}
	public Employee(String empName, double salary) {
		System.out.println();
		
		this.empNo = counter ++;
		this.empName = empName;
		this.salary = salary;
	}
	
	public void payslip() {
		
		System.out.println("empName "+ empName);

		System.out.println("empN0 "+ empNo);

		System.out.println("Salary "+ salary);
		
	}

	public double getSalary() {
		return salary;
	}
	
	
	
	
}
