package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class BaseClass {
	public static WebDriver driver;
	public static ChromeOptions option;
	

	@BeforeClass
	//@BeforeSuite
	public static void inisetup() {
		option=new ChromeOptions();
		option.setAcceptInsecureCerts(false);
		 System.setProperty("webdriver.chrome.driver","C://Driver//chromedriver.exe");
		 driver = new ChromeDriver(option);
		driver.get("https://freshii.tacitdev.ca/ca/en");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

	}
	@AfterClass
	//@AfterSuite
	public void tearDown() {
		driver.quit();
	}

	}
