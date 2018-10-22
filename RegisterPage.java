package seleniumGridUsingChrome;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class RegisterPage {

	static int count=0;
	WebDriver driver;
	By fname=By.id("txtFirstName");
	By lname= By.id("txtLastName");
	By email= By.id("txtEmail");
	By next=By.linkText("Next");
	By contact = By.xpath("//*[@id='txtPhone']");
	By head = By.cssSelector("body > h4");
	public static void main(String[] args) {
		RegisterPage registerPage= new RegisterPage();
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		registerPage.driver = new ChromeDriver();
		String baseUrl = "D:\\Himanshu Kataria\\Chennai VnV batch\\m4\\ConferenceRegistartion.html";
		//Manage the window
		registerPage.driver.manage().window().maximize();
		//driver.manage().window().setPosition(new Point(50, 50));

		//Test data ---------------------------------
		String expectedTitle = "Conference Registartion";
		String expectedHeading="Step 1: Personal Details";
		String expectedFNameErrorMessage="Please fill the First Name";
		String expectedLNameErrorMessage="Please fill the Last Name";
		String expEmailBlankErrMsg ="Please fill the Email";
		String expContactErrorMsg = "Please fill the Contact No.";
//registerPage.testData(expectedHeading,"","",null,registerPage.head,true)
		registerPage.driver.get(baseUrl);
		if(registerPage.testTitle(expectedTitle))
			if(registerPage.testHeading(expectedHeading)){
				if(registerPage.testData(expectedFNameErrorMessage,"","",null,registerPage.fname,true))
					System.out.println("First Name Error Message: Test Passed!");
				else
					System.out.println("First Name Error Message: Test Failed!");
				
				if(registerPage.testData(expectedLNameErrorMessage,"Kartik","",registerPage.fname,registerPage.lname,true))
					System.out.println("Last Name Error Message: Test Passed!");
				else
					System.out.println("Last Name Error Message: Test Failed!");
				if(registerPage.testData(expEmailBlankErrMsg,"Kumar","",registerPage.lname,registerPage.email,true))
					System.out.println("Email Error Message: Test Passed!");
				else
					System.out.println("Email Error Message: Test Failed!");
				
				if(registerPage.testData(expEmailBlankErrMsg,"Kumar","kartik.vg",registerPage.lname,registerPage.email,false))
					System.out.println("Email Error Message: Test Passed!");
				else
					System.out.println("Email Error Message: Test Failed!");
				
				if(registerPage.testData(expContactErrorMsg,"kartik@gmail.com","8898118",registerPage.email,registerPage.contact,true))
					System.out.println("Contact Error Message: Test Passed!");
				else
					System.out.println("Contact Error Message: Test Failed!");

			}
			else registerPage.driver.close();
		else registerPage.driver.close();
	}


	public void clearField(By by){
		driver.findElement(by).clear();
	}
	public boolean isElementPresent(By by){
		if(driver.findElements(by).size() != 0)
			return true;
		else
			return false;
	}
	public void enterData(By by, String data){
		driver.findElement(by).sendKeys(data);
	}
	public String getData(By by){
		return driver.findElement(by).getText();
	}
	public void clickSubmit(){
		driver.findElement(next).click();
	}
	public boolean testTitle(String expTitle){
		String actualTitle="";
		//boolean valid=false;
		actualTitle=driver.getTitle();
		if (actualTitle.contentEquals(expTitle)){
			System.out.println(actualTitle+": Title Test Passed!");
			return true;
		} else {
			System.out.println(actualTitle+": Title Test Failed");
			return false;
		}
	}
	public boolean testHeading(String expectedHeading){
		String actualHeading="";
		boolean valid=false;
		actualHeading=driver.findElement(head).getText().toString();
		//System.out.println(actualHeading);
		if (actualHeading.contentEquals(expectedHeading)){
			System.out.println(actualHeading+": Title Test Passed!");
			return valid=true;
		} else {
			System.out.println(actualHeading+": Title Test Failed");
			return valid=false;
		}
	}
	public boolean testData(String expErrMsg,String preData,String data,By preEle,By by, boolean isblank) {
		String actualErrorMsg="";
		String Msg="";
		boolean valid=false;
		if(isblank &&preEle!=null) enterData(preEle, preData);
		clickSubmit();
		//Alert Box
		//Switch the controller from Base window to alert window
		Alert alert = driver.switchTo().alert();
		actualErrorMsg=alert.getText();
		if (actualErrorMsg.contentEquals(expErrMsg)){
			alert.accept();//ok pressed
			return true;
		} else {
			//System.out.println("Email Error message: Test Failed");
			alert.accept();//ok pressed
			return false;
		}

	}


}
