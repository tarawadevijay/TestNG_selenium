package Assignment_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheImage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tcsion.com/dotcom/TCSSMB/Login/login.html");
		String element=  driver.findElement(By.xpath("//img[@alt='Login Banner']")).getAttribute("src");
		// String element = getAttribute("src");
		System.out.println(element);
	}

}
