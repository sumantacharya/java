package com.xworkz.smartphonecrud.service;

import com.xworkz.smartphonecrud.entity.SmartPhone;

public interface SmartPhoneService {
	public boolean save(SmartPhone phone);
	public SmartPhone[] readAll();

}
