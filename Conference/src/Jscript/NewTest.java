package Jscript;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	public static int a ;
	@BeforeClass
	public void b(){
		a=10;
		  System.out.println("Before CLASS RUNNING    -----");
	}
	@BeforeTest
	public void t(){
		 System.out.println("Before TSET RUNNING    -----");
	}
	
  @Test
  public void f() {
	  System.out.println("TEST RUNNING    -----"+a);
  }
}
