public class Manager extends Employee {
    int age;
    int otherIncome;

   
    public Manager(String name,int baseSalary,String country,int age,int otherIncome) {
        super(name,baseSalary,country); 
        this.age=age;
        this.otherIncome=otherIncome;

}
         @Override
    public void calculateSalary() {
        int totalSalary = baseSalary + otherIncome;
        System.out.println(name + " (Manager)'s total salary is: " + totalSalary);
    }

    }