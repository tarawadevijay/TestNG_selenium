package Assignment_4;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyLeftAllignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.tcsion.com/dotcom/TCSSMB/Login/login.html");
		driver.manage().window().maximize();
		Point point=driver.findElement(By.id("accountname")).getLocation();
		Point point1=driver.findElement(By.id("password")).getLocation();
		int togetx1=point.getX();
		int togetx2=point1.getX();
		System.out.println(togetx1);
		System.out.println(togetx2);
		if(togetx1==togetx2){
			System.out.println("left allignment is correct");
		}
		else{
			System.out.println("left Allignment is not correct");
		}
	}

}


