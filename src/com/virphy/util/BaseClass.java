package com.virphy.util;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;

public class BaseClass {
	public static WebDriver driver;
	@Parameters("browser") 
  @BeforeClass
  public void configBrowser(String browser) {
	
		if(browser.equals("Firefox")) 
		{
			System.out.println("Firefox is Opening");
System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Libs\\geckodriver.exe");
	driver =new FirefoxDriver();
	} 
		else if(browser.equals("Chrome")) {
	      System.out.println("Chrome Browser is opening");
System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Libs\\chromedriver.exe");
		  driver =new ChromeDriver();
	  }
		else if(browser.equals("IE")) {
		System.out.println("IE Brower is opening");
//   System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\Libs\\IEDriverServer.exe");
  System.setProperty("webdriver.ie.driver","E:\\RaviEclipseWorkspace\\Virphy\\Libs\\IEDriverServer.exe");
         driver = new InternetExplorerDriver();
		}
		else
	  {
		System.out.println("Browser is matching");
	  }
	}
@AfterClass
  public void logOut() {
	System.out.println("Close All the browser");
	driver.quit();
  }
}


