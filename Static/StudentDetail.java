public class StudentDetail{
	String studentName;
	String gender;
	long phoneNumber;
	int age;
	static String schoolAddress;
	static String schoolName;
	static int totalStudents;

static{
	schoolAddress="kasaragod district kumbla,kalathur";
	schoolName="ASBS Ichlampady school";
	totalStudents=500;

      }
      public StudentDetail(String studentName,String gender,long phoneNumber,int age){
      	this.studentName=studentName;
      	this.gender=gender;
      	this.phoneNumber=phoneNumber;
      	this.age=age;
      }
      public void printDetails(){
      	System.out.println(studentName);
      	System.out.println(gender);
      	System.out.println(phoneNumber);
      	System.out.println(age);
      	System.out.println(schoolAddress);
      	System.out.println(schoolName);
      	System.out.println(totalStudents);

      }


}

