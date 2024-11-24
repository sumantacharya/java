package com.xworkz.smartphonecrud.repository;

import com.xworkz.smartphonecrud.entity.SmartPhone;

public interface SmartPhoneRepo {
	public boolean save( SmartPhone phone);
	public SmartPhone[] readAll();
	public boolean update(String brandName, int price);
	public SmartPhone find(String brandName);
	public boolean delete(String brandName);
	

	

}
