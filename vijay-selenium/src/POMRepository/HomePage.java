 package POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
     
	public HomePage(WebDriver driver)  {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Organizations")
	private WebElement Organizationslink;
	
	@FindBy(linkText="Documents")
	private WebElement Documentslink;

	public WebElement getOrganizationslink() {
		return Organizationslink;
	}

	public WebElement getDocumentslink() {
		return Documentslink;
	}
	
}    
