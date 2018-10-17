/*******Author Name: Christy JV Emp Id : 101484 Date: 24.5.2017 ******/
//Purpose: To provide user interface of Library Management for accepting & displaying book details

package com.cg.librarymgmt.ui;

import java.util.Random;
import java.util.Scanner;

import com.cg.librarymgmt.bean.BookDetails;
import com.cg.librarymgmt.exception.BookException;
import com.cg.librarymgmt.helper.CollectionHelper;
import com.cg.librarymgmt.helper.DataValidator;

public class Client 
{
	static Scanner sc=new Scanner(System.in);
	static CollectionHelper collectionhelper=null;
	
	//Main method
	public static void main(String[] args)
	{
		String choice;
		collectionhelper=new CollectionHelper();

		while(true)
		{
			//Providing user interface
			System.out.println("Library Management \n***************** \n1. Insert Book details\n"
					+ "2. Display all books\n"+ "3. Exit From System");
			
			System.out.println("\nEnter your choice :");
			choice=sc.next();
			switch(choice)
			{
			
			//Calling enterBookDetails method for getting & displaying book details 
			case "1":enterBookDetails();break;
			case "2":collectionhelper.displayAllBooks();break;
			case "3":System.out.println("Exiting...");System.exit(0);
			default: System.out.println("Please enter correct choice");
			break;
			}
		}
	}
	
	//method for getting & displaying book details
	private static void enterBookDetails() 
	{
		System.out.println("Enter Book Name:");
		String bookName=sc.next();
		try 
		{
			//sending input to validateBookName method for validating book type
			if(DataValidator.validateBookName(bookName))
			{
				System.out.println("Enter Book Type:");
				String bookType=sc.next();
				//sending input to validateBookType method for validating book name
				if(DataValidator.validateBookType(bookType))
				{
					System.out.println("Enter Book Quantity:");
					String qty=sc.next();
										
					//sending input to validateBookQuanity method for validating book quantity
					if(DataValidator.validateBookQuanity(qty))
					{
												
						//Generate  Random Reference Id
						Random ran=new Random();
						long refId=ran.nextInt();
						int quantity = Integer.parseInt(qty);

						//sending valid input data to the constructor of BookDetails class
						BookDetails cc=new BookDetails(bookName, 
								bookType, quantity,java.time.LocalDate.now(), 
								refId);
						//adding valid input data of book details to the array list
						collectionhelper.addNewBook(cc);
						//displaying all the existing book details of the arrary list
						collectionhelper.displayAllBooks();
					}
					}	
				}
			
		} 
		catch (BookException e)
		{			
			System.out.println(e.getMessage());
		}		

	}
}
