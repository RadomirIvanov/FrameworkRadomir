package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetCertPage {

	public WebDriver driver;
	
	By addToCartWebAppDevelop = By.cssSelector("add-to-cart[data-variant-id=\"40321656324153\"]");
	By webDevelopmentCourse = By.cssSelector("a[href=\"/collections/course-catalog/products/web-application-development-course\"]");
	By checkOutButton = By.cssSelector("button[class=\"button\"]");
	By continueToPaymentButton = By.cssSelector("main button[type='submit']");
	By courseCatalogText = By.cssSelector("div[class=\"collection-hero__text-wrapper\"]");
	By shopPagePopUpMessageButton = By.cssSelector("div.recommendation-modal__container button.recommendation-modal__button");
	By shoppingCartButton = By.cssSelector("svg[class=\"icon icon-cart\"]");
	By buyNowButton = By.cssSelector("button.shopify-payment-button__button"); //tag. chast ot klasa (spaces don't work, replace with DOT instead)
	By enterEmailErrorMessage = By.cssSelector("p#error-for-email");
	
	public GetCertPage(WebDriver driver) {
	
		this.driver=driver;
}
	
	public WebElement getAddToCartWebAppDevelop() {
		return driver.findElement(addToCartWebAppDevelop);
	}
	public WebElement getWebDevelopCourse() {
		return driver.findElement(webDevelopmentCourse);
	}
	public WebElement getCheckOutButton() {
		return driver.findElement(checkOutButton);
	}
	public WebElement getContinueToPaymentButton() {
		return driver.findElement(continueToPaymentButton);
	}
	public WebElement getCourseCatalogText() {
		return driver.findElement(courseCatalogText);
	}
	public WebElement getShopPopUpMessage() {
		return driver.findElement(shopPagePopUpMessageButton);
	}
	public WebElement getShoppingCartButton() {
		return driver.findElement(shoppingCartButton);
	}
	
	public WebElement getBuyNowButton() {
		return driver.findElement(buyNowButton);
	}
	
	public void ClickContinueToPayment() {
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("arguments[0].scrollIntoView(true);", getContinueToPaymentButton());
		getContinueToPaymentButton().click();
	}
	public WebElement getEnterEmailErrorMessage() {
		return driver.findElement(enterEmailErrorMessage);
	}
}
