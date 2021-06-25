package Practice_Work_Place;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPrintReleaseDate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		String date = driver.findElement(By.xpath("//td[text()='Java']/..//td[@data-label='Release Date']")).getText();
		System.out.println(date);

	}

}
