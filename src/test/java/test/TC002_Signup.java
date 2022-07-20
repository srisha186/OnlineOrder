package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import base.BaseClass;
import utilities.Datautils;

public class TC002_Signup extends BaseClass {
	public WebDriverWait wait;

	//@Test(dataProvider="value",dataProviderClass=Datautils.class)
	@Test(dataProvider="signupform",dataProviderClass=Datautils.class,groups={"regression"})

	public void signup(String fname,String lname,String email,String phone) throws InterruptedException {
		WebElement login = driver.findElement(By.xpath("//span[contains(text(),'Log in/Sign up')]"));
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("automationdemo18@gmail.com");
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000);");
		driver.findElement(By.xpath("//div[@class='wo-signup-btn align-self-center']/button")).click();
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@data-product='web_widget']")));
		
		//1st name
		WebElement firstname=driver.findElement(By.xpath("//input[@id='mat-input-2']"));
				firstname.sendKeys(fname);
				//last
		driver.findElement(By.xpath("//input[@id='mat-input-3']")).sendKeys(lname);
		//email
		driver.findElement(By.xpath("//input[@id='mat-input-4']")).sendKeys(email);
		//phonenumber
		
		driver.findElement(By.xpath("//input[@id='mat-input-5']")).sendKeys(phone);
		driver.navigate().refresh();
		

//driver.findElement(By.id("mat-input-14")).sendKeys("auto");
//driver.findElement(By.id("mat-input-15")).sendKeys("auto");
//postal
//driver.findElement(By.id("mat-input-18")).sendKeys("auto");
	}
	
	
}
