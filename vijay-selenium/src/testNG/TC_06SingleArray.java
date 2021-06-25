package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_06SingleArray {
     
	  @DataProvider
	  public String[] sendData() {
		    String[] sarr = {"admin","manager"};
		    return sarr;
		    
	  }
       @Test(dataProvider="sendData")
       public void verifuAccount(String username)  {
    	  WebDriver driver=new ChromeDriver();
    	  driver.manage().window().maximize();
    	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	  driver.get("https://demo.actitime.com/login.do");
    	  driver.findElement(By.id("username")).sendKeys(username);
    	  driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
       }  
    	  
       }
