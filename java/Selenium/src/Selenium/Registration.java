package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
	WebDriver driver;	
	By firstname= By.id("txtFirstName");
	By lastname= By.id("txtFirstName");
	
	public Registration(WebDriver driver)
	{
		this.driver =driver;
	}
	public void typeusername() throws InterruptedException
	{
		driver.findElement(username).sendKeys("Harshita");
		System.out.println("username located");
		Thread.sleep(2000);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

	

//creating parameterized constructor to initialize WebDriver reference



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