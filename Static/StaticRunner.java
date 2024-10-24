public class StaticRunner{
	public static void main(String[] args) {
		EmployeDetails newData=new EmployeDetails("sumanth",24,"12hous",8848524151l);
		StudentDetail studentValue=new StudentDetail("athul lotte","others",4856954245l,24);
		MobileDetails mobile=new MobileDetails(BrandName.SUMSANG,50000,"android");
		CricketTeam cricket=new CricketTeam("CSK","MS dhoni",50);
		newData.printDetails();
		System.out.println("***********************");
		studentValue.printDetails();
		System.out.println("***********************");
		mobile.printDetails();
		System.out.println("***********************");
		cricket.printDetails();

	}
}