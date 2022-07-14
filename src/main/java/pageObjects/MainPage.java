package pageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	public WebDriver driver;
	public Properties prop;

	By logo = By.cssSelector("i[class=\"fa fa-logo\"]");
	By navigationBar = By.cssSelector("div[class=\"w3-bar w3-card-2 notranslate\"]");
	By loginButton = By.cssSelector("a[id=\"w3loginbtn\"]");
	By searchField = By.cssSelector("input[type=\"text\"]");
	By searchButton = By.cssSelector("button[id=\"learntocode_searchbtn\"]");
	By header1 = By.cssSelector("h1[class=\"learntocodeh1\"]");
	By header3 = By.cssSelector("h3[class=\"learntocodeh3\"]");
	By getCertifiedButton = By.cssSelector("a[id=\"cert_navbtn\"]");
	By acceptCookies = By.cssSelector("div[id=\"accept-choices\"]");
	By headerOptions = By.cssSelector("div.w3-bar.notranslate a.w3-bar-item.w3-button.w3-hide-small.w3-padding-24");
	By tutorialsButton = By.cssSelector("a[id=\"navbtn_tutorials\"]");
	By learnJavaButton = By.cssSelector("a[href=\"/java/default.asp\"]");

	public MainPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getLogo() {
		return driver.findElement(logo);
	}

	public WebElement getNavigationBar() {
		return driver.findElement(navigationBar);
	}

	public WebElement getLoginButton() {
		return driver.findElement(loginButton);
	}

	public WebElement getSearchField() {
		return driver.findElement(searchField);
	}

	public WebElement getSearchButton() {
		return driver.findElement(searchButton);
	}

	public WebElement getHeader1() {
		return driver.findElement(header1);
	}

	public WebElement getHeader3() {
		return driver.findElement(header3);
	}

	public WebElement getCertifiedButoon() {
		return driver.findElement(getCertifiedButton);
	}

	public WebElement getAcceptCookies() {
		return driver.findElement(acceptCookies);
	}

	public String getTitle(WebDriver driver) {
		// driver.get(prop.getProperty("urlMain"));
		return driver.getTitle();
	}

	public List<String> GetHeaderOptionTitles(WebDriver driver) {
		List<String> optionTitles = new ArrayList<String>();
		for (WebElement option : driver.findElements(headerOptions)) {
			optionTitles.add(option.getText());
		}
		return optionTitles;
	}
	public WebElement getTutorialsButton () {
		return driver.findElement(tutorialsButton);
	}
	public WebElement getLearnJavaButton() {
		return driver.findElement(learnJavaButton);
	}
}
