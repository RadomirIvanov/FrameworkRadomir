package baseAndResourses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import utility.CookiesHandler;

public class Base {
	public static WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws InvalidPropertiesFormatException, IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\rud\\eclipse-workspace\\FrameworkRadomir\\src\\main\\java\\baseAndResourses\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rud\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equals("IE")) {

		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return driver;
	}

	public void initialize(String URL) throws IOException {
		driver = initializeDriver();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty(URL));
		driver.manage().window().maximize();
		HandleCookies(driver);
	}

	public void HandleCookies(WebDriver driver) {
		CookiesHandler handler = new CookiesHandler(driver);
		handler.HandleCookies(driver);
	}

	public void getScreenshot(String result) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\screenshot\\" + result + "screen.png"));

	}

}
