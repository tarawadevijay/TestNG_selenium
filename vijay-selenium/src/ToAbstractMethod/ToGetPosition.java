package ToAbstractMethod;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Point point=driver.manage().window().getPosition();
		System.out.println(point.getX());
		System.out.println(point.getY());

	}

}
