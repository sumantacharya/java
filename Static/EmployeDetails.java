public class EmployeDetails{
	 String employeName;
	 static String department;
	 static int employeSalary;
	 int age;
	 String employeWorkHour;
	 long employeeNumber;

	 static{
	 	department="softwareDeveloper";
	 	employeSalary=50000;
	 }
	  public EmployeDetails(String employeName,int age,String employeWorkHour, long employeeNumber){
	  	this.employeName=employeName;
	  	this.age=age;
	  	this.employeWorkHour=employeWorkHour;
	  	this.employeeNumber=employeeNumber;
      }
      public void printDetails(){
      	System.out.println(employeName);
      	System.out.println(department);
      	System.out.println(employeSalary);
      	System.out.println(age);
      	System.out.println(employeWorkHour);
      	System.out.println(employeeNumber);

      }

	
}