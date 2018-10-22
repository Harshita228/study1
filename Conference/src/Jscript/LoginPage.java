package Jscript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	WebDriver driver;	
By username= By.id("txtUserName");
By password = By.xpath("//*[@id='txtPassword']");

//creating parameterized constructor to initialize WebDriver reference
public LoginPage(WebDriver driver)
{
	this.driver =driver;
}
public void typeusername() throws InterruptedException
{
	driver.findElement(username).sendKeys("harshita");
	System.out.println("username located");
	Thread.sleep(2000);
}

public void typepassword() throws InterruptedException {
	driver.findElement(password).sendKeys("capgemini");
	System.out.println("password located");
	Thread.sleep(2000);
}

public static void main(String args[]) throws InterruptedException
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

