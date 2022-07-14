package testMainPage;

import java.io.IOException;
import java.util.InvalidPropertiesFormatException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseAndResourses.Base;
import pageObjects.LearnJavaPage;
import pageObjects.MainPage;

public class ValidateLearnJavaButton extends Base {

	@BeforeTest
	public void initialize() throws InvalidPropertiesFormatException, IOException {
		super.initialize("urlMain");
	}

	@Test
	public void ValidateLearnJavaButtonn() {
		MainPage mp = new MainPage(driver);
		LearnJavaPage lj = new LearnJavaPage(driver);
		mp.getTutorialsButton().click();
		mp.getLearnJavaButton().click();
		String expectedHeader = "Java Tutorial";
		String actualHeader = lj.getJavaTutorialLeftHeader().getText();
		Assert.assertEquals(actualHeader, expectedHeader , "Header is wrong!");

	}

	@AfterTest
	public void driverClose() {
		driver.quit();
		driver = null;
	}
}
