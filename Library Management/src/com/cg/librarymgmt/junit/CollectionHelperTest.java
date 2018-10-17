/*******Author Name: Christy JV Emp Id : 101484 Date: 20.5.2017 ******/
//Purpose: To provide test cases of Book Management

package com.cg.librarymgmt.junit;

import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.librarymgmt.bean.BookDetails;
import com.cg.librarymgmt.exception.BookException;
import com.cg.librarymgmt.helper.CollectionHelper;

public class CollectionHelperTest
{
	static CollectionHelper collectionHelper;
	static BookDetails all=null;

	//adding asset details to the array list
	@BeforeClass
	public   static  void beforeClass()
	{
		collectionHelper=new CollectionHelper();
		all=new BookDetails("Wings of Fire","Story",12,java.time.LocalDate.now(),888088);		
	}
	
	//clearing the arraylist
	@AfterClass
	public static  void afterClass()
	{		
		collectionHelper=null;
		all=null;
	}	
	
	//checking whether asset details are present in array list
	@Test 
	public void testAddNewBook() throws BookException
	{
		collectionHelper.addNewBook(all);
		Assert.assertNotNull(all.getReferenceId());
	}

}
