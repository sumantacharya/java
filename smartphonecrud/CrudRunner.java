package com.xworkz.smartphonecrud;

import com.xworkz.smartphonecrud.entity.SmartPhone;
import com.xworkz.smartphonecrud.service.SmartPhoneService;
import com.xworkz.smartphonecrud.service.SmartPhoneServiceImp;

public class CrudRunner {
	public static void main(String[] args) {
		SmartPhoneService service=new SmartPhoneServiceImp();
		SmartPhone phone=new SmartPhone("samsang",5000,452,2);
		service.save(phone);
		SmartPhone[] data= service.readAll();
		for(int i=0;i<data.length;i++) {
			if(data[i]!=null) {
				data[i].printDetails();
			}
		}
		
	}

}
