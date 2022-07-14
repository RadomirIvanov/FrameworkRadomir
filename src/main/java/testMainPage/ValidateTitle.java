package testMainPage;

import java.io.IOException;
import java.util.InvalidPropertiesFormatException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseAndResourses.Base;
import pageObjects.MainPage;

public class ValidateTitle extends Base {

	@BeforeTest
	public void initialize() throws InvalidPropertiesFormatException, IOException {
		super.initialize("urlMain");
	}

	@Test
	public void validateTitle() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "W3Schools Online Web Tutorials";
		Assert.assertEquals(actualTitle, expectedTitle , "The title is wrong!");
	}

	@AfterTest
	public void driverClose() {
		driver.quit();
		driver = null;
	}

}
