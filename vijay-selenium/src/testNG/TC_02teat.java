package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_02teat {   //testNG class
   @Test(priority=1)
   public void PlaceTheCursorOnMoreDropDownMenu() {   //test case
	   Reporter.log("PlaceTheCursorOnMoreDropDownMenu",true);  //test step
   }
   @Test(priority=2)
   public void PlaceTheCursor() {   //test case
	   Reporter.log("PlaceTheCursor",true);
   }
}
 