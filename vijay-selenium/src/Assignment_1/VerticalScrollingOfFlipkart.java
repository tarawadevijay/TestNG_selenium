package Assignment_1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerticalScrollingOfFlipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();									
		driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//button[text()='✕']")).click();  
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(1110,444);");
	}

}
