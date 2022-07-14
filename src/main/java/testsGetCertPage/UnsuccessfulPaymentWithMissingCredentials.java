package testsGetCertPage;

import java.io.IOException;
import java.util.InvalidPropertiesFormatException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseAndResourses.Base;
import pageObjects.GetCertPage;
import pageObjects.MainPage;

public class UnsuccessfulPaymentWithMissingCredentials extends Base {
	@BeforeTest
	public void initialize() throws InvalidPropertiesFormatException, IOException {
		super.initialize("urlGetCert");
	}

	@Test
	public void unsuccessfulPaymentMissingCredentials() throws InterruptedException {
		GetCertPage gc = new GetCertPage(driver);
		gc.getShopPopUpMessage().click();
		gc.getWebDevelopCourse().click();
		gc.getBuyNowButton().click(); // tag.value(parent) tab.value(child)
		gc.ClickContinueToPayment();
		Thread.sleep(2000);
		Assert.assertTrue(gc.getEnterEmailErrorMessage().isDisplayed(), "Error message is not displayed,continue playment is broken!");
	}

	@AfterTest
	public void driverClose() {
		driver.quit();
		driver = null;
	}
}
