package Jscript;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.grid.internal.listeners.Prioritizer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.annotations.Test;
public class VerifyLoginPageFactory {

	public int TimeoutValue = 30;
	//Prioritizer priority ;
	public WebDriver driver ;
	public LoginPageFactory login_page;
	@BeforeClass
	public void initialSetUp(){
		System.out.println("bEFORE cLASS");
//		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("D:\\Chennai VnV batch\\m4\\Demos\\POM\\misAppp.html");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		//LoginPageFactory login = new LoginPageFactory(driver);
//		login_page = PageFactory.initElements(driver, LoginPageFactory.class);
	}

//	@Test  
//	public void verifyTitle(){
//		login_page.testTitle("Conference ");
//	}

	@Test
	public void veryfylogin()
	{
		//login_page.login_misapp("capgemini", "capgemini", "capgemini");
		System.out.println("Test BEFORE LOGIN");

	}         

}