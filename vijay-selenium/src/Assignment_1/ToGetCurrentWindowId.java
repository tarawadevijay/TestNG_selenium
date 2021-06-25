package Assignment_1;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetCurrentWindowId {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String wid =driver.getWindowHandle();
		System.out.println(wid);

	}

}
