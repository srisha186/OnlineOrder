package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseClass;

public class Order extends BaseClass {
	
	@Test(dependsOnMethods= {"test.TC_001.login"})
	public void orderNow() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='wo-navigation-item']//span[contains(text(),'Locations')]")).click();
	}
}


