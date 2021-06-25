package Practice_Work_Place;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToIdentifyIrctc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctctourism.com/contactUs");
		String trainname = driver.findElement(By.xpath("//td[text()='8287930030']/..//td[contains(text(),'Maharajas')]")).getText();
		System.out.println(trainname);
		

	}

}
