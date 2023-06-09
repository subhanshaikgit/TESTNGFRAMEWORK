package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchresults {
	
	
	WebDriver driver; 
	 
	public searchresults(WebDriver driver) { 
	 
	this.driver = driver; 
	PageFactory.initElements(driver, this); 
	 
	}
	
	@FindBy(xpath="(//p[@id='toolbar-amount'])[1]")
	WebElement searchresultconformation;
	
	public WebElement searchresultconformation() {
		
		return searchresultconformation;
	}
	
	@FindBy(xpath="//div[@class='message notice']/div")
	WebElement noresultsfoundmsg;
	
	public WebElement noresultsfoundmsg() {
		
		return noresultsfoundmsg;
	}
	
	
	
	
	
	
	

}
