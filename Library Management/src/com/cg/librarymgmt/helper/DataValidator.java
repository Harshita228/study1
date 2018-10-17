/*******Author Name: Christy JV Emp Id : 101484 Date: 20.5.2017 ******/
//Purpose: To provide data validation for the user input

package com.cg.librarymgmt.helper;


import java.util.regex.Pattern;

import com.cg.librarymgmt.exception.BookException;

public class DataValidator
{
	//validating book name - it should be alphanumeric and minimum 3 characters
	public  static  boolean validateBookName(String assetName)throws BookException
	{
		String assetPattern="[A-Za-z]{3,}";
		if(Pattern.matches(assetPattern, assetName))
		{
			return true;
		}
		else
		{
			throw new BookException("Book name should be alphabet and Minimum 3");
		}
	}
	
	//validating book type - it should be story or fiction	
	public  static  boolean validateBookType(String accType)throws BookException
	{
		if(accType.equalsIgnoreCase("STORY")||(accType.equalsIgnoreCase("FICTION")))
		{
			return true;
		}
		else
		{
			throw new BookException("Book Type Should Be Either Story OR Science Fiction");
		}
	}
	
	//validating book quantity - it should be of number and minium 5, maximum 30 
	public  static  boolean validateBookQuanity(String qty)throws BookException
	{
		String qtyPattern="[0-9]*";
		if(Pattern.matches(qtyPattern,qty))
		{
			return true;
		}
		else
		{
			throw new BookException("Quantity must be a number");
		}
	}

}
