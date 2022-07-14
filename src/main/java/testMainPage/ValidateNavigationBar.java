package testMainPage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.InvalidPropertiesFormatException;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseAndResourses.Base;
import pageObjects.MainPage;

public class ValidateNavigationBar extends Base {

	@BeforeTest
	public void initialize() throws InvalidPropertiesFormatException, IOException {
		super.initialize("urlMain");
	}

	@Test
	public void validateNavigationBar() {
		MainPage mp = new MainPage(driver);
		String[] expectedOptions = { "Tutorials", "References", "Videos", "Exercises" };
		List<String> actualOptions = mp.GetHeaderOptionTitles(driver);
		for (String option : actualOptions) {
			System.out.println(option);
		}

		for (String expected : expectedOptions) {
			Assert.assertTrue(actualOptions.contains(expected), "Option '" + expected
					+ "' was not found in the actual options. Actual options are: " + actualOptions);
		}
		Assert.assertTrue(mp.getNavigationBar().isDisplayed(), "Navigation bar is not displayed!");

	}

	@AfterTest
	public void driverClose() {
		driver.quit();
		driver = null;
	}
}
