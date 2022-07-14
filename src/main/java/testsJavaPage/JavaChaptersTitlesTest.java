package testsJavaPage;

import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseAndResourses.Base;
import pageObjects.LearnJavaPage;
import pageObjects.MainPage;

public class JavaChaptersTitlesTest extends Base {
	@BeforeTest
	public void initialize() throws InvalidPropertiesFormatException, IOException {
		super.initialize("urlJava");
	}

	@Test
	public void javaChaptersTitlesText() {
		LearnJavaPage lj = new LearnJavaPage(driver);
		
		List<String> buttonTitles = lj.getJavaChapterButtonsTitles();
		for(String title : buttonTitles) {
			System.out.println(title);
		}
		
		int chapterNumber=lj.getJavaChapterButtons().size();
		
//		for(int i=0;i<chapterNumber;i++) {
//			String chapterNames = lj.getJavaChapterButtons().get(i).getText();
//			System.out.print(chapterNames + " " + " ");
//			String expectedNames[] = {};
//			System.out.println(chapterNames);
//			Assert.assertEquals(chapterNames, expectedNames);
//			
//			//NOT FINISHED
//		}
		
	}

	@AfterTest
	public void driverClose() {
		driver.quit();
		driver = null;
	}
}
