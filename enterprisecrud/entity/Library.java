package com.xworkz.enterprisecrud.entity;

public class Library {
	private String libraryName; 
	private int noOfBooks;
	private float membership_fee;
	private float lateFee;
	private int openingHours;
	
	public String getLibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	public int getNoOfBooks() {
		return noOfBooks;
	}
	public void setNoOfBooks(int noOfBooks) {
		this.noOfBooks = noOfBooks;
	}
	public float getMembership_fee() {
		return membership_fee;
	}
	public void setMembership_fee(float membership_fee) {
		this.membership_fee = membership_fee;
	}
	public float getLateFee() {
		return lateFee;
	}
	public void setLateFee(float lateFee) {
		this.lateFee = lateFee;
	}
	public int getOpeningHours() {
		return openingHours;
	}
	public void setOpeningHours(int openingHours) {
		this.openingHours = openingHours;
	}
	
	public Library(String libraryName, int noOfBooks, float membership_fee, float lateFee, int openingHours) {
		this.libraryName = libraryName;
		this.noOfBooks = noOfBooks;
		this.membership_fee = membership_fee;
		this.lateFee = lateFee;
		this.openingHours = openingHours;
	}
}

