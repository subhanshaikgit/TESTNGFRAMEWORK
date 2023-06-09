package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	
	
	WebDriver driver; 
	 
	public homepage(WebDriver driver) { 
	 
	this.driver = driver; 
	PageFactory.initElements(driver, this); 
	 
		
	}
	
	
	@FindBy(xpath="(//a[contains(text(),'Sign In')])[1]")
	WebElement signinoption;
	
	public WebElement signinoption() {
		
		return signinoption;
	}
	
	@FindBy(xpath="(//a[contains(text(),'Create an Account')])[1]")
	WebElement createanaccountoption;
	
	public WebElement createanaccountoption() {
		
		return createanaccountoption;
	}
	
	@FindBy(xpath="//input[@id='search']")
	WebElement searchbar;
	
	public WebElement searchbar() {
		
		return searchbar;
	}
	
	@FindBy(xpath="(//div[@class='actions']/child::button)[1]")
	WebElement searchbutton;
	
	public WebElement searchbutton() {
		
		return searchbutton;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
