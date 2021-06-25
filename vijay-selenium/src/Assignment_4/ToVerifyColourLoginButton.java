package Assignment_4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyColourLoginButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		String color= driver.findElement(By.xpath("//button[@name='login']")).getCssValue("background-color");
        System.out.println(color);
        driver.close();
	}

}
