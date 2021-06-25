package ToAbstractMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToFullsreen {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().fullscreen();

	}

}
