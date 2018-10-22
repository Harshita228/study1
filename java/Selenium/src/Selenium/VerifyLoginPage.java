package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import Selenium.LoginPage;

//import pages.LoginPage;

public class VerifyLoginPage {
	@Test
	public void veryfylogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\harshita\\NewDrivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("D:\\harshita\\Chennai VNV batch\\m4\\Demos\\POM\\misAppp.html");
		driver.manage().window().maximize();
		
		LoginPage login = new LoginPage(driver);
		login.typeusername();
		login.typepassword();
				
	}
	
}
