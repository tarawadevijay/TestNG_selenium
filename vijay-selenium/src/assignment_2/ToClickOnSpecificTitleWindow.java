package assignment_2;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOnSpecificTitleWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		int count=0;
		String expectedTitle = "prokarma";
		Set<String> allWids = driver.getWindowHandles();
		for(String Wid:allWids) {
			driver.switchTo().window(Wid);
			if(expectedTitle.equalsIgnoreCase(driver.getTitle())){
				break;
			}
			driver.close();
		} 

	}

}
