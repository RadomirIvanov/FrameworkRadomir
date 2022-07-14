package testMainPage;

import java.io.IOException;
import java.util.InvalidPropertiesFormatException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseAndResourses.Base;
import pageObjects.GetCertPage;
import pageObjects.MainPage;

public class ValidateGetCertifiedButton extends Base {
	@BeforeTest
	public void initialize() throws InvalidPropertiesFormatException, IOException {
		super.initialize("urlMain");
	}

	@Test
	public void getCertButtonDisplayed() {
		MainPage mp = new MainPage(driver);
		Assert.assertTrue(mp.getCertifiedButoon().isDisplayed(), "GetCertified button is missing!");
	}

	@AfterTest
	public void driverClose() {
		driver.quit();
		driver = null;
	}
}
