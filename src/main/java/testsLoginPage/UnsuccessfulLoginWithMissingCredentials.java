package testsLoginPage;

import java.io.IOException;
import java.util.InvalidPropertiesFormatException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseAndResourses.Base;
import pageObjects.LoginPage;

public class UnsuccessfulLoginWithMissingCredentials extends Base{
	@BeforeTest
	public void initialize() throws InvalidPropertiesFormatException, IOException {
		super.initialize("urlLogin");

	}

	@Test
	public void unsuccessfulLoginWithMissingCredential() {
		LoginPage lp = new LoginPage(driver);
		lp.getLoginButton().click();
		Assert.assertTrue(lp.getPlsEnterEmailTextErrorMessage().isDisplayed() , "Login is broke, error message is missing!");
		

	}

	@AfterTest
	public void driverClose() {
		driver.quit();
		driver = null;
	}
}
