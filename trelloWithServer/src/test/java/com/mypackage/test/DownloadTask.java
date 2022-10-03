package com.mypackage.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DownloadTask {
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
	 	WebDriver driverchrome=new ChromeDriver(options); //(option);
		  driverchrome.get("https://trello.com/login");
		    WebElement email = driverchrome.findElement(By.id("user"));
             email.sendKeys("phonea52s5g@gmail.com");
              WebElement loginbtn = driverchrome.findElement(By.id("login"));
               loginbtn.click();
                WebDriverWait wait = new WebDriverWait(driverchrome, 1000);
                 By addItem = By.xpath("//*[@id=\"password\"]");
                  WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(addItem));
                   wait.until(ExpectedConditions.stalenessOf(element));
                    wait.until(ExpectedConditions.presenceOfElementLocated(addItem)).sendKeys("123456789@asdfghjkl");
                     WebElement btn = driverchrome.findElement(By.xpath("//*[@id=\"login-submit\"]/span"));
                      btn.click(); 
                       Thread.sleep(5000);
                        WebElement createNewBrd1 = driverchrome.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/div/div/div[2]/div/div/div/div[2]/div/div[2]/ul/li[2]/div"));
                       createNewBrd1.click(); 
                       Thread.sleep(3000);
                      WebElement elementBrd = driverchrome.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/section[1]/div[1]/form[1]/div[1]/label[1]/input[1]"));
                     elementBrd.sendKeys("DownloadTsk");
                    WebElement createBtn = driverchrome.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/section[1]/div[1]/form[1]/button[1]"));
                   createBtn.click(); 
                  Thread.sleep(3000);
                 WebElement newList = driverchrome.findElement(By.xpath("//*[@id=\"board\"]/div/form/input"));
                newList.sendKeys("DownloadTsk");
               WebElement addNewListBtn = driverchrome.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/form[1]/div[1]/input[1]"));
              addNewListBtn.click();
             WebElement addNewCardBtn = driverchrome.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[3]/a[1]/span[2]"));
            addNewCardBtn.click();
           WebElement addNewCardTitle = driverchrome.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/textarea[1]"));
          addNewCardTitle.sendKeys("DownloadTsk");
         WebElement addNewBtn = driverchrome.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]"));
        addNewBtn.click();
       WebElement openCardTitle = driverchrome.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/a[1]"));
        openCardTitle.click();
         Thread.sleep(2000);
          WebElement clkAttaTitle = driverchrome.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/a[4]"));
           clkAttaTitle.click();
            Thread.sleep(4000);
             WebElement clkCompIcon = driverchrome.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/form[1]"));
              clkCompIcon.click();
               clkCompIcon.click();
                Thread.sleep(2000);
                  Robot rb = new Robot();
                   StringSelection str = new StringSelection("C:\\Users\\LENOVO\\Desktop\\Word 2016");
                    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
                      rb.keyPress(KeyEvent.VK_CONTROL); // press Contol+V for pasting
                       rb.keyPress(KeyEvent.VK_V);
                        rb.keyRelease(KeyEvent.VK_CONTROL);// release Contol+V for pasting
                         rb.keyRelease(KeyEvent.VK_V);
                          rb.keyPress(KeyEvent.VK_ENTER);// for pressing and releasing Enter
                           rb.keyRelease(KeyEvent.VK_ENTER);
                            Thread.sleep(20000);
                             WebElement clkDownload = driverchrome.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[4]/div[9]/div[2]/div[1]/div[1]"));
                              clkDownload.click();
                               Thread.sleep(5000);
                             //   cleaner(driverchrome);
                       
                       
                       // clkCompIcon.click();
                      // clkCompIcon.click();
                       //clkCompIcon.sendKeys("C:\\Users\\LENOVO\\Desktop\\Word 2016.exe");
                       
                    
                       //WebElement clkAttaIcon = driverchrome.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[4]/div[9]/div[2]/div[1]"));
                       //clkAttaIcon.sendKeys("C:\\Users\\LENOVO\\Desktop\\Word 2016.exe");
                       
                       
                      
                       
						/*
						 * WebDriverWait wait1 = new WebDriverWait(driverchrome,1000); By BrdTitle =
						 * By.xpath(
						 * "/html[1]/body[1]/div[3]/div[1]/section[1]/div[1]/form[1]/div[1]/label[1]/input[1]"
						 * ); WebElement elementBrdTitle =
						 * wait1.until(ExpectedConditions.presenceOfElementLocated(BrdTitle));
						 * wait1.until(ExpectedConditions.stalenessOf(elementBrdTitle));
						 * wait1.until(ExpectedConditions.presenceOfElementLocated(BrdTitle)).click();
						 * wait1.until(ExpectedConditions.presenceOfElementLocated(BrdTitle)).sendKeys(
						 * "DownloadTsk");
						 * wait1.until(ExpectedConditions.presenceOfElementLocated(BrdTitle)).sendKeys(
						 * "DownloadTsk");
						 */
                    
                      
                      
						/*
						 * WebDriverWait waitAfterLogin = new WebDriverWait(driverchrome, 1000); By
						 * createNewBrd = By.xpath(
						 * "//*[@id=\"content\"]/div/div[2]/div/div/div/div/div[2]/div/div/div/div[3]/div/div[2]/ul/li[2]/div/p/span"
						 * ); WebElement elementNewBrd =
						 * waitAfterLogin.until(ExpectedConditions.presenceOfElementLocated(createNewBrd
						 * )); waitAfterLogin.until(ExpectedConditions.stalenessOf(elementNewBrd));
						 * waitAfterLogin.until(ExpectedConditions.presenceOfElementLocated(createNewBrd
						 * )).click();
						 */
                      
                      
                      
		
		// xpath //*[@id="board"]/div[1]/div/div[2]/a/span
	  
	  
  }

private void cleaner(WebDriver driverchrome) throws InterruptedException {
	WebElement clkclose = driverchrome.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/div[1]/a[1]"));
	   clkclose.click();
	    Thread.sleep(5000);    
	     WebElement clkNameBoard = driverchrome.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/ul[1]/div[2]/li[2]/a[1]"));
	      clkNameBoard.click();	
	       WebElement clkdots = driverchrome.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/ul[1]/div[2]/li[2]/div[2]/div[1]/button[1]/span[1]/span[1]"));
	        clkdots.click();
	         WebElement clkCloseBoard = driverchrome.findElement(By.xpath("html[1]/body[1]/div[6]/div[1]/section[1]/div[1]/div[1]/button[1]"));
	          clkCloseBoard.click();
	           WebElement clkClose = driverchrome.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/section[1]/div[1]/button[1]"));
	           clkClose.click();
	          Thread.sleep(3000);
	         WebElement clkDeleteBoard = driverchrome.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]"));
	        clkDeleteBoard.click();	   
	       WebElement clkDelete = driverchrome.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/section[1]/div[1]/button[1]"));
	      clkDelete.click();
}
 
}
