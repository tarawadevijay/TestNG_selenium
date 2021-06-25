package Assignment_1;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToPrintTitleOfAllWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
   		driver.get("https://www.naukri.com/");	
		Set<String> allwids=driver.getWindowHandles();
	    for(String wid:allwids) 
		{
			driver.switchTo().window(wid);
	        System.out.println(driver.getTitle());
	         }
	}
}
