package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_05Smoke {
     
	@Test(groups= { "smoke","regression"})
	public void createprofile()  {
	Reporter.log("createprofile",true);	
	}
	@Test(groups= "smoke")
	public void deleteProfile()  {
	Reporter.log("deleteProfile",true);	
	}
	@Test(groups= "regression")
	public void modifyProfile()  {
	Reporter.log("modifyProfile",true);	
	}
    
}
