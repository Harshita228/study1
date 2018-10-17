package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
/*import org.openqa.selenium.remote.DesiredCapabilities;*/

public class chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				System.setProperty("webdriver.chrome.driver", "D:/harshita/selenium jars/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("file:///D:/harshita/html/loan.html");
			}

	}

