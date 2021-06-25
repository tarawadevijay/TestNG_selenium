package AllignmentAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckRightAllignments {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Rectangle rect=driver.findElement(By.name("email")).getRect();
		Rectangle rect1=driver.findElement(By.name("pass")).getRect();
		int a=rect.getX() + rect.getWidth();
		int b=rect1.getX() + rect1.getWidth();
		System.out.println(a);
		System.out.println(b);
	if(a==b)
	{
		System.out.println("Right Allignment is properly.....");
	}
	else
	{
		System.out.println("not properly....");
	}


	}

}
