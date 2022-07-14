package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LearnJavaPage {
	public WebDriver driver;

	By javaTutorialLeftHeader = By.cssSelector("h2[class=\"left\"]");
	By javaChaptersButtons = By.cssSelector("div#leftmenuinnerinner > a");

	public LearnJavaPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getJavaTutorialLeftHeader() {
		return driver.findElement(javaTutorialLeftHeader);
	}

	public List<WebElement> getJavaChapterButtons() {
		return driver.findElements(javaChaptersButtons);
	}

	public List<String> getJavaChapterButtonsTitles() {
		List<WebElement> buttons = getJavaChapterButtons();
		List<String> titles = new ArrayList<String>();

		for (WebElement button : buttons) {
			titles.add(button.getText());
		}
		return titles;
	}
}
