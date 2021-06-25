package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_04Test {
   int a=5;
   @Test(invocationCount=2,priority=1,enabled=false)
   public void PlaceTheCursorOnMoreDropDownMenu()  {
	   Reporter.log("PlaceTheCursorOnMoreDropDownMenu",true);
   }
   @Test(priority=2,enabled=true)
   public void creatNewLead()  {
	   Reporter.log("creatNewLead",true);
   }
}
