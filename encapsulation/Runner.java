package com.xworks.encapsulation;

public class Runner {
	public static void main(String[] args) {
		SmartHome home=new SmartHome("sumanth","kasaragod kerala 62132",true,22.5,15.0,12,5.2,150.0,false,"Cooling",90,false,true,false,45.0,"Sunny",1,"2024-10-15",false,300 );
		SmartHome home2=new SmartHome("athul","kasaragod kerala 62132",true,22.5,15.0,12,5.2,150.0,false,"Cooling",90,false,true,false,45.0,"Sunny",1,"2024-10-15",false,300 );
		// displaying the smarthome of both  
		home.printdetails();
		System.out.println("******************");
		System.out.println("Second Smarthome");
		System.out.println("******************");
		home2.printdetails();
		System.out.println("******************");
		//setting new values for smarthome
		home.setAddress("kumble kasaragod 671321");
		home.setCurrentIndoorTemperature(40.5);
		
		//getting and displaying the values of home
	    System.out.println("upadated smarthome for first"+home.getAddress());
	    System.out.println("upadated smarthome for first"+home.getCurrentIndoorTemperature());
		
	}
	

}
