public class Runner{
	public static void main(String[] args) {
		
		Engineer emp =new Engineer("athul",50,"uganda",1000);
		emp.calculateSalary();
		Salesperson emp1 =new Salesperson("sumanth",500,"kasaragod",2000);
		emp1.calculateSalary();
		Manager emp2 =new Manager("anish",500,"kasaragod",24,5000);
		emp2.calculateSalary();
	}
}