package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseClass;

public class TC_001 extends BaseClass {
	public WebDriverWait wait;
	

@Test(groups={"smoke"})
public void login() throws InterruptedException {
	WebElement login=driver.findElement(By.xpath("//span[contains(text(),'Log in/Sign up')]"));
	wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(login));
	login.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("automationdemo18@gmail.com");
	Thread.sleep(1000);

	driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("sample@123");
	Thread.sleep(1000);

	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	
	String content=driver.findElement(By.xpath("//h1[contains(text(),'Getting your greens')]")).getText();
	Thread.sleep(1000);

	System.out.println(content);
	SoftAssert softassert=new SoftAssert();
	
	softassert.assertTrue(true, content);
	softassert.assertAll();
}

}
/*@FindBy(xpath = "//span[contains(text(),'Log in/Sign up')]")
@CacheLookup
public WebElement loginbtn;

@FindBy(xpath = "//input[@id='mat-input-0']")
@CacheLookup
public WebElement emailTxt;

@FindBy(xpath = "//input[@id='mat-input-1']")
public WebElement pwdText;

//@FindBy(xpath = "//button[contains(text(),'login')]")
@FindBy(xpath = "(//button[@type='submit'])[2]")
public WebElement loginsubmitbtn;

*/