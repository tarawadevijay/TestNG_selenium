package Assignment_1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoScrollingUsingFindElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String parentwid=driver.getWindowHandle();
		Set<String>allwid=driver.getWindowHandles();
		allwid.remove(parentwid);
		for(String wid:allwid)
			driver.switchTo().window(wid);
		driver.close();
		driver.switchTo().window(parentwid);
		driver.findElement(By.xpath("//button[text()='GOT IT']")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Explore Courses")).click();
	}
}
