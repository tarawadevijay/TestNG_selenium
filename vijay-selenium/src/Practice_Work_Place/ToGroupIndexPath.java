package Practice_Work_Place;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGroupIndexPath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
	    List<WebElement> path= driver.findElements(By.tagName("a"));
	    for(WebElement ele:path) {
        System.out.println(ele.getText());
	    }
	} 

}
