package com.xworkz.smartphonecrud.entity;

public class SmartPhone {
	private String brandName;
	private int price;
	private int batteryCapacity;
	private int Warranty;
	
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batterCapacity) {
		this.batteryCapacity = batterCapacity;
	}

	public int getWarranty() {
		return Warranty;
	}

	public void setWarranty(int warranty) {
		Warranty = warranty;
	}

	public SmartPhone(String brandName, int price, int batterCapacity, int warranty) {
		super();
		this.brandName = brandName;
		this.price = price;
		this.batteryCapacity = batterCapacity;
		this.Warranty = warranty;
	}
	public void printDetails() {
		System.out.println("==============================");
		System.out.println("brand Name:"+brandName);
		System.out.println("price:"+price);
		System.out.println("battery Capacity:"+batteryCapacity);
		System.out.println("Warranty:"+Warranty);
		
	}

}
