package Practice_Work_Place;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();							
		driver.get("https://uidai.gov.in/my-aadhaar/get-aadhaar.html");
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'References')]")).getText());
	}
}
