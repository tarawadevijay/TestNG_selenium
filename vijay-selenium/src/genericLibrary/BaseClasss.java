package genericLibrary;


import java.util.concurrent.TimeUnit;
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


public class BaseClasss {
	
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		Reporter.log("beforeClass",true);	
	}
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("beforMethod",true);
	}
	@AfterMethod
	public void afterMethod() {
		Reporter.log("afterMethod",true);
	}
	@AfterClass
	public void AfterClass() {
		Reporter.log("AfterClass",true);
	} 
	@BeforeTest
	public void beforeTest() {
		Reporter.log("beforeTest",true);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterTest
	public void afterTest() {
		Reporter.log("afterTest",true);
		driver.quit();
	}
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("beforeSuite",true);
	}
	@AfterSuite
	public void afterSuite() {
		Reporter.log("afterSuite",true);
	}
}


