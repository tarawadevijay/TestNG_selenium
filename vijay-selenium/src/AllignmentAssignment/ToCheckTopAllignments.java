package AllignmentAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckTopAllignments {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.tcsion.com/dotcom/TCSSMB/Login/login.html");
		driver.manage().window().maximize();
		Rectangle rect=driver.findElement(By.name("accountname")).getRect();
		Rectangle rect1=driver.findElement(By.name("password")).getRect();
		int space=5;
		int a=rect.getY() + rect.getHeight() + space;
		int b=rect1.getY();
		if (a<b){
			System.out.println("Properly Alligned");	
		}
		else {
			System.out.println("not alligned");
		}
	}
}
