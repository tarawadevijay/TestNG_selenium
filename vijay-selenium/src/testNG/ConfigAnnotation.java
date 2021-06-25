package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigAnnotation {
	   @BeforeTest
	   public void beforeTest()  {
		   Reporter.log("beforeTest",true);
	   }
	   @AfterTest
	   public void afterTest()  {
		   Reporter.log("afterTest",true);
	   }
	   @BeforeSuite
	   public void beforeSuite()  {
		   Reporter.log("beforeSuite",true);
	   }
	   @AfterSuite
	   public void aftersuite()  {
		   Reporter.log("aftersuite",true);
	   }
	   @BeforeClass
	   public void beforeclass()  {
		   Reporter.log("beforeclass",true);
	   }
	   @AfterClass
	   public void afterclass()  {
		   Reporter.log("afterclass",true);
	   }
	   @BeforeMethod
	   public void beforemethod()  {
		   Reporter.log("beforemethod",true);
	   }
	   @AfterMethod
	   public void aftermethod()  {
		   Reporter.log("aftermethod",true);
	   }
      @Test
      public void method1()  {
    	  Reporter.log("from method 1",true);
      }
      }
