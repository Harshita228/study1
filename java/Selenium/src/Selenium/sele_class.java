package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class sele_class {

	public static void main(String[] args) throws InterruptedException {
		// Step-1 launch empty browser
		System.setProperty("webdriver.chrome.driver","D:/harshita/selenium jars/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		// Step-2 navigate to APP/URL
		driver.get("D:\\harshita\\Chennai VNV batch\\m4\\ConferenceRegistartion.html");
	
		driver.manage().window().maximize();
		
		//step-3 to identify an element and perform an action
		driver.findElement(By.id("txtFirstName")).sendKeys("harshita");
		driver.findElement(By.id("txtLastName")).sendKeys("ahuja");
		driver.findElement(By.id("txtEmail")).sendKeys("harshitaahuja@gmail.com");
		driver.findElement(By.id("txtPhone")).sendKeys("7894561230");
		
		WebElement size = driver.findElement(By.name("size"));
		Select sel = new Select(size);
		sel.selectByIndex(1);
		
		driver.findElement(By.id("txtAddress")).sendKeys("rohini,");
		driver.findElement(By.id("txtAddress2")).sendKeys("delhi");
		
		//WebElement city = ;
		Select cit = new Select(driver.findElement(By.name("city")));
		cit.selectByIndex(2);
		
		WebElement state = driver.findElement(By.name("state"));
		Select state1 = new Select(state);
		state1.selectByIndex(2);
		
		//selecting radio button
		List<WebElement> list = driver.findElements(By.name("conference"));
		//Boolean is_selected = list.get(0).isSelected();
		//if (is_selected == true) {
			list.get(1).click();
		//} else {
		//	list.get(1).click();
		//	}
		
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[14]/td/a")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		//driver.findElement(By.xpath("//*[@id='txtFirstName']")).sendKeys("Kavya");
	//	driver.getCurrentUrl();
		//dr
	}

}