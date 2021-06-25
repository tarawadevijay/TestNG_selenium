package testNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_09TestExtend extends BaseClass {
      @Test
      public void test1() throws InterruptedException  {
    	  driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td[4]/a"));
    	  Thread.sleep(4000);
      }
}
