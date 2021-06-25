package Assignment_4;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyRightAllignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.tcsion.com/dotcom/TCSSMB/Login/login.html");
		driver.manage().window().maximize();
		Rectangle rect=driver.findElement(By.id("accountname")).getRect();
		Rectangle rect1=driver.findElement(By.id("password")).getRect();
		int a=rect.getX() + rect.getWidth();
		int b=rect1.getX() + rect1.getWidth();
		System.out.println(a);
		System.out.println(b);
		if(a==b){
			System.out.println("...........Right Allignment is correct.........");
		}
		else{
			System.out.println("Right Allignment is not correct....");
		}
	}
}


