package Assignment_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleGetUrlGetSourcePages {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.Flipkart.com/");
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		String source=driver.getPageSource();
		System.out.println(source);
		
	}

}
