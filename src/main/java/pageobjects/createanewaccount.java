package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createanewaccount {
	
	
	
	WebDriver driver; 
	 
	public createanewaccount(WebDriver driver) { 
	 
	this.driver = driver; 
	PageFactory.initElements(driver, this); 
	 
	}
	
	@FindBy(xpath="//input[@id='firstname']")
	WebElement firstnamefield;
	
	public WebElement firstnamefield() {
		
		return firstnamefield;
	}
	
	@FindBy(xpath="//input[@id='lastname']")
	WebElement lastnamefield;
	
	public WebElement lastnamefield() {
		
		return lastnamefield;
	}
	
	@FindBy(xpath="//input[@id='email_address']")
	WebElement createaccountemailfield;
	
	public WebElement createaccountemailfield() {
		
		return createaccountemailfield;
	}
	
	@FindBy(xpath="//input[@id='password']")
	WebElement createaccountpassword;
	
	public WebElement createaccountpassword() {
		
		return createaccountpassword;
	}
	
	@FindBy(xpath="//input[@id='password-confirmation']")
	WebElement createaccountpasswordconformation;
	
	public WebElement createaccountpasswordconformation() {
		
		return createaccountpasswordconformation;
	}
	
	@FindBy(xpath="(//span[contains(text(),'Create an Account')])[1]")
	WebElement createanaccountbutton;
	
	public WebElement createanaccountbutton() {
		
		return createanaccountbutton;
	}
	
	@FindBy(xpath="//input[@name='is_subscribed']")
	WebElement newslettercheckbox;
	
	public WebElement newslettercheckbox() {
		
		return newslettercheckbox;
	}
	
	@FindBy(xpath="//body/div/main/descendant::div[7]")
	WebElement existingemailwarninigmsg;
	
	public WebElement existingemailwarninigmsg() {
		
		return existingemailwarninigmsg;
	}
	
	
	@FindBy(xpath="//div[@id='firstname-error']")
	WebElement firstnamefieldwarningmsg;
	
	public WebElement firstnamefieldwarningmsg() {
		
		return firstnamefieldwarningmsg;
	}
	
	@FindBy(xpath="//div[@id='lastname-error']")
	WebElement lastnamefieldwarningmsg;
	
	public WebElement lastnamefieldwarningmsg() {
		
		return lastnamefieldwarningmsg;
	}
	
	@FindBy(xpath="//div[@id='email_address-error']")
	WebElement emailfieldwarningmsg;
	
	public WebElement emailfieldwarningmsg() {
		
		return emailfieldwarningmsg;
	}
	
	@FindBy(xpath="//div[@id='password-error']")
	WebElement passwordfieldwarningmsg;
	
	public WebElement passwordfieldwarningmsg() {
		
		return passwordfieldwarningmsg;
	}
	
	@FindBy(xpath="//div[@id='password-confirmation-error']")
	WebElement conformpasswordfieldwarningmsg;
	
	public WebElement conformpasswordfieldwarningmsg() {
		
		return conformpasswordfieldwarningmsg;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
