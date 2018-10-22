package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LoginPageFactory;

public class VerifyLoginPageFactory {

	public int TimeoutValue = 30;
	@Test
	public void veryfylogin()
	{
		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/misAppp.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//LoginPageFactory login = new LoginPageFactory(driver);
		
		//Initializing web element using initElement method
		
		LoginPageFactory login_page = PageFactory.initElements(driver, LoginPageFactory.class);
		login_page.login_misapp("capgemini", "capgemini", "capgemini");	
		
}         
	
	
}