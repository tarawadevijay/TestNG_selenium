package CrossBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.seleniumhq.jetty9.server.handler.AllowSymLinkAliasChecker;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;



public class BaseClass1 {

	public static WebDriver driver;
	@Parameters("browser")
	   @BeforeTest(alwaysRun=true)
	   public void beforeTest (@Optional("chrome") String browserName)  {
		   Reporter.log("beforeTest",true);
		   if(browserName.equalsIgnoreCase("Chrome")) {
			   driver=new ChromeDriver();
		   }else if (browserName.equalsIgnoreCase("Firefox")) {
			   System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			 //  WebDriverManager.firefoxdriver().setup(();)
			   driver=new FirefoxDriver();
		   }
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   }
	   @AfterTest(alwaysRun=true)
	   public void afterTest()  {
		   Reporter.log("afterTest",true);
	   }
	   @BeforeSuite(alwaysRun=true)
	   public void beforeSuite()  {
		   Reporter.log("beforeSuite",true);
	   }
	   @AfterSuite(alwaysRun=true)
	   public void aftersuite()  {
		   Reporter.log("aftersuite",true);
	   }
	   @BeforeClass(alwaysRun=true)
	   public void beforeclass()  {
		   Reporter.log("beforeclass",true);
		   WebDriver driver= new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   }
	   @AfterClass(alwaysRun=true)
	   public void afterclass()  {
		   Reporter.log("afterclass",true);
		   
	   }
	   @BeforeMethod(alwaysRun=true)
	   public void beforemethod()  {
		   Reporter.log("beforemethod",true);
		  WebDriver driver= new ChromeDriver();
		   driver.get("http://localhost:8888/");
		   driver.findElement(By.name("user_name")).sendKeys("admin");
		   driver.findElement(By.name("user_password")).sendKeys("root",Keys.ENTER);
	   }
	   @AfterMethod(alwaysRun=true)
	   public void aftermethod()  {
		   Reporter.log("aftermethod",true);
	   }
  
   }



