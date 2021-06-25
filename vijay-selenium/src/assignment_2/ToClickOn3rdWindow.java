package assignment_2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOn3rdWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		int count=0;
		Set<String> allWids = driver.getWindowHandles();
		for(String Wid:allWids) {
			driver.switchTo().window(Wid);
			count++;
			if(count==3){
				break;
			}
			driver.findElement(By.id("")).click();
		}
	}
}
