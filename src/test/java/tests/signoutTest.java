package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.customerloginpage;
import pageobjects.homepagesigninsucess;
import resources.base;

public class signoutTest extends base {
	
	
	
	public WebDriver driver;
	public pageobjects.homepage homepage;

	@BeforeMethod
	public void opendriverapplication() {

		driver = intializedriver();
		driver.get("https://magento.softwaretestingboard.com/");
		homepage = new pageobjects.homepage(driver);
		homepage.signinoption().click();

		customerloginpage customerlogin = new customerloginpage(driver);

		customerlogin.emailfield().sendKeys("sksubhani11@gmail.com");
		customerlogin.passwordfield().sendKeys("password11@#");
		customerlogin.signinbutton().click();

		homepagesigninsucess homepagesigninsuccess = new homepagesigninsucess(driver);

		if (homepagesigninsuccess.signinsuccessmsg().isDisplayed()) {

			System.out.println("(Welcome, sk subhani!) text is displayed");
		} else {
			System.out.println("warning text is not displayed ");
		}

	}

	@AfterMethod
	public void testcloser() {

		driver.quit();

	}

	@Test(priority = 1)
	public void UserSignoutfromWelcomeUserAccountDropdowninsignoutOption() {

		homepagesigninsucess homepagesigninsuccess = new homepagesigninsucess(driver);

		homepagesigninsuccess.useraccountdropdown().click();
		homepagesigninsuccess.signoutoption().click();

		if (homepage.createanaccountoption().isDisplayed()) {

			System.out.println("createanaccount option is displayed");
		} else {
			System.out.println("createanaccount option is not displayed");
		}

	}

	@Test(priority = 2)
	public void UserCheckstheSignoutfromwithoutclickSignoutoption() {

		driver.get("https://magento.softwaretestingboard.com/");

		homepagesigninsucess homepagesigninsuccess = new homepagesigninsucess(driver);

		if (homepagesigninsuccess.useraccountdropdown().isDisplayed()) {

			System.out.println("user is didn't logout after application closed");
		} else {
			System.out.println("user is logout after application closed");
		}

	}
	
	
	
	
	
	

}
