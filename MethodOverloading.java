public class MethodOverloading{

	public static void main(String[] args){
	studentDetail("sumanth");
	studentDetail(4656);
	studentDetail(56256,"hemanth",885641354l);
	studentDetail("sumesh",862654);
	SendMail("sumanthacharya399@gmail.com");
	SendMail(8848524151l);
	SendMail("athulacharya@gmail.com","sgfys@152",4488562213l);
    SendMail("sumatachar1102k@gmail.com",4561242222l,"hgdief@6564");
    onlineShopping("Jeans_Pant");
    onlineShopping(700);
    onlineShopping("Shirt",5,2500);
    onlineShopping("Shirt",3000,3);
    int returnedValue=multiplication(1,2,3,4,5,6,7,8,9,10);
    System.out.println(returnedValue);
	}
	public static void studentDetail(String name){
	 System.out.println("*********first set of methods ************");	
	 System.out.println(name);
	}
	public static void studentDetail(int studentId){
	 System.out.println(studentId);
    }
    public static void studentDetail(int studentId,String name,long studentNo){
	 System.out.println(studentId+","+name+","+studentNo);
	}
	public static void studentDetail(String name,int studentId){
	 System.out.println(name+","+studentId);
	}
	public static void SendMail(String emailId){
		System.out.println("******Second  set of method************");
		System.out.println(emailId);
	}
	public static void SendMail(long phoneNumber){
		System.out.println(phoneNumber);
	}
	public static void SendMail(String emailId,String password,long phoneNumber){
		System.out.println(emailId+","+password+","+phoneNumber);
}
    public static void SendMail(String emailId,long phoneNumber,String password){
		System.out.println(emailId+","+phoneNumber+","+password);
}
    public static void onlineShopping(String productName){
    	System.out.println("********Third set of method************");
		System.out.println(productName);
	}
	public static void onlineShopping(int price){
		System.out.println( price);
	}
	public static void onlineShopping(String productName, int productQuantity,int price){
		System.out.println(productName+","+productQuantity+","+price);
}
    public static void SendMail(String productName,int price,int productQuantity){
		System.out.println(productName+","+price+","+productQuantity);
}
    public static int multiplication(int... number1){
    	System.out.println("******Variable argument************");
    	int value=1;
    	for(int i=0;i<number1.length;i++){
    		value=value*number1[i];
    	}
    	return value;
 }

}
