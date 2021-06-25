package Assignment_4;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTopAllignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.tcsion.com/dotcom/TCSSMB/Login/login.html");
		driver.manage().window().maximize();
		Rectangle rect=driver.findElement(By.name("accountname")).getRect();
		Point rect1=driver.findElement(By.name("password")).getLocation();
		int space=5;
		int topside1=rect.getY() + rect.getHeight() + space;
		int topside2=rect1.getY();
		System.out.println(topside1);
		System.out.println(topside2);
		if (topside1<topside2){
			System.out.println("......Top Allignment is corret.......");	
		}
		else {
			System.out.println("Top Allignment is not corret");
		}
	}
}


