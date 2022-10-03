package NewTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewTest {
  
	 
		
	 NewTest (WebDriver rdriver){
		   WebDriver ldriver;
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver//chromedriver.exe");
			ldriver=new ChromeDriver();
			
	 		//ldriver=rdriver;
	 		PageFactory.initElements(ldriver, this);
	 	}
	 	
	 	@FindBy(name = "uid")
	 	@CacheLookup
	 	WebElement txtUserName; 
	 	
	 	
	 	@FindBy(name = "password")
	 	@CacheLookup
	 	WebElement txtPassword; 
	 	
	 	
	 	@FindBy(name = "btnLogin")
	 	@CacheLookup
	 	WebElement btnLogin; 
	 	
	 	
	 	
	 	public void setUserName (String uname) {
	 		txtUserName.sendKeys(uname);
	 	}
	 	public void setPassword (String pwd) {
	 		txtPassword.sendKeys(pwd);
	 	}
	 	public void clickSub () {
	 		btnLogin.click();
	 		
	 		
	
		
}
	
	
}
