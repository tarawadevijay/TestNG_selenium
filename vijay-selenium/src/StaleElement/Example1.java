package StaleElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions actions=new Actions(driver);
		driver.get("https://www.makemytrip.com/");
		actions.click().perform();
		driver.findElement(By.linkText("Hotels")).click();
       driver.findElement(By.linkText("Villas & Apts")).click();
	}

}
 