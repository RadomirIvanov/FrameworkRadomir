package utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CookiesHandler {

	public WebDriver driver;

	By acceptCookies = By.cssSelector("div[id=\"accept-choices\"]");

	public CookiesHandler(WebDriver driver) {
		this.driver = driver;
	}

	private boolean IsCookiesPopUpDisplayed(WebDriver driver) {
		List<WebElement> cookies = driver.findElements(acceptCookies);
		if (cookies.size() > 0) {
			return true;
		} else {
			return false;
		}
	}

	private WebElement GetCookiesElement(WebDriver driver) {
		return driver.findElement(acceptCookies);
	}

	public void HandleCookies(WebDriver driver) {

		if (IsCookiesPopUpDisplayed(driver)) {
			GetCookiesElement(driver).click();
		}
	}
}
