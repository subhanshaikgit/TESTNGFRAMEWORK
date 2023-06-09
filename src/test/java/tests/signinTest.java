package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.customerloginpage;
import pageobjects.homepage;
import pageobjects.homepagesigninsucess;
import resources.base;
import utilities.utils;

public class signinTest extends base {
	
	
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
	public void signinwithvalidcredentials() {
		homepage homepage = new homepage(driver);
		homepage.signinoption().click();

		customerloginpage customerlogin = new customerloginpage(driver);

		customerlogin.emailfield().sendKeys("sksubhani11@gmail.com");
		customerlogin.passwordfield().sendKeys("password11@#");
		customerlogin.signinbutton().click();

		homepagesigninsucess homepagesigninsuccess = new homepagesigninsucess(driver);
		// Assert.assertEquals(homepagesigninsuccess.signinsuccessmsg().getText(),
		// "Welcome, sk subhani!");
		if (homepagesigninsuccess.signinsuccessmsg().isDisplayed()) {

			System.out.println("(Welcome, sk subhani!) text is displayed");
		} else {
			System.out.println("warning text is not displayed ");
		}
	}

	@Test(priority = 2)
	public void signinwithinvalidcredentials() {

		homepage homepage = new homepage(driver);
		homepage.signinoption().click();

		customerloginpage customerlogin = new customerloginpage(driver);

		customerlogin.emailfield().sendKeys("something12@gmail.com");
		customerlogin.passwordfield().sendKeys("password000@#");
		customerlogin.signinbutton().click();

		// Assert.assertEquals(customerlogin.detailsmissmatchwarningmsg().getText(),
		// "The account sign-in was incorrect or your account is disabled temporarily.
		// Please wait and try again later.");
		// Assert.assertEquals(homepagesigninsuccess.signinsuccessmsg().getText(),
		// "Welcome, sk subhani!");
		if (customerlogin.detailsmissmatchwarningmsg().isDisplayed()) {

			System.out.println(
					"(The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.) text is displayed");
		} else {
			System.out.println("detailmissmatch warning text is not displayed ");
		}
	}

	@Test(priority = 3)
	public void signinwithvalidemailandinvalidpassword() {

		homepage homepage = new homepage(driver);
		homepage.signinoption().click();

		customerloginpage customerlogin = new customerloginpage(driver);

		customerlogin.emailfield().sendKeys("sksubhani11@gmail.com");
		customerlogin.passwordfield().sendKeys("password12236@#");
		customerlogin.signinbutton().click();

		// Assert.assertEquals(customerlogin.detailsmissmatchwarningmsg().getText(),
		// "The account sign-in was incorrect or your account is disabled temporarily.
		// Please wait and try again later.");
		if (customerlogin.detailsmissmatchwarningmsg().isDisplayed()) {

			System.out.println(
					"(The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.) text is displayed");
		} else {
			System.out.println("detailmissmatch warning text is not displayed ");
		}

	}

	@Test(priority = 4)
	public void signinwithinvalidemailandvalidpassword() {

		homepage homepage = new homepage(driver);
		homepage.signinoption().click();

		customerloginpage customerlogin = new customerloginpage(driver);

		customerlogin.emailfield().sendKeys(utils.generateemailwithtimestamp());
		customerlogin.passwordfield().sendKeys("password11@#");
		customerlogin.signinbutton().click();

		// Assert.assertEquals(customerlogin.detailsmissmatchwarningmsg().getText(),
		// "The account sign-in was incorrect or your account is disabled temporarily.
		// Please wait and try again later.");
		if (customerlogin.detailsmissmatchwarningmsg().isDisplayed()) {

			System.out.println(
					"(The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.) text is displayed");
		} else {
			System.out.println("detailmissmatch warning text is not displayed ");
		}
	}

	@Test(priority = 5)
	public void signinwithoutprovidinganydetails() {
		homepage homepage = new homepage(driver);
		homepage.signinoption().click();

		customerloginpage customerlogin = new customerloginpage(driver);

		customerlogin.emailfield().sendKeys("");
		customerlogin.passwordfield().sendKeys("");
		customerlogin.signinbutton().click();

		//Assert.assertEquals(customerlogin.emptyemailwarningmsg().getText(), "This is a required field.");
		if(customerlogin.emptyemailwarningmsg().isDisplayed()) {
			System.out.println("this is required fiels text displayed");
		}else {
			
			System.out.println("this is required fiels text not displayed");
		}
		Assert.assertEquals(customerlogin.emptypasswordwarningmsg().getText(), "This is a required field.");

	}

}
