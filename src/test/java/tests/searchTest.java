package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.homepage;
import pageobjects.searchresults;
import resources.base;

public class searchTest extends base {

	
	public WebDriver driver;

	@BeforeMethod
	public void opendriverapplication() {

		driver = intializedriver();
		driver.get("https://magento.softwaretestingboard.com/");

	}

	@AfterMethod
	public void testcloser() {

		driver.quit();

	}

	@Test(priority = 1)
	public void usershouldbesearchavalidproduct() {
		homepage homepage = new homepage(driver);
		homepage.searchbar().sendKeys("jackets");
		homepage.searchbutton().click();

		searchresults searchresults = new searchresults(driver);

		if (searchresults.searchresultconformation().isDisplayed()) {

			System.out.println("valid product results displayed");
		} else {
			System.out.println("valid product results not displayed");
		}

	}
	
	
	
	@Test(priority = 2)
	public void usershouldbesearchainvalidproduct() {
		
		homepage homepage = new homepage(driver);
		homepage.searchbar().sendKeys("honda");
		homepage.searchbutton().click();

		searchresults searchresults = new searchresults(driver);

		if (searchresults.noresultsfoundmsg().isDisplayed()) {

			System.out.println("no product results displayed");
		} else {
			System.out.println("valid product results displayed");
		}

	}
	
	
	
	
	
	
	
	
	
}
