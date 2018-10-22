package Selenium;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;



public class WebDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxProfile profile = new FirefoxProfile();
		System.setProperty("webdriver.firefox.bin", "C:\\Users\\haahuja\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette","false");
		////FirefoxOptions options = new FirefoxOptions();
		FirefoxDriver driver = new FirefoxDriver(profile);
		driver.get("D:\\harshita\\Chennai VNV batch\\m4\\ConferenceRegistartion.html");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Conference Registration";
		if(expectedTitle.equalsIgnoreCase(actualTitle))
		{
			System.out.println("Title case passed");
		}
		else
		{
			System.out.println("Title case failed");
		}
	}

}
