package Selenium;
import java.net.MalformedURLException;
	import java.net.URL;

	import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class chromegrid {

		public static void main(String[] args) throws InterruptedException, MalformedURLException 

		{
			System.setProperty("webdriver.ie.driver","D:\\harshita\\NewDrivers\\IE\\IEDriverServer.exe");
			DesiredCapabilities caps=DesiredCapabilities.internetExplorer();
			caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			WebDriver driver=new InternetExplorerDriver(caps);
			
			//System.setProperty("webdriver.chromedriver.driver", "D:\\harshita\\NewDrivers\\chrome\\chromedriver.exe");
			//DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			//capabilities.setBrowserName("chrome");
		//caps.setCapability("webdriver.chromedriver.driver", "D:\\harshita\\NewDrivers\\IE\\IEDriverServer.exe");
		/*		
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
		*/
		}
	}

