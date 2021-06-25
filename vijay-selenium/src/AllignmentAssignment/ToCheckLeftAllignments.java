package AllignmentAssignment;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckLeftAllignments {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Point point=driver.findElement(By.name("email")).getLocation();
		Point point1=driver.findElement(By.name("pass")).getLocation();
		int a=point.getX();
		int b=point1.getX();
		System.out.println(a);
		if(a==b){
			System.out.println("proprrly left allignment");
		}
		else{
			System.out.println("left Allignment is not properly");
		}
	}
}
