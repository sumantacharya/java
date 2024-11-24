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
	public boolean update(String brandName,int price) {
		for(int i=0;i<data.length;i++) {
			if(data[i]!=null&& data[i].getBrandName().equals(brandName)) {
				data[i].setPrice(price);
				return true;
			}
				
		}
		return false;
	}
	public SmartPhone find(String barndName) {
		for(int i=0;i<data.length;i++) {
			if(data[i]!=null&& data[i].getBrandName().equals(barndName)) {
				
				return data[i];
			}
		}
		System.out.println("brandname not valid");
		return null;
	}

	@Override
	public boolean delete(String brandName) {
		for(int i=0;i<data.length;i++) {
			if(data[i]!=null&& data[i].getBrandName().equals(brandName)) {
				
				data[i]=null;
				return true;
			}
	}
		return false;

}
}
