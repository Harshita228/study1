package ref;
//testNG program

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ref.ConfPage;

public class VerifyConfPage {
	
	WebDriver driver ;
	ConfPage conf_page;
	public int TimeoutValue = 30;
			
	
	
	@Test(priority=1)
	public void TestCaseOne()
	{
		//1.	Launch the application browser
		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//2.	Open the web page “ConferenceRegistartion.html “ in the browser.
		driver.get("d:/ConferenceRegistartion.html");
		conf_page = PageFactory.initElements(driver, ConfPage.class);
		
		//3.	Verify the title “Conference Registration” of the page. 
		//The test should stop execution if the title of the page is not matching with the expected title.
		conf_page.verifyTitle("Conference Registartion");
		
		//4. Verify the heading  “Step 1: Personal Details ” of the page. 
		//The test should stop execution if the heading of the page is not matching with the expected heading.
		conf_page.verifyHeading("Step 1: Personal Details");
		
	}         
	@Test(priority=2)
	public void TestCaseTwo() throws InterruptedException
	{
		//5a. Verifying availablity of first name text box
		//5b. Ensure that the alert box displays the message “Please fill the First Name” 
		//upon clicking on the link “Next” without entering any data in the text box.
      	//5c. Enter value for first name
		conf_page.verifyFirstName();
		
	}
}