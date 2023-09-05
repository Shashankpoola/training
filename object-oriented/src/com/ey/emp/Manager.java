package com.ey.emp;
public class Manager extends Employee {

    private double incentives;
 

    public Manager(String empName, double salary, double incentives) {

        //Constructor chaining: Calling constructor of parent class with matching stgnature

        super( empName, salary);

        this.incentives = incentives;    

    }

 

    @Override

    public void payslip() {

        //calling payslip() of super class

        super.payslip();

        System.out.println("Incentives: "+ incentives);

    }

 

    @Override

    public double getSalary() {

        return super.getSalary()+ incentives;

    }

    

    

}

 