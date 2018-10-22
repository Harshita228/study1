package Selenium;
import java.net.MalformedURLException;
	import java.net.URL;

	import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class chromegrid {

		public static void main(String[] args) throws InterruptedException, MalformedURLException 

		{
			
			
			System.setProperty("webdriver.chromedriver.driver", "D:\\harshita\\NewDrivers\\chrome\\chromedriver.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setBrowserName("chrome");
		capabilities.setCapability("webdriver.chromedriver.driver", "D:\\harshita\\NewDrivers\\chrome\\chromedriver.exe");
			
			capabilities.setPlatform(Platform.WINDOWS);
			//capabilities.setVersion(version);
			WebDriver driver = new RemoteWebDriver(new URL("http://localhost:6666/wd/hub"), capabilities);
	try {
			driver.get("http://demo.opencart.com/");
			System.out.println(driver.getTitle());
			
//			driver.quit();
	}
	catch(Exception ex){
		System.out.println("Hello");
	}
	//driver.quit();
		}
		
		}

