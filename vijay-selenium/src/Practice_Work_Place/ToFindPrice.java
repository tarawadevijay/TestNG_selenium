package Practice_Work_Place;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindPrice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("poco",Keys.ENTER);
 //driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		String price = driver.findElement(By.xpath("//div[text()='POCO X3 (Cobalt Blue, 64 GB)']/../..//div[contains(text(),'14,499')]")).getText();
		System.out.println(price);
		
	}

}
 