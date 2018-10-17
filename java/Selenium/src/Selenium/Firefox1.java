package Selenium;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Firefox1 {

	
	public static void main(String args[])
	{
		FirefoxProfile profile = new FirefoxProfile();
		System.setProperty("webdriver.firefox.bin", "C:\\Users\\haahuja\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette","false");
		////FirefoxOptions options = new FirefoxOptions();
		FirefoxDriver driver = new FirefoxDriver(profile);
		driver.get("file:///C:/Users/haahuja/Desktop/harshita_158155 MTP/section 2/registration.html");
	}
}
