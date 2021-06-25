package CrossBrowser;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_01TestCase extends BaseClass1 {
     
	@Test
	public void createData()  {
		
		driver.findElement(By.linkText("Contacts")).click();
	}
}
