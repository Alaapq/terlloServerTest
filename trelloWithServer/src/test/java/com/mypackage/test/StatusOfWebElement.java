package com.mypackage.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusOfWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		WebDriver driverchrome=new ChromeDriver();
		driverchrome.get("https://demo.nopcommerce.com/register");
		
		WebElement searchStore= driverchrome.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		System.out.println(searchStore.isDisplayed());
		System.out.println(searchStore.isEnabled());
		
		
	}

}
