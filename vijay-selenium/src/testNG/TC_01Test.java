package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_01Test {
     @Test
     public void creatNewLead()  {
    	 Reporter.log("Runnig fron testNG inbuilt main method",true);
     }
}
