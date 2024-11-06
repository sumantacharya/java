public class Engineer extends Employee {
	int bonus;

	public Engineer(String name,int baseSalary,String country,int bonus){
		super(name,baseSalary,country);
		this.bonus=bonus;

	}

	public void calculateSalary(){
		int salary=baseSalary+bonus;
		System.out.println(" engineers salary is "+salary);
	}
}