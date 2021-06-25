package TakeScreenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToTakeScreenshotOfEntireWebPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(3000);
		TakesScreenshot ts= (TakesScreenshot)driver;
		File tempfile = ts.getScreenshotAs(OutputType.FILE);
		File distfile = new File("./errorshot/webpage1.png");
		tempfile.renameTo(distfile);

	}

}
