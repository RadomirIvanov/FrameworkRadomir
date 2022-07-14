package testMainPage;

import java.io.IOException;
import java.util.InvalidPropertiesFormatException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseAndResourses.Base;
import pageObjects.MainPage;

public class ValidateHeader3 extends Base {

	@BeforeTest
	public void initialize() throws InvalidPropertiesFormatException, IOException {
		super.initialize("urlMain");
	}

	@Test
	public void validateHeader3() {
		MainPage mp = new MainPage(driver);
		String actualHeader3 = mp.getHeader3().getText();
		String expectedHeader3 = "With the world's largest web developer site.";
		Assert.assertEquals(actualHeader3, expectedHeader3);
	}

	@AfterTest
	public void driverClose() {
		driver.quit();
		driver = null;
	}
}
