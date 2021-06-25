package Assignment_4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClearTextFieldWithOutUsingClear {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement toClear = driver.findElement(By.name("q"));
		toClear .sendKeys("HII SIR JI☹");
		Thread.sleep(3000);
		toClear .sendKeys(Keys.CONTROL + "a");
		toClear .sendKeys(Keys.DELETE);
	}
}
