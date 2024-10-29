public class Mobile extends Electronic{
	String batteryCapacity;
	String model;
	String warranty;

	public static void message(){
		System.out.println("messaging through mobile");
	}
	public void printDetails(){
		 System.out.println(electronicName);
	     System.out.println(type);
	     System.out.println(price);
	     System.out.println(batteryCapacity);
	     System.out.println(model);
	     System.out.println(warranty);
	}
}