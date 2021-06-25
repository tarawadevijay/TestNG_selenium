package Assignment_1;

import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToPrintWindowTittleInAlphabeticalOrder {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.naukri.com/");
			String parentwid=driver.getWindowHandle();
		    Set<String> allwids=driver.getWindowHandles();
		    for(String wid:allwids)
			{
				driver.switchTo().window(wid);
				TreeSet t1=new TreeSet();
				t1.add(wid);
		       System.out.println(driver.getTitle());
		 
		        
		        }

	}

}
