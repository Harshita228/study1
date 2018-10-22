package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MyIEDemo {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.ie.driver","D:\\harshita\\NewDrivers\\IEDriverServer.exe");

DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

WebDriver driver = new InternetExplorerDriver(caps);
driver.get("http://demo.opencart.com/");

System.out.println(driver.getTitle());
Thread.sleep(800);
driver.quit();
}

}
