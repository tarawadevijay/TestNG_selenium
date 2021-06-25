import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalenderPopUpToSelectTodayDate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Actions actions=new Actions(driver);
		actions.click().perform();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		js.executeScript("window.scrollBy(0,200);");
		driver.findElement(By.xpath("//div[text()='June 2021']/../..//p[text()='27']")).click();
		js.executeScript("window.scrollBy(0,300);");


	}

}
