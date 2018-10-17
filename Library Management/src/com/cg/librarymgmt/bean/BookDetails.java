/*******Author Name: Christy JV Emp Id : 101484 Date: 24.5.2017 ******/
//Purpose: To provide getters and setters for book details

package com.cg.librarymgmt.bean;

import java.time.LocalDate;

public class BookDetails {

	int[] a={3,4,5,6};
	private String bookName;
	private String bookType;
	private int quantityBook;
	private long referenceId;
	private LocalDate currentDate;

	//default constructor
	public BookDetails() {

	}
	
	//initializing instance variables
	public BookDetails(String bookName, String bookType,int quantityBook, LocalDate currentDate, long referenceId ) {
		this.bookName = bookName;
		this.bookType = bookType;
		this.quantityBook = quantityBook;
		this.currentDate = currentDate;
		this.referenceId = referenceId;
	}
	
	//getter for reference id
	public long getReferenceId() {
		return referenceId;
	}
	//setter for reference id
	public void setReferenceId(int referenceId) {
		this.referenceId = referenceId;
	}
	//getter for book name
	public String getBookName() {
		return bookName;
	}
	//setter for book name
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	//getter for book type
	public String getBookType() {
		return bookType;
	}
	//setter for book type
	public void setbookType(String bookType) {
		this.bookType = bookType;
	}
	//getter for book quantity
	public void getQuantityBook(int quantityBook) {
		this.quantityBook = quantityBook;
	}
	//setter for book quantity
		public int setQuantityBook() {
			return quantityBook;
	}
	//setter for current date
	public LocalDate getCurrentDate() {
		return currentDate;
	}
	//setter for current date
	public void setCurrentDate(LocalDate currentDate) {
		this.currentDate = currentDate;
	}
	//displaying book details 
	@Override
	public String toString() {
		return "Asset [Reference Id=" + referenceId + ", Book Name="
				+ bookName + ", Book Type=" + bookType +", Quantity=" + quantityBook
				+ ", Entry Date=" + currentDate + "]";
	}
}
