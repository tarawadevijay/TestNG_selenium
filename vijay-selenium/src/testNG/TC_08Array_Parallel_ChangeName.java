package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_08Array_Parallel_ChangeName {

	@DataProvider(parallel=true,name="TestData")
	public String[][] sendData() {
		String[][] sarr ={
				{"admin","manager"},
				{"trainee","trainee"},
				{"vijay","tarawade"}
		};

		return sarr;  
	}

	@DataProvider
	public String[] senddata() { 
		String[]  sarr = {"trainee","trainee"};
		return sarr;	 
	}
	@Test(dataProvider= "TestData")
	public void verifyAccount(String[] firstData) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(firstData[0]);
		driver.findElement(By.name("pwd")).sendKeys(firstData[1]);
	}         
}
