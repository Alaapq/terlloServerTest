package com.mypackage.test;

import java.awt.AWTException;
import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class NewTestServer {
  @Test
  public void f() throws InterruptedException, AWTException {

	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver//chromedriver.exe");
	  String downloadFilepath="downloads";
	  File file =new File(downloadFilepath);
	 HashMap<String, Object> chromeprefs = new HashMap<String, Object>();
	  chromeprefs.put("profile.default_content_settings.popups", 0);
	   chromeprefs.put("download.default_directory", file.getAbsolutePath());
	    ChromeOptions options = new ChromeOptions();
	     options.setExperimentalOption("prefs", chromeprefs);
	      options.addArguments("--start-maximied");
	       options.addArguments("--headless");
	        options.addArguments("--disable-infobars");
	 	 	WebDriver driverchrome=new ChromeDriver(options);
	driverchrome.get("https://demo.nopcommerce.com/register");
	
	//WebElement searchStore= driverchrome.findElement(By.xpath("//input[@id='small-searchterms']"));
	
	//System.out.println(searchStore.isDisplayed());
	//System.out.println(searchStore.isEnabled());
	
  }
}
