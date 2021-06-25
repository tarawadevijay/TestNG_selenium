package testNG;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
     
	public class BaseClass {
		public WebDriver driver;
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
			   WebDriver driver= new ChromeDriver();
			   driver.manage().window().maximize();
			   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   }
		   @AfterClass
		   public void afterclass()  {
			   Reporter.log("afterclass",true);
			   
		   }
		   @BeforeMethod
		   public void beforemethod()  {
			   Reporter.log("beforemethod",true);
			  WebDriver driver= new ChromeDriver();
			   driver.get("http://localhost:8888/");
			   driver.findElement(By.name("user_name")).sendKeys("admin");
			   driver.findElement(By.name("user_password")).sendKeys("root",Keys.ENTER);
		   }
		   @AfterMethod
		   public void aftermethod()  {
			   Reporter.log("aftermethod",true);
		   }
	     
	      }


