package pageObjects;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;
	public Properties prop;

	By logInHeader1 = By.cssSelector("#root > div > div > div:nth-child(4) > div.LoginModal_modal__1Yybs.LoginModal_show__F6L8A.LoginModal_full_page__PoJE0 > div > div:nth-child(1)");
	By emailField = By.cssSelector("input[id=\"modalusername\"]");
	By passwordField = By.cssSelector("input[id=\"current-password\"]");
	By loginButton = By.cssSelector("button[class=\"Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu\"]");
	By forgotPasswordButoon = By.cssSelector("a[href=\"https://profile.w3schools.com/reset\"]");
	By helpButton = By.cssSelector("button[aria-label=\"Help\"]");
	By showOrHidePasswordButton = By.cssSelector("span[class=\"PasswordInput_show_pwd_btn__Ncc9S\"]");
	By loginErrorMessage = By.cssSelector("span[class=\"EmailInput_email_error__IJxXf\"]");
	By pleaseEnterEmailTextErrorMessage = By.cssSelector("span[class=\"EmailInput_email_error__IJxXf\"]");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public WebElement getLoginHeader1() {
		return driver.findElement(logInHeader1);
	}

	public WebElement getEmailField() {
		return driver.findElement(emailField);
	}

	public WebElement getPasswordField() {
		return driver.findElement(passwordField);
	}

	public WebElement getLoginButton() {
		return driver.findElement(loginButton);
	}

	public WebElement getForgotPasswordButton() {
		return driver.findElement(forgotPasswordButoon);
	}

	public WebElement getHelpButton() {
		return driver.findElement(helpButton);
	}

	public WebElement getShowOrHidePasswordButton() {
		return driver.findElement(showOrHidePasswordButton);
	}
	
	public boolean IsLoginMessageDisplayed(WebDriver driver) {
		List<WebElement> errorMessage = driver.findElements(loginErrorMessage);
		if(errorMessage.size() > 0) {
			return true;
		}else {
			return false;
		}
	}
	public WebElement getPlsEnterEmailTextErrorMessage( ) {
		return driver.findElement(pleaseEnterEmailTextErrorMessage);
	}
}

