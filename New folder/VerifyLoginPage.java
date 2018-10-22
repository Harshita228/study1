package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.LoginPage;

public class VerifyLoginPage {
	@Test
	public void veryfylogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/misAppp.html");
		driver.manage().window().maximize();
		
		LoginPage login = new LoginPage(driver);
		login.typeusername();
		login.typepassword();
				
	}
	
}
