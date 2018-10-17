/*******Author Name: Christy JV Emp Id : 101484 Date: 20.5.2017 ******/
//Purpose: To create arraylist for adding & displaying book details

package com.cg.librarymgmt.helper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.time.*;

import com.cg.librarymgmt.bean.BookDetails;


public class CollectionHelper
{
	//creating array list and adding default data
	private  static ArrayList<BookDetails> bookList=null;
	static
	{
		bookList=new ArrayList<BookDetails>();
		BookDetails bookDetails1=new BookDetails("Harry Potter","Story",20,LocalDate.now(),888088);
		BookDetails bookDetails2=new BookDetails("Star Wars on Trial","Science Fiction",8,LocalDate.now(),9656544);
		
		bookList.add(bookDetails1);
		bookList.add(bookDetails2);
	}
	
	public CollectionHelper(){}
	
	//adding book details to the array list
	public void addNewBook(BookDetails bookDetails) 
	{			
			bookList.add(bookDetails);
			System.out.println("Book details added successfully");
	}
	
	public static ArrayList<BookDetails> geBookList() {
		return bookList;
	}

	public static void setBookList(ArrayList<BookDetails> bookList) {
		CollectionHelper.bookList = bookList;
	}

	//displaying all book details
	public void displayAllBooks()
	{
		Iterator<BookDetails> bookIt=bookList.iterator();
		BookDetails tempBook=null;
		while(bookIt.hasNext())
		{
			tempBook=bookIt.next();
			System.out.println(tempBook);			
		}
	}
	
}
