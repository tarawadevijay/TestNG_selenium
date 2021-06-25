package assignment_2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToEnterTheDataIntoTextField {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("8698488250");
		driver.findElement(By.name("pass")).sendKeys("vijay");
		driver.findElement(By.className("_9luh")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();

	}

}
