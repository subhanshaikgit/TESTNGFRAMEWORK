package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class customerloginpage {
	
	
	
	WebDriver driver; 
	 
	public customerloginpage(WebDriver driver) { 
	 
	this.driver = driver; 
	PageFactory.initElements(driver, this); 
	 
	}
	
	@FindBy(xpath="//input[@id='email']")
	WebElement emailfield;
	
	public WebElement emailfield() {
		
		return emailfield;
	}
	
	@FindBy(xpath="(//input[@id='pass'])[1]")
	WebElement passwordfield;
	
	public WebElement passwordfield() {
		
		return passwordfield;
	}
	
	@FindBy(xpath="(//span[contains(text(),'Sign In')])[1]")
	WebElement signinbutton;
	
	public  WebElement signinbutton() {
		
		return signinbutton;
	}
	@FindBy(xpath="//body/div/main/descendant::div[7]")
	WebElement detailsmissmatchwarningmsg;
	
	public WebElement detailsmissmatchwarningmsg() {
		
		return detailsmissmatchwarningmsg;
	}
	
	@FindBy(xpath="//div[@id='email-error']")
	WebElement emptyemailwarningmsg;
	
	public WebElement emptyemailwarningmsg() {
		
		return emptyemailwarningmsg;
	}
	@FindBy(xpath="//div[@id='pass-error']")
	WebElement emptypasswordwarningmsg;
	
	public WebElement emptypasswordwarningmsg() {
		
		return emptypasswordwarningmsg;
	}

	@FindBy(xpath="(//span[contains(text(),'Create an Account')])[1]")
	WebElement loginpagecreateanaccountbutton;
	
	public WebElement loginpagecreateanaccountbutton() {
		
		return loginpagecreateanaccountbutton;
	}
	
	
	
	
	
	

}
