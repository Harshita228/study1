package pages;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcel {
	public static void main(String[] args) throws Exception {
		File src= new File("D:/Data1.xlsx");
		//using Java API specify workbook path
		FileInputStream fis = new FileInputStream(src);
		//to load entire workbook use XSSFWorkbook class
		XSSFWorkbook wb1 = new XSSFWorkbook(fis);  //XSS used for .xlsx file
		//HSSFWorkbook wb1 = new HSSFWorkbook(fis); //HSS used for .xls file
		//to get the access of sheet 1 use XSSFSheet class
		XSSFSheet sheet1 = wb1.getSheetAt(0);
		/*//to read 1st row and col from sheet 1
		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data from Excel is " +data0);  */
		// to get the count of no. of rows present in sheet
		//	int rowcount = sheet1.getLastRowNum();
		//	System.out.println("Total no. of Rows" +rowcount);
				
		String username=sheet1.getRow(2).getCell(0).getStringCellValue();
		String password=sheet1.getRow(2).getCell(1).getStringCellValue();
				
		System.out.println(username);
		System.out.println(password);
				
		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/LoginDemoPage.html");
		driver.findElement(By.id("un")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.id("login")).click();
		driver.close();
		wb1.close();  
	}

}
