package Junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class ConferenceTest {
	 static WebDriver driver;

	@BeforeClass public static void setPro(){
		System.setProperty("webdriver.firefox.bin","C:\\Users\\kartikks\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("newtwork.proxy.type",1);
		profile.setPreference("newtwork.proxy.http","chnproxy.igate.com");
		profile.setPreference("newtwork.proxy.http_port",8080);
		profile.setPreference("network.proxy.ssl", "chnproxy.igate.com");
		profile.setPreference("network.proxy.ssl_port", 8080);
		driver = new FirefoxDriver();
	}
	@Before
	public void launchBrowser(){


		baseUrl = "file:///D:/Chennai%20VnV%20batch/m4/ConferenceRegistartion.html";
//		//Manage the window
//		driver.manage().window().maximize();
//		driver.manage().window().setPosition(new Point(50, 50));

		driver.get(baseUrl);
	}
	@Test
	public void testTitle() {
		assertEquals("Conference Registration", driver.getTitle());	
	}

	
	
}
