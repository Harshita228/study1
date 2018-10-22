package Jscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//test ng class
public class VerifyLoginPage {
	@Test
	public void veryfylogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kartikks\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("D:\\Chennai VnV batch\\m4\\Demos\\POM\\misAppp.html");
		driver.manage().window().maximize();
		LoginPage login = new LoginPage(driver);
		login.typeusername();
		login.typepassword();		
	}

}
