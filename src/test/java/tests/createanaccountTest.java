package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.createanewaccount;
import pageobjects.customerloginpage;
import pageobjects.homepage;
import pageobjects.myaccount;
import resources.base;
import utilities.utils;

public class createanaccountTest extends base {
	
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
	public void userhascreatedanaccountbymandatoryfields() {
		homepage homepage = new homepage(driver);
		homepage.createanaccountoption().click();

		createanewaccount createnewcustomeraccount = new createanewaccount(driver);

		createnewcustomeraccount.firstnamefield().sendKeys("shaik");
		createnewcustomeraccount.lastnamefield().sendKeys("subhani");
		createnewcustomeraccount.createaccountemailfield().sendKeys(utils.generateemailwithtimestamp());
		createnewcustomeraccount.createaccountpassword().sendKeys("password1234@#");
		createnewcustomeraccount.createaccountpasswordconformation().sendKeys("password1234@#");
		createnewcustomeraccount.createanaccountbutton().click();

		myaccount myaccount = new myaccount(driver);
		// Assert.assertEquals(homepagesigninsuccess.signinsuccessmsg().getText(),
		// "Welcome, sk subhani!");
		if (myaccount.accountrigistersuccessmsg().isDisplayed()) {

			System.out.println("new account created successfully");
		} else {
			System.out.println("account not created");
		}

	}

	@Test(priority = 2)
	public void userhascreatedanaccountbyallfields() {
		homepage homepage = new homepage(driver);
		homepage.createanaccountoption().click();

		createanewaccount createnewcustomeraccount = new createanewaccount(driver);

		createnewcustomeraccount.firstnamefield().sendKeys("shaik");
		createnewcustomeraccount.lastnamefield().sendKeys("subhan");
		createnewcustomeraccount.createaccountemailfield().sendKeys(utils.generateemailwithtimestamp());
		createnewcustomeraccount.createaccountpassword().sendKeys("password852@#");
		createnewcustomeraccount.createaccountpasswordconformation().sendKeys("password852@#");
		createnewcustomeraccount.newslettercheckbox().click();
		createnewcustomeraccount.createanaccountbutton().click();

		myaccount myaccount = new myaccount(driver);
		// Assert.assertEquals(homepagesigninsuccess.signinsuccessmsg().getText(),
		// "Welcome, sk subhani!");
		if (myaccount.accountrigistersuccessmsg().isDisplayed()) {

			System.out.println("new account created successfully");
		} else {
			System.out.println("account not created");

		}
	}

	@Test(priority = 3)
	public void userhascreatedanaccountbyduplecateaccount() {
		homepage homepage = new homepage(driver);
		homepage.createanaccountoption().click();

		createanewaccount createnewcustomeraccount = new createanewaccount(driver);

		createnewcustomeraccount.firstnamefield().sendKeys("sk");
		createnewcustomeraccount.lastnamefield().sendKeys("subhani");
		createnewcustomeraccount.createaccountemailfield().sendKeys("sksubhani11@gmail.com");
		createnewcustomeraccount.createaccountpassword().sendKeys("password11@#");
		createnewcustomeraccount.createaccountpasswordconformation().sendKeys("password11@#");
		createnewcustomeraccount.createanaccountbutton().click();

	//Assert.assertTrue(createnewcustomeraccount.existingemailwarninigmsg().isDisplayed());
		 //Assert.assertEquals(createnewcustomeraccount.existingemailwarninigmsg().getText(), "There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.");
		// "Welcome, sk subhani!");
		if (createnewcustomeraccount.existingemailwarninigmsg().isDisplayed()) {

			System.out.println("duplecate account warning msg displayed");
		} else {
			System.out.println("duplecate account warning msg not displayed");
		}

	}
	@Test(priority = 4)
	public void userhascreatedanaccountbywitoutprovidinganydetails() {
		homepage homepage = new homepage(driver);
		homepage.createanaccountoption().click();

		createanewaccount createnewcustomeraccount = new createanewaccount(driver);

		createnewcustomeraccount.firstnamefield().sendKeys(" ");
		createnewcustomeraccount.lastnamefield().sendKeys(" ");
		createnewcustomeraccount.createaccountemailfield().sendKeys(" ");
		createnewcustomeraccount.createaccountpassword().sendKeys(" ");
		createnewcustomeraccount.createaccountpasswordconformation().sendKeys(" ");
		createnewcustomeraccount.createanaccountbutton().click();

		
		Assert.assertEquals(createnewcustomeraccount.firstnamefieldwarningmsg().getText(), "This is a required field." );
		
		Assert.assertEquals(createnewcustomeraccount.firstnamefieldwarningmsg().getText(), "This is a required field." );
		Assert.assertEquals(createnewcustomeraccount.lastnamefieldwarningmsg().getText(), "This is a required field." );
		Assert.assertEquals(createnewcustomeraccount.emailfieldwarningmsg().getText(), "This is a required field." );
		Assert.assertEquals(createnewcustomeraccount.passwordfieldwarningmsg().getText(), "This is a required field." );
		Assert.assertEquals(createnewcustomeraccount.conformpasswordfieldwarningmsg().getText(), "This is a required field." );
		
	}
	@Test(priority=5)
	public void userhascreateanaccountfromcustomerloginpage() {
		
		homepage homepage = new homepage(driver);
		homepage.signinoption().click();
		customerloginpage customerlogin = new customerloginpage(driver); 
		customerlogin.loginpagecreateanaccountbutton().click();
		
		createanewaccount createnewcustomeraccount = new createanewaccount(driver);

		createnewcustomeraccount.firstnamefield().sendKeys("sk");
		createnewcustomeraccount.lastnamefield().sendKeys("subhani");
		createnewcustomeraccount.createaccountemailfield().sendKeys(utils.generateemailwithtimestamp());
		createnewcustomeraccount.createaccountpassword().sendKeys("password456@#");
		createnewcustomeraccount.createaccountpasswordconformation().sendKeys("password456@#");
		createnewcustomeraccount.createanaccountbutton().click();

		myaccount myaccount = new myaccount(driver);
		// Assert.assertEquals(homepagesigninsuccess.signinsuccessmsg().getText(),
		// "Welcome, sk subhani!");
		if (myaccount.accountrigistersuccessmsg().isDisplayed()) {

			System.out.println("new account created successfully");
		} else {
			System.out.println("account not created");
		}

}
	
	
	
	
	
	
	
	
	

}
