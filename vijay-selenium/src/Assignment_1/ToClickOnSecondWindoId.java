package Assignment_1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOnSecondWindoId {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		int count=0;
		Set<String>allwids=driver.getWindowHandles();
		for(String wid:allwids) {
			driver.switchTo().window(wid);
			count++;
			if(count==3) {
				break;
			}
			driver.findElement(By.id("")).click();
		}

	}

}
