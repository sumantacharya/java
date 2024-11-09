package com.xworks.AccesesSpecifier;


public class Company {
	
    public String name;
    protected double revenue;
    int year;
    private String ceoName;;
    
    public Company() {
        this.name = "tata";
        this.year = 2016;
        System.out.println("Default Constructor Executed");
    }
    
    private Company(String model) {
        this.ceoName = model;
        System.out.println("Private Constructor Executed");
    }
    
    public void start() {
        System.out.println("Company operations started");
    }
    
    protected void drive() {
        System.out.println("Company is progressing.");
    }
    
    void airConditionStatus() {
        System.out.println("Air Condition on");
    }
    
    private void MisicalSystemStatus() {
        System.out.println("Musical system is on");
    }
}
