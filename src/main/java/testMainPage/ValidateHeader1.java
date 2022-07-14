package testMainPage;

import java.io.IOException;
import java.util.InvalidPropertiesFormatException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseAndResourses.Base;
import pageObjects.MainPage;

public class ValidateHeader1 extends Base {

	@BeforeTest
	public void initialize() throws InvalidPropertiesFormatException, IOException {
		super.initialize("urlMain");
	}

	@Test
	public void validateHeader1() {
		MainPage mp = new MainPage(driver);
		String actualHeader1 = mp.getHeader1().getText();
		String expectedHeader1 = "Learn to Code";
		Assert.assertEquals(actualHeader1, expectedHeader1);
	}

	@AfterTest
	public void driverClose() {
		driver.quit();
		driver = null;
	}
}
