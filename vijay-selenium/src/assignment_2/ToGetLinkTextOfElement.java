package assignment_2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetLinkTextOfElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();							
		driver.get("https://support.hp.com/in-en/drivers/laptops");
		String toolTipText=driver.findElement(By.id("signInHeaderLink")).getText();
		System.out.println(toolTipText);

	}

}
