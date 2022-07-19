package org.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	  public static WebDriver driver;
	
	
	      public static WebDriver chromeLaunch() {
              WebDriverManager.chromedriver().setup();
              return driver = new ChromeDriver();
              
	    	  
	    	  }
	      //url launch
	      public static void urlLaunch(String url) {
         driver.get(url);
	    	  
	    	  
	    	  }
	      //impwait
	     public static void impWait(int sec) {
          driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
          driver.manage().window().maximize();
		}
	      
	      
	      
	      public static void sendkeys(WebElement e, String data) {
          e.sendKeys(data);    	 
		}
	
	
	       public static void click(WebElement s) {
           s.click();
		 
	}
	
	   public static String getTitle() {
         
		String title = driver.getTitle();
		return title;
	}
	
	
	public static String getCurrentUrl() {
       String currentUrl = driver.getCurrentUrl();
	return currentUrl;
		
	}
	
	
	public static void simple() {
     
		Alert sim = driver.switchTo().alert();
		sim.accept();
		
	}
	
	
}
