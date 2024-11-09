package com.xworks.AccesesSpecifier;

import com.xworks.AccesesSpecifier.example.Employees;

public class CompanyRunner extends Employees {

    public static void main(String[] args) {
    
        
        Company company = new Company();
        System.out.println("name = " + company.name);
        company.start();
        
        
        System.out.println("Revenue = " + company.revenue);
        company.drive();
        company.airConditionStatus();
        
        
        Employees employee = new Employees();
        System.out.println("name = " + employee.name);
        employee.start();
        
       
        CompanyRunner runner = new CompanyRunner();
        System.out.println("User Age = " + runner.age);
        runner.drive();
    }
}
