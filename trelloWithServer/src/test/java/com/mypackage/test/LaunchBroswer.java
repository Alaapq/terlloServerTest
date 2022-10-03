package com.mypackage.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBroswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 // manuall aprach for Browsers
		 
		// for Chrome  Browser
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		WebDriver driverchrome=new ChromeDriver();
		driverchrome.get("https://frontend.nopcommerce.com/");
		
		
		/*
		// for Firefox  Browser
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Driver//geckodriver.exe");
		WebDriver drivergecko=new FirefoxDriver();
		drivergecko.get("https://frontend.nopcommerce.com/");
		
		
		// for Edge  Browser
		System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"//Driver//msedgedriver.exe");
		WebDriver driveredge=new EdgeDriver();
		drivergecko.get("https://frontend.nopcommerce.com/");
		
		 */
		
		
		/*
		 // Automatclly aprach for Browsers but not working 
		
		   WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver(); //Chrome Browser
			//WebDriver driver=new FirefoxDriver();//Firefox Browser
			//WebDriver driver= new EdgeDriver();//Edge Browser 
			driver.get("https://frontend.nopcommerce.com/");
		
		*/ 
		
		//System.out.println("Tile is "+driverchrome.getCurrentUrl());
		
		
		
	}

}
