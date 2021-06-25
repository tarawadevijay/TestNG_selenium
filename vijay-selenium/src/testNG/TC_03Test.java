package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_03Test {
		   @Test(invocationCount=5,priority=1)
		   public void PlaceTheCursorOnMoreDropDownMenu() {   //test case
			   Reporter.log("PlaceTheCursorOnMoreDropDownMenu",true);
		   }
		   @Test(priority=2)
		   public void PlaceTheCursor() {   //test case
			   Reporter.log("PlaceTheCursor",true);
		   }
		}


