package com.xworkz.smartphonecrud.repository;


import com.xworkz.smartphonecrud.entity.SmartPhone;

public class SmartPhoneRepoImp implements SmartPhoneRepo {
    SmartPhone[] data=new SmartPhone[10];
	@Override
	public boolean save(SmartPhone phone) {
		for(int i=0;i<data.length;i++) {
			if(data[i]==null) {
				data[i]=phone;
				System.out.println("succesfully saved");
						return true;
			}
		}
		return false;
	}

	@Override
	public SmartPhone[] readAll() {
		
		return data;
	}

}
