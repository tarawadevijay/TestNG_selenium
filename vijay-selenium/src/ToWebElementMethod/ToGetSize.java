package ToWebElementMethod;
import org.openqa.selenium.Dimension;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Dimension dim = driver.findElement(By.id("email")).getSize();
		System.out.println(dim.getHeight());
		System.out.println(dim.getWidth());
	}
}
