package Assignment_1;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetThePosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
											
		driver.get("https://www.youtube.com/");
		Point point=new Point(100,50);
		
		driver.manage().window().setPosition(point);

	}

}
