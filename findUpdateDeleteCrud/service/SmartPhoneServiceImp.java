package com.xworkz.smartphonecrud.service;

import com.xworkz.smartphonecrud.entity.SmartPhone;
import com.xworkz.smartphonecrud.repository.SmartPhoneRepo;
import com.xworkz.smartphonecrud.repository.SmartPhoneRepoImp;

public class SmartPhoneServiceImp implements SmartPhoneService {
	SmartPhoneRepo repos=new SmartPhoneRepoImp();

	@Override
	public boolean save(SmartPhone phone) {
		if(phone!=null) {
			if(phone.getBrandName()!=null&&phone.getBrandName().length()>3) {
				if(phone.getPrice()>1000) {
				if(phone.getBatteryCapacity()>10) {
					if(phone.getWarranty()>1) {
						System.out.println("valid");
						repos.save(phone);
						return true;
					}
					System.err.println("warrnty should be greater than 1");
					return false;	
					}
				System.err.println("BatteryCapacity should be greater than 10");
				return false;
				}
				System.err.println("Price should be greater than 1000");
				return false;
			}
			System.err.println("brand name  should be greater than 3 charcters");
			return false;
		}
		return false;
	}

	@Override
	public SmartPhone[] readAll() {
		
		return repos.readAll();
	}
	
	public boolean update(String brandName,int price) {
		if(brandName!=null) {
		
		return repos.update(brandName,price);
		}
		System.out.println("brand is not valid");
		return false;
	}
	public SmartPhone find(String brandName) {
		if(brandName!=null) {
			return repos.find(brandName);
			
		}
		return null;
		
	}

	@Override
	public boolean delete(String brandName) {
		if(brandName!=null) {
			return repos.delete(brandName);
		}
		return false;
	}

}
