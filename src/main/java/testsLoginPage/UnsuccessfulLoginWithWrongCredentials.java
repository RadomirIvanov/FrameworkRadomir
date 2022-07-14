package testsLoginPage;

import java.io.IOException;
import java.util.InvalidPropertiesFormatException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseAndResourses.Base;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class UnsuccessfulLoginWithWrongCredentials extends Base {

	@BeforeTest
	public void initialize() throws InvalidPropertiesFormatException, IOException {
		super.initialize("urlLogin");

	}

	@Test
	public void validateHeader1() {
		LoginPage lp = new LoginPage(driver);
		lp.getEmailField().sendKeys(prop.getProperty("invalidUsername"));
		lp.getPasswordField().sendKeys(prop.getProperty("invalidPassword"));
		lp.getLoginButton().click();
		Assert.assertTrue(lp.IsLoginMessageDisplayed(driver), "Login Error Message was not displayed");

	}

	@AfterTest
	public void driverClose() {
		driver.quit();
		driver = null;
	}

}
