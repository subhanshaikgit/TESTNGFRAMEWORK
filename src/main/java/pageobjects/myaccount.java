package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myaccount {
	
	
	
	
	WebDriver driver; 
	 
	public myaccount(WebDriver driver) { 
	 
	this.driver = driver; 
	PageFactory.initElements(driver, this); 
	 
	}
	
	@FindBy(xpath="//body/div/main/descendant::div[6]")
	WebElement accountrigistersuccessmsg;
	
	public WebElement accountrigistersuccessmsg() {
		
		return accountrigistersuccessmsg;
	}

}
