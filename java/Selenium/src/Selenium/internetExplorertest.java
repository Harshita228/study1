package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class internetExplorertest
{
	public static void main(String[] args) throws InterruptedException
	{
		//Step-1 launch empty browser
		System.setProperty("webdriver.ie.driver","D:\\harshita\\selenium jars\\iedriverserver.exe");
		DesiredCapabilities caps=DesiredCapabilities.internetExplorer();
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		WebDriver driver=new InternetExplorerDriver(caps);
		
		
		driver.get("https://demo.opencart.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(500);
		//driver.quit();	
	}
}