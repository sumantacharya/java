package com.xworkz.smartphonecrud.repository;

import com.xworkz.smartphonecrud.entity.SmartPhone;

public interface SmartPhoneRepo {
	public boolean save( SmartPhone phone);
	public SmartPhone[] readAll();
	

}
