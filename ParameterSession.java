public class ParameterSession{
	public static void main(String[] args){

       email("sumanthacharya399@gmail.com","wellcome to java");
       email("kawshikacharya399@gmail.com","python world");
       email("lokanathlowdu@gmail.com","noob player in bgmi");
        phoneCall(8848524151l,"kawshik","+91");
        phoneCall(6523147896l,"pursha","+91");
        phoneCall(5623189744l,"loka","+91");
        logIn("kawshikacharya399@gmail.com","2566hhwhws");
        logIn("sumanthacharya399@gmail.com","206206@sumanth");
        logIn("athullowdu399@gmail.com","6545+c5ed++5e+v");

	}
	public static void email(String emailId,String subject){
		System.out.println("the email id = "+emailId);
		System.out.println("subject = "+subject);
	}
	public static void phoneCall(long mobileNo,String name,String countryCode){
		System.out.println("mobile number = "+mobileNo);
		System.out.println("name is  = "+name);
		System.out.println("country code is =" +countryCode);

}
    public static void logIn(String email,String password){
		System.out.println("the email of user= "+email);
		System.out.println("your password  = "+password);
		}

}