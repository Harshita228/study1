
package Selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


public class Firefox {

	public static void main(String[] args)
	{
		//Step-1 launch empty browser
		System.setProperty("webdriver.firefox.bin",
				"C:\\Users\\haahuja\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		/*FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("network.proxy.type", 1);
		profile.setPreference("network.proxy.http", "localhost");
		profile.setPreference("network.proxy.http_port", 8080);
		profile.setPreference("network.proxy.ssl", "localhost");
		profile.setPreference("network.proxy.ssl_port", 8080);*/
		
		FirefoxDriver driver = new FirefoxDriver();
				
				//Step-2 navigate to APP/URL
				driver.get("D:/harshita/html/FormExamples.html");
				
				/*
				//Step-3 to identify an element and perform a action
				driver.findElement(By.id("txtFirstName")).sendKeys("Rosy");
				driver.findElement(By.name("txtLN")).sendKeys("John");
				driver.findElement(By.name("Email")).sendKeys("john@gmail.com");
				driver.findElement(By.name("Phone")).sendKeys("9678965454");
				
				Select number = new Select(driver.findElement(By.name("size")));
				number.selectByIndex(1);
				
				driver.findElement(By.name("Address")).sendKeys("address");
				driver.findElement(By.name("Address2")).sendKeys("addressline");
				
				Select city = new Select(driver.findElement(By.name("city")));
				city.selectByIndex(1);
				
				Select state = new Select(driver.findElement(By.name("state")));
				state.selectByIndex(1);
				
				WebElement radio1 = driver.findElement(By.xpath("html/body/form/table/tbody/tr[12]/td[2]/input"));
				radio1.click();
				
				driver.findElement(By.linkText("Next")).click();
				*/
	}
	}

