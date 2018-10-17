package Selenium;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


public class ExplicitDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		//FirefoxProfile profile=new FirefoxProfile();
		System.setProperty("webdriver.firefox.bin","C:\\Users\\haahuja\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("network.proxy.type",1);
		profile.setPreference("network.proxy.http", "10.219.96.26");
		profile.setPreference("network.proxy.http_port",8080);
		profile.setPreference("network.proxy.ssl","10.219.96.26");
		profile.setPreference("network.proxy.ssl_port",8080);
		
		FirefoxDriver driver= new FirefoxDriver(profile);
		//driver.manage().timeout().implicitlyWait(20, TimeUnit.SECONDS);\
		String base="https://demo.opencart.com/";
		driver.navigate().to(base);
		System.out.println(driver.getTitle());
		//driver.quit();
	}

}
