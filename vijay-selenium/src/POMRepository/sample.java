package POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
   /***
    * 
    * @author vijay T
    *
    */
public class sample {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		
		LoginPage loginpage=new LoginPage(driver);
		
        loginpage.getUsernameTextField().sendKeys("admin");
        loginpage.getPasswordTextField().sendKeys("root");
        loginpage.getLoginButton().click();
        
        LeadPage leadspage= new LeadPage(driver);
        leadspage.getLeadslink().click();
        
        HomePage homepage= new HomePage(driver);
        homepage.getOrganizationslink().click();
        homepage.getDocumentslink().click(); 
        
        
 
        
	}

}
