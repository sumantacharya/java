package com.xworkz.enterprisecrud.service;

import javax.sound.midi.Soundbank;

import com.xworkz.enterprisecrud.entity.Library;

public class LibraryServiceImpl implements LibraryService{

	@Override
	public boolean save(Library library) {
		
		if(library!=null) {
			
			if(library.getLibraryName() !=null && library.getLibraryName().length() >3) {
				
				if(library.getNoOfBooks()>1) {
					
					if(library.getMembership_fee()>100)	{
						
						if (library.getLateFee()>50) {
							
							if (library.getOpeningHours()>10) {
								
								System.out.println("library is valid");
								return true;
							}
							System.err.println("opening hour should greater then 10");
							return false;
						}
					     System.err.println("getlate fee should be greater than 50");
						return false;
					}
					System.err.println("membership fee should be greater than 100");
					return false;
				}
				System.err.println("getNoOfBooks should be greater than 1");
				return false;
			}
			System.err.println("Name of library should contain more than 3 character");
			return false;
		}
		return false;
	}
	
}