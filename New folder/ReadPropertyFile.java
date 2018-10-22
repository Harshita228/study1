package pages;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class ReadPropertyFile {
		public void TestConfig() throws Exception
	{
		// to access property file
		File src= new File("./config/myOR.config");
		FileInputStream fis = new FileInputStream(src);
		//to read the property file create an object of properties class
		Properties pro= new Properties();
		//to load property file
		pro.load(fis);
		// to fetch the key value from property file
		String str= pro.getProperty("url");
		System.out.println(str);
	}
	
	public static void main(String args[]) throws Exception
	{
		ReadPropertyFile read= new ReadPropertyFile();
		read.TestConfig();
	}
}

