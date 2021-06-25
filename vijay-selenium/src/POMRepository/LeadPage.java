package POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadPage {
   
	public LeadPage(WebDriver driver) {
		  PageFactory.initElements(driver, this);
			}
			@FindBy(linkText="Leads")
			private WebElement Leadslink;
			
			
			public WebElement getLeadslink() {
				return Leadslink;
			}
}