package com.xworkz.smartphonecrud;

import com.xworkz.smartphonecrud.entity.SmartPhone;
import com.xworkz.smartphonecrud.service.SmartPhoneService;
import com.xworkz.smartphonecrud.service.SmartPhoneServiceImp;

public class CrudRunner {
	public static void main(String[] args) {
		SmartPhoneService service=new SmartPhoneServiceImp();
		SmartPhone phone=new SmartPhone("samsang",5000,452,2);
		SmartPhone phone1=new SmartPhone("iphone",50000,56,6);
		SmartPhone phone2=new SmartPhone("IQphone",6000,89,4);
		
		service.save(phone);
		service.save(phone1);
		service.save(phone2);
		
		SmartPhone[] data= service.readAll();
		for(int i=0;i<data.length;i++) {
			if(data[i]!=null) {
				data[i].printDetails();
			}
		}
		
		 System.out.println("***********After update********");
	     service.update("IQphone",7000);
	     
	     SmartPhone[] result= service.readAll();
	     for(int i=0;i<result.length;i++ ) {
	    	 if(result[i]!=null){
	    		result[i].printDetails(); 
	    	 }
	     }
	    
	     System.out.println("********Finding********");
	      SmartPhone result1= service.find("iphone");
	      result1.printDetails();
	      
	     
	      System.out.println("***********after deleting the brand***********");
	      service.delete("samsang");
	      SmartPhone[] deleted= service.readAll();
		     for(int i=0;i<deleted.length;i++ ) {
		    	 if(deleted[i]!=null){
		    		deleted[i].printDetails(); 
		    	 }
		     }
		     
	     
	     
	     }
	
			
		}
		
	


