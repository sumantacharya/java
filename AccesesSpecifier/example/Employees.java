package com.xworks.AccesesSpecifier.example;

public class Employees {
	
    public String name;
    protected int age;
    String userDLNumber; 
    private int experience;

    public Employees() {
        this.name = "Anish";
        this.userDLNumber = "KL025871";
        System.out.println("Employee created with default values.");
    }

    private Employees(int age) {
        this.age = age;
        System.out.println("Employee created with age: " + age);
    }

    public void start() {
        System.out.println("company manager: " + name);
    }

    protected void drive() {
        System.out.println("company started");
    }

    void airConditionStatus() {
        System.out.println("Air Condition is on.");
    }

   
}

