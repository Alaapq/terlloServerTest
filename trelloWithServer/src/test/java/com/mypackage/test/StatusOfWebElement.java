package com.mypackage.test;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StatusOfWebElement {

	  @Test
	  public void f() throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		WebDriver driverchrome=new ChromeDriver();
		driverchrome.get("https://demo.nopcommerce.com/register");
		
		//WebElement searchStore= driverchrome.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		//System.out.println(searchStore.isDisplayed());
		//System.out.println(searchStore.isEnabled());
		
		
	}

}
