package ref;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ConfPage {
	
	WebDriver driver;
	//creating parameterized constructor to initialize WebDriver reference
	public ConfPage(WebDriver driver)
	{
		this.driver =driver;
	}
	@FindBy(xpath="html/body/h4")
	WebElement heading;
	
	@FindBy(id="txtFirstName")
	@CacheLookup // to store the element in cache memory
	WebElement firstname;
	
	//using How class	
	@FindBy(how=How.NAME, using="txtLN")
	@CacheLookup
	WebElement lastname;
	
	//using Xpath
	@FindBy(how=How.ID, using="txtEmail")
	@CacheLookup
	WebElement email;
	
	//using Xpath
		@FindBy(how=How.NAME, using="Phone")
		@CacheLookup
		WebElement phonenumber;
		
		//using Xpath
				@FindBy(how=How.NAME, using="size")
				@CacheLookup
				WebElement ph;
				//using Xpath
				@FindBy(how=How.NAME, using="Address")
				@CacheLookup
				WebElement add;
				
				//using name for
				@FindBy(how=How.NAME, using="Address2")
				@CacheLookup
				WebElement add2;
				//using name for
				@FindBy(how=How.NAME, using="city")
				@CacheLookup
				WebElement add3;
				
				//using name for
				@FindBy(how=How.XPATH, using="html/body/form/table/tbody/tr[12]/td[2]/input")
				@CacheLookup
				WebElement RADIO1;
				
				@FindBy(linkText="Next")
				WebElement Next;
				
				
				
				
	public void login_misapp(String un, String pass, String cpass,String pn,String num,String ad,String addd,String sata)
	{
		firstname.sendKeys(un);
		lastname.sendKeys(pass);
		email.sendKeys(cpass);
		phonenumber.sendKeys(pn);
		ph.sendKeys(num);
		add.sendKeys(ad);
		add2.sendKeys(addd);
		add3.sendKeys(sata);
		RADIO1.click();
		Next.click();
	}
	public void enterFirstName(String fn)
	{
		firstname.sendKeys(fn);
	}
	public void enterLastName(String ln)
	{
		lastname.sendKeys(ln);
	}
	public void verifyTitle(String expected)
	{
		String actual = driver.getTitle();
		if(actual.contentEquals(expected))
		{
			System.out.println("Title Verification - Passed");
		}
		else
		{
			System.out.println("Title Verification - Failed");
			driver.quit();
		}
			
	}
	public void verifyHeading(String expected)
	{
		String actual = heading.getText();
		if(actual.contentEquals(expected))
		{
			System.out.println("Heading Verification - Passed");
			 
		}
		else
		{
			System.out.println("Heading Verification - Failed");
			driver.quit();
		}
			
	}
	public void verifyFirstName() throws InterruptedException  
	{
		Boolean fn=firstname.isDisplayed();
		if(fn=true) 
		{
			System.out.println("First Name textbox present");
			enterFirstName("");
			Next.click();
			Thread.sleep(3000);;
			Alert alert = driver.switchTo().alert();
			String expectedAlertMessage="Please fill the Name";
		    String actualAlertMessage= driver.switchTo().alert().getText();
		    if(expectedAlertMessage.contentEquals(actualAlertMessage))
		    {
		    	System.out.println("Alert message verification for first name - Passed");
		    	alert.accept();
		    	enterFirstName("Christy");
		    }
		    else
		    {
		    	System.out.println("Alert message verification for first name - Failed");
			}
		    
		}
		else
		{
			System.out.println("First Name textbox not present");
		}
		
	}
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("d:/ConferenceRegistartion.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//LoginPageFactory login = new LoginPageFactory(driver);
		
		//Initializing web element using initElement method
		
		ConfPage conf_page = PageFactory.initElements(driver, ConfPage.class);
		conf_page.enterFirstName("Christy");
		conf_page.enterLastName("Henitha");
		//conf_page.login_misapp("lokesh", "babu", "lokesh@gmail.com","9176120127","4","Mumbai","Maharashtra","Pune");
		
	}
}
