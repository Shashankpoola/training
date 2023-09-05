package com.ey.emp;

public class Clerk extends Employee {
	private double commision;
	public Clerk(String empName, double salary, double commision) {
		super(empName, salary);
		this.commision= commision;
		
	}

	  @Override

	    public void payslip() {

	        //calling payslip() of super class

	        super.payslip();

	        System.out.println("commision: "+ commision);

	    }

	 

	    @Override

	    public double getSalary() {

	        return super.getSalary()+ commision;

	    }

	
}
