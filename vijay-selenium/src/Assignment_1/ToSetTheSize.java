package Assignment_1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetTheSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();									
		driver.get("https://www.instagram.com/");
		Dimension dimension=new Dimension(100,200);		
		driver.manage().window().setSize(dimension);
	}

}
