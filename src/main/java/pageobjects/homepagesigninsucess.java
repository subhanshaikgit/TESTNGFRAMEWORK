package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepagesigninsucess {
	
	
	WebDriver driver; 
	 
	public homepagesigninsucess(WebDriver driver) { 
	 
	this.driver = driver; 
	PageFactory.initElements(driver, this); 
	 
	}
	@FindBy(xpath="(//span[contains(text(),'Default welcome msg!')])[1]")
	WebElement signinsuccessmsg;
	
	public WebElement signinsuccessmsg() {
		
		return signinsuccessmsg;
	}
	@FindBy(xpath="(//button[@type='button'])[1]")
	WebElement useraccountdropdown;
	
	public WebElement useraccountdropdown() {
		
		return useraccountdropdown;
	}

	@FindBy(xpath="//body/div/descendant::a[4]")
	WebElement signoutoption;
	
	public WebElement signoutoption() {
		
		return signoutoption;
	}
	
	
	

}
