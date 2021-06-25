package Manual_TestCase_Execution;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_TC_01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        ChromeDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8888/");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
        driver.findElement(By.name("user_password")).sendKeys("root");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"submitButton\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("a_12")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td[1]/a/img")).click();
        
	}

}
