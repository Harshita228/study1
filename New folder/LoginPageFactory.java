package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	
	WebDriver driver;
	//creating parameterized constructor to initialize WebDriver reference
	public LoginPageFactory(WebDriver driver)
	{
		this.driver =driver;
	}
	
	@FindBy(id="txtUserName")
	@CacheLookup // to store the element in cache memory
	WebElement username;
	
	//using How class	
	@FindBy(how=How.ID, using="txtPassword")
	@CacheLookup
	WebElement password;
	
	//using Xpath
	@FindBy(how=How.XPATH, using="//*[@id='txtConfPassword']")
	@CacheLookup
	WebElement confrmpass;
	
	public void login_misapp(String un, String pass, String cpass)
	{
		username.sendKeys(un);
		password.sendKeys(pass);
		confrmpass.sendKeys(cpass);
		
	}
	public static void main(String args[])
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
