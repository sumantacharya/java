public class Salesperson extends Employee{
	int partTimeWork;

	public Salesperson(String name,int baseSalary,String country,int partTimeWork){
		super(name,baseSalary,country);
		this.partTimeWork=partTimeWork;
	}
       @Override
	public void calculateSalary(){
		int totalSalary=baseSalary+partTimeWork;
		System.out.println("Salesperson salary is :"+totalSalary);
	}
}