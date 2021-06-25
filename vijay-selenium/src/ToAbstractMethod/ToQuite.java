package ToAbstractMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToQuite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.quit();

	}

}
