package com.xworkz.enterprisecrud;

import com.xworkz.enterprisecrud.entity.Library;
import com.xworkz.enterprisecrud.service.LibraryService;
import com.xworkz.enterprisecrud.service.LibraryServiceImpl;

public class CrudRunner {
	public static void main(String[] args) {
		LibraryService service=new LibraryServiceImpl();
		Library library=new Library("Xworks", 0, 100.5f, 100,11);
		service.save(library);
	}
}
