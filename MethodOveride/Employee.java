public class Employee{
	String name;
	int baseSalary;
	String country;

public Employee(String name,int baseSalary,String country){
	this.name=name;
	this.baseSalary=baseSalary;
	this.country=country;

} 

public void calculateSalary() {
        System.out.println(name + "'s salary is: " + baseSalary);
    }
}