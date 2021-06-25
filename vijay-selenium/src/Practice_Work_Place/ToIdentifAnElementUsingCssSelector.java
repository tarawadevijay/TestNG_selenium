package Practice_Work_Place;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToIdentifAnElementUsingCssSelector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();							
		driver.get("https://www.facebook.com/");
		System.out.println(driver.findElement(By.cssSelector("button[value='1']")).getAttribute("value"));
		System.out.println(driver.findElement(By.cssSelector("button[value='1']")).getText());
	}
}
